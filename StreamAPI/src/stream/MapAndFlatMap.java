package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
		books.add(new Book("The trial","Franz Kafka",240,Type.NOVEL));
		books.add(new Book("Death on The Nile","Agatha Christie",370, Type.HISTORY));
		books.add(new Book("Ancient Greec","Robert F.",435,Type.HISTORY));
		books.add(new Book("Ancient Rome","Robert F.",860,Type.HISTORY));
		books.add(new Book("Death of Virgil","Hermann Broch",590, Type.NOVEL));
		books.add(new Book("The Stranger","Albert Camus",560,Type.NOVEL));
	
		//map and flatMap() are similiar to selecting column in SQL
//		List<String> words = Arrays.asList("Adam","Ana","Daniel");
//		List<Integer> len = words.stream().map(String::length).collect(Collectors.toList());
//		len.forEach(System.out::println);
//		
//		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//		List<Integer> squares = nums.stream().map(num -> num*num).collect(Collectors.toList());
//		squares.forEach(System.out::println);
//		
//		String[] array = {"hello", "shell"};
//		List<String> unique = Arrays.stream(array).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//		unique.stream().forEach(System.out::println);
		
		List<Integer> nums1 = Arrays.asList(1, 2, 3);
		List<Integer> nums2 = Arrays.asList(4, 5);
				
		List<List<Integer>> pairs = nums1.stream()
						.flatMap(i -> nums2.stream().map(j -> Arrays.asList(i, j)))
						.collect(Collectors.toList());
				
		System.out.println(Arrays.toString(pairs.toArray()));
		
	}

}
