package section2;

public class ThreadPriorityAndScheduler {

    //Thread Scheduler
    //Time Slicing Algorithm is handled by the thread scheduler

    //Thread priority
    //The priority of a thread can be set using the setPriority method
    //we can set the priority of a thread from 1 to 10

    //The default priority of a thread is 5
    //Minimum priority is 1
    //Maximum priority is 10
    //Threads with higher priority will be executed first and those with lower priority will be executed last
    //Threads with same priority will be executed on a first come first serve basis the thread scheduler store the threads in queue
    //priority depends on OS
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker1());
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println("This is in the main thread...");
    }

}

class Worker1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Worker 1 - "+i);
        }
    }
}
