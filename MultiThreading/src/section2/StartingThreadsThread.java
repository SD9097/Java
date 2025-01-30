package section2;

class Runner5 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner 5 - "+i);
        }
    }
}

class Runner6 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner 6 - "+i);
        }
    }
}

public class StartingThreadsThread {

    //Thread class is a light-weight process
    //It will extend Thread class
    public static void main(String[] args) {

        Thread t1 = new Runner5();
        Thread t2 = new Runner6();

        t1.start();
        t2.start();


    }

}
