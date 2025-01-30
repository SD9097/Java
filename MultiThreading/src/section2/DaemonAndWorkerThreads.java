package section2;

public class DaemonAndWorkerThreads {

    //A thread in java can be a so called daemon thread or a standard worker thread

    //When a java program starts then one thread begins running immediately called the main thread it starts the main method

    //We can create child threads from main thread. The main thread is the last thread to finish execution because it performs various shutdown operations.

    //daemon thread are intended as helper threads that perform background tasks and are not required to be executed at the same time as the main thread
    //eg - garbage collector, file system watcher, etc

    //the child thread we can decide to make it a daemon thread or not
    //daemon thread are low priority threads that run in the background to perform task such as garbage collection
    //usually we create daemon threads for I/O operations or services(smartphone services such as NFC, Bluetooth, etc)
    //daemon threads are terminated by JVM when all other worker threads are terminated
    //so this is  the main difference: worker threads are not terminated while daemon threads are interrupted by JVM

    public static void main(String[] args) {
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
        Thread t1 = new Thread(new DaemonWorker());
        Thread t2 = new Thread(new NormalWorker());
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }

}

class DaemonWorker implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon Thread is running...");
        }

    }
}

class NormalWorker implements Runnable{

    @Override
    public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Normal Thread finsihes execution...");


    }
}
