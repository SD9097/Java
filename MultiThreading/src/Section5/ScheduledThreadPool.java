package Section5;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.*;

class StockMarketUpdate implements Runnable{

    @Override
    public void run() {
        System.out.println("Updating and downloading stock related data from web...");
    }
}

public class ScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
       // executor.scheduleAtFixedRate(new StockMarketUpdate(),1000,2000,TimeUnit.MILLISECONDS);
    }

}
