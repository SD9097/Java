package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StringsStream {
	
	public static void main(String[] args) {
		
		String[] names = {"Adam","Daniel","Charles","Sergio","Lewis"};
		
//		Arrays.stream(names).forEach(System.out::println);
//		Stream.of(names).forEach(System.out::println);
		
//		Stream.of(names).sorted().forEach(System.out::println);
		
//		Stream.of(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		Stream.of(names).filter(x -> x.startsWith("L")).forEach(System.out::println);
		
	}

}
