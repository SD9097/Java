package fj;

import java.util.concurrent.ForkJoinPool;

public class TaskApp {
	
	public static void main(String[] s) {
		ForkJoinPool pool = new ForkJoinPool();
		SimpleRecursiveTask task = new SimpleRecursiveTask(200);
		System.out.println(pool.invoke(task));
	}
	

}
