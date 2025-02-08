package vt;

public class VirtualTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Started..."+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finish..."+Thread.currentThread().getName());
	}

	
	
}
