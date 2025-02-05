package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumbersStream {
	
	public static void main(String args[]) {
		
		int[] nums = {1,5,3,-2,9,12};
		
		//lambda expression
		//:: operator or method reference
//		Arrays.stream(nums).forEach(System.out::println);
		
//		int sum = Arrays.stream(nums).sum();
//		System.err.println(sum);
		
//		IntStream.range(0, 5).forEach(System.out::println);
		
		IntStream.range(0, 10).filter(x -> (x > 4)).forEach(System.out::println);
		
	}

}
