package fj;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class App {
	
	public static void main(String[] args) {
		
//		System.out.println(Runtime.getRuntime().availableProcessors());
		
		ForkJoinPool pool = new ForkJoinPool(); 
		SimpleRecursiveAction action = new SimpleRecursiveAction(800);
		action.invoke();
		
		PrintingIntegers action1 = new PrintingIntegers(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		action1.invoke();
	}

}
