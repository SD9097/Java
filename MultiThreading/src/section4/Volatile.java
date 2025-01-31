package section4;

class Worker implements Runnable {

    //It will be stored in main memory ram and not in cache of thread
    private volatile boolean terminated;
    @Override
    public void run() {
        while (!terminated) {
            System.out.println("Working class in running...");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }
}

public class Volatile {

    //Every read of volatile variable is read from ram
    //Every write to volatile variable is written to ram
    //Usually variables are cached for performance reason
    //caches are faster than main memory

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();

        Thread t1 = new Thread(worker);
        t1.start();

        Thread.sleep(3000);

        worker.setTerminated(true);
        System.out.println("Algorithm is terminated");
    }
}
