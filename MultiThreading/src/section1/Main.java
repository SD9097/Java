package section1;

public class Main {
    public static void main(String[] args) {
        //By default, programming languages are sequential which means they execute the commands one by one.

        /*
        eg
        initializeArray();
        downloadData(); //This will take a long time. In a single threaded application these operations are executed one after the other
        //Time Consuming operations may freeze the entire application
        buildModel();
        makePrediction();
         */

        //the most crucial reason for multithreading is to separate mulitple(time consuming) tasks-tasks that might be subject to interruption by executing other tasks

        //Mutlithreading is the ability of a computer to execute multiple tasks at the same time.

        //1. Processes : a process is an instance of a program

        //2. Threads : a thread is essentially a light-weight process
        //A thread is a unit of execution within a process so a single process can have multiple threads
        //Each thread in a process share the same memory and resources and this is why programmers have to deal with concurrent programming
    }
}