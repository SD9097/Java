package section3;

//If we increment variable directly there is chance that it will update the same data by multiple threads
//To avoid this we use synchronized and created a method to update the variable
//The operation will be done by only one thread at a time and then only other thread can use it
public class Synchronization {

    public static  int counter = 0;

    public  static synchronized   void increment() {
        counter++;
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The counter is: "+counter);
    }

    public static void main(String[] args) {

        try {
            process();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
