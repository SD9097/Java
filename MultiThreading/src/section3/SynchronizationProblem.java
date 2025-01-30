package section3;

public class SynchronizationProblem {

    //Every java object has so called intrinsic lock
    //A thread owns an intrinsic lock between time it has acquired the lock and time it has released the lock
    //As long as a thread has an intrinsic lock on an object, no other thread can acquire the intrinsic lock on that object
    //the other thread will block when it attempts to acquire the lock
    //The problem is that every object has a single monitor lock
    //If we have 2 independent synchronized methods than the threads have to wait for each other to release the lock
    //Here we are use Class level locking as it is a static method
    //Else we can use object level locking

    public static  int counter1 = 0;
    public  static int counter2 = 0;

    //Dont use synchronized keyword on method level rather use synchronized block
    public  static  void increment() {
        //class level locking
        synchronized (SynchronizationProblem.class) {
            counter1++;
        }

    }

    public  static synchronized   void increment1() {
        synchronized (SynchronizationProblem.class) {
            counter2++;
        }
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
                    increment1();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The counter is: "+counter1);
        System.out.println("The counter is: "+counter2);
    }

    public static void main(String[] args) {

        try {
            process();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
