package section1;

public class TimeSlicingAlgorithm {

    //Time Slicing Algorithm
    //Time slicing is a technique of dividing a task into smaller pieces,
    //Processing time for a single processor is shared among mulitple processes or threads
    //eg when there are two threads the process is divided into two pieces cpu will process one thread for some time then another thread'
    //When there are multiple processors(or cores), then all the threads are executed in parallel manner this is called parallelization
    //when the no of threads is greater than the no of cores then the cpu use time slicing algorithm else it will use parallelization


    //Advantages
    //we can design more responsive applications - we can do several operations concurrently
    //we can achieve better resource utilization(CPU Utilization). By default every java application is single threaded. We can utilize more CPU cores with multiple threads
    //we can improve performance - we can utilize more CPU cores and run threads in parallel

    //Disadvantages
    //threads are manipulating data that are located on the same memory area because they belong to same process synchronization is not that strong
    //not that easy to design and test mulithreaded applications
    //using mulitple threads is expensive - CPU has to save local data, application pointer etc. of the current thread and switch to another thread

}
