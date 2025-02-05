package fj;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class MaxApp {

	public static void main(String[] args) {
		
		long[] nums = createNumbers(250000000);
		
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		
		ForkJoinPool pool = new ForkJoinPool(numOfThreads);
		
		SequentialMaxFinding sequential = new SequentialMaxFinding();
		
		long start = System.currentTimeMillis();
		System.out.println("Max: "+ sequential.max(nums));
		System.out.println("Time: "+ (System.currentTimeMillis() - start));
		
		ParallelMaxTask parallel = new ParallelMaxTask(nums, 0, nums.length);
		start = System.currentTimeMillis();
		
		System.out.println("Max: "+ pool.invoke(parallel));
		System.out.println("Time: "+ (System.currentTimeMillis() - start));

	}
	
	private static long[] createNumbers(int n) {
		Random random = new Random();
		
		long[] nums = new long[n];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(1000);
		}
		
		return nums;
	}

}
