package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
		books.add(new Book("The trial","Franz Kafka",240,Type.NOVEL));
		books.add(new Book("Death on The Nile","Agatha Christie",370, Type.HISTORY));
		books.add(new Book("Ancient Greec","Robert F.",435,Type.HISTORY));
		books.add(new Book("Ancient Rome","Robert F.",860,Type.HISTORY));
		books.add(new Book("Death of Virgil","Hermann Broch",590, Type.NOVEL));
		books.add(new Book("The Stranger","Albert Camus",560,Type.NOVEL));
	
//		System.out.println(books.stream().count());
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		Optional<Integer> result = nums.stream().reduce(Integer::max);
		System.out.println(result);
		nums.stream().reduce(Integer::min).ifPresent(System.out::println);
		
		books.stream().map(Book::getPages).reduce(Integer::max).ifPresent(System.out::println);
		
		Optional<Book> book = books.stream().reduce((b1,b2) -> b1.getPages() > b2.getPages() ? b1 : b2);
		book.ifPresent(System.out::println);
		
		int totalPages = books.stream().mapToInt(Book::getPages).sum();
		System.err.println(totalPages);
		
	}

}
