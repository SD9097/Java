package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingFilesWithStream {

	public static void main(String[] ss) throws IOException {
		String path = "E:/Git Java/StreamAPI/src/stream/names";
		
		Stream<String> namesStream = Files.lines(Paths.get(path));
		List<String> names = namesStream.filter(n -> n.startsWith("S")).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
	
}
