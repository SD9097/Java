package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectStream {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
		books.add(new Book("The trial","Franz Kafka",240,Type.NOVEL));
		books.add(new Book("Death on The Nile","Agatha Christie",370, Type.HISTORY));
		books.add(new Book("Ancient Greec","Robert F.",435,Type.HISTORY));
		books.add(new Book("Ancient Rome","Robert F.",860,Type.HISTORY));
		books.add(new Book("Death of Virgil","Hermann Broch",590, Type.NOVEL));
		books.add(new Book("The Stranger","Albert Camus",560,Type.NOVEL));
	
//		books.stream().filter(book -> book.getTitle().split(" ").length == 2).forEach(System.out::println);
		
		//It will take item that are close to each other in memory
		//It is called internal iteration
		List<String> titles = books.stream().map(Book::getTitle).collect(Collectors.toList());
		titles.stream().forEach(System.out::println);
	
		//Standard iteration use external approach it goes sequentially
	}
	
}
