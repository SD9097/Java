package Section5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable{

    private int id;

    public Task1(int id) {
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println("Task with id "+id+" is in work - thread id: "+Thread.currentThread().getName());
        long duration = (long) Math.random() * 5;
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 5; i++){
            executor.execute(new Task1(i));
        }

        //Application is not terminated as the executor is still running we need to shutdown the executor
        executor.shutdown();

//        try{
//            if(!executor.awaitTermination(1000,java.util.concurrent.TimeUnit.MILLiSECONDS)){
//
//            }
//        }catch (Exception e){
//            executor.shutdownNow();
//        }

    }

}
