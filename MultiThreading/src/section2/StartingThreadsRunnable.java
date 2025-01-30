package section2;

//When implemented Runnable we have to override the run method and implement logic in it
class Runner3 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Runner 1 - "+i);
        }
    }
}

class Runner4 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Runner 2 - "+i);
        }
    }
}

public class StartingThreadsRunnable {

    //Runnable is a functional interface
    //Runnable is an interface that represents a task that can be executed by a thread
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner3());
        Thread t2 = new Thread(new Runner4());

        t1.start();
        t2.start();
    }


}
