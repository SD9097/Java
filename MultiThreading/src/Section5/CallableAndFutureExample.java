package Section5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

class Processor implements Callable<String> {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Id: "+id;
    }
}

public class CallableAndFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Future<String> ls = service.submit(new Processor(i+1));
            list.add(ls);
//            System.out.println(list.size());
        }

        for(Future<String> f : list){
            System.out.println(f.get());
        }

        service.shutdown();

    }

}
