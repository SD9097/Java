package Section5;

public class Executors {

    //With the increase in number of the cores available in the processors, multithreading is getting more and more important.
    //Java provides it own multithreading framework called Executor Framework.
    //with the help of this framework, we can manage worker threads more efficiently because of thread pools.

    //It will handle everything: scheduling and execute the submitted tasks
    //creating and managing thread is expensive task
    //adding a new thread for each process leads to the creation of a large numbers of threads
    //These threads need memory + CPU will spend too much time switching context when the threads are swapped
    //Thread pools can reuse threads in an extremely efficient manner by keeping the threads alive and reusing them.
    //Thread pools are usually queued based on a first come first serve basis

    //There are 4 types of Executors:
    //SingleThreadExecutor
    //This executor has a single thread so we can execute processes in a sequential manner. Every process is executed by a new thread.

    //FixedThreadPool
    //This is how we create a thread pool with n threads. Usually n is the number of cores in the CPU.
    //If there are more tasks than n then these tasks are stored with a LinkedBlockingQueue data structure.

    //CachedThreadPool
    //The number of threads is not bounded: if all the threads are busy executing some tasks and new task come the pool will create and add
    //a new thread to the executor.
    //If a thread remains idle  for 60 seconds then it will be removed from the pool.
    //It is used for short parallel tasks

    //ScheduledThreadPool
    //We can execute a given operation at regular intervals or we can use this executor if we wish to delay a certain task

}
