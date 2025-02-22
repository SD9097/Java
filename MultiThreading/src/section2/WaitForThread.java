package section2;

class Runner7 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner 7 - "+i);
        }
    }
}

class Runner8 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner 8 - "+i);
        }
    }
}

public class WaitForThread {

    //wait for a thread to complete with join method
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner7());
        Thread t2 = new Thread(new Runner8());

        t1.start();
        t2.start();

        t1.join(); // this will wait for the thread t1 to complete before executing the next line of code
        t2.join(); // this will wait for the thread t2 to complete before executing the next line of code

        System.out.println("Finished with threads...");
    }

}
