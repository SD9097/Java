package Section5;

public class RunnableAndCallableInterfaces {

    //Runnable and Callable both run on a different threads than the calling thread but Callable can return a value and Runnable cannot

    //Runnable: a so called run-and-forget action. We execute a given operation in the run() method without a return value

    //Callable<T>: we use Callable interface's call() method if we want to return a given value from the given thread
    //Callable interface will not return the value: this is why we need Future<T> object
    //Calling thread will be blocked till the call() method is executed and Future<T> returns with the results

    //ExecutorService can handle both Runnable and Callable interfaces
    //executorService.execute This method executes a Runnable interface so it means there is no return value
    //executorService.submit This method executes a Runnable and Callable interface so it means there is a return value
    //It can handle Future<T> return value and we can get T value with get() on the future object
}
