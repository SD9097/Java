package section3;

class Process{
    public void produce () throws InterruptedException{

        synchronized (this){
            System.out.println("Running produce()");
            wait();
            System.out.println("Again in producer method");
        }

    }

    public void consume () throws InterruptedException{

        Thread.sleep(1000);

        synchronized (this){
            System.out.println("Running consume()");
            notify();
        }

    }
}

public class WaitAndNotify {

    //Threads can communicate with each other using wait and notify
    //But threads should lock on the same intrinsic lock
    public static void main(String[] args) {
        Process process = new Process();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();


    }

}
