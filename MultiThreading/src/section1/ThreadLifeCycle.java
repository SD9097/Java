package section1;

public class ThreadLifeCycle {

    //New State
    //Every thread is in new state until we call the start() method

    //Active State
    //when we call the start() method on the given thread there are two sub states: runnable and running

    //Runnable State
    //when a thread is in runnable state it is ready to execute

    //Running State
    //when a thread is in running state it is executing

    //Blocked / Waiting State
    //when we call the join() method or when a thread is waiting for another thread to finish. No CPU cycles are consumed in this state

    //Terminated State
    //when a thread has finished its task

}
