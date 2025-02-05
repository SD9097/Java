package stream;

import java.util.stream.LongStream;

public class Parallelization {
	
	public static void main(String[] args) {
		//under hood fork join framework is used
		long now = System.currentTimeMillis();
		System.out.println(sum(1000000000));
		System.out.println("Time taken with sequential approach: "+ (System.currentTimeMillis() - now));
		
		now = System.currentTimeMillis();
		System.out.println(parallelSum(1000000000));
		System.out.println("Time taken with parallel approach: "+ (System.currentTimeMillis() - now));
	}
	
	private static long sum(long n) {
		return LongStream.rangeClosed(1, n).reduce(0, Long::sum);
	}
	
	private static long parallelSum(long n) {
		return LongStream.rangeClosed(1, n).parallel().reduce(0, Long::sum);
	}

}
