package section3;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {

    private List<Integer> list = new ArrayList<>();
    private  static final int UPPER_LIMIT = 5;
    private  static final int LOWER_LIMIT = 0;

    private final Object lock = new Object();

    private int value = 0;

    public void producer () throws InterruptedException{

        synchronized (lock){
            while(true){
                if(list.size() == UPPER_LIMIT){
                    System.out.println("Waiting for removing items...");
                    lock.wait();
                }else{
                    System.out.println("Adding: "+value);
                    list.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }

    }

    public void consumer () throws InterruptedException{

        synchronized (lock){
            while(true){
                if(list.size() == LOWER_LIMIT){
                    System.out.println("Waiting for adding items...");
                    value = 0;
                    lock.wait();
                }else{
                    System.out.println("Remove: "+list.remove(list.size()-1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }

    }


    public static void main(String[] args) {
        ProducerAndConsumer processor = new ProducerAndConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

    }
}

//In this for each iteration the notify will trigger but it will not notify instantly but will wait for other operation then in while
//it check the condition and do operation until it hit wait condition then the previous notify will be triggered
