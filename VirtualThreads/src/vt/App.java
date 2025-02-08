package vt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		//approach 1
		/*
		var builder = Thread.ofVirtual().name("virtual-",0);
		var t1 = builder.start(new VirtualTask());
		var t2 = builder.start(new VirtualTask());
		
		//All virtual threads are daemon thread
		t1.join();
		t2.join();
		*/
		
		//approach 2
		/*
		var factory = Thread.ofVirtual().name("virtual-",0).factory();
		var t1 = factory.newThread(new VirtualTask());
		var t2 = factory.newThread(new VirtualTask());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		*/
		
		//try with resource approach it will not terminate till complete we dont have to use join
		try(var executor = Executors.newVirtualThreadPerTaskExecutor()){
			executor.submit(new VirtualTask());
			executor.submit(new VirtualTask());
			executor.submit(new VirtualTask());
		}
	}

}
