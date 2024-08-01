package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> approved = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando foreach");
		for(String name: approved) {
			System.out.println(name);
		}
		
		System.out.println("Usando Iterator");
		Iterator<String> iterator = approved.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Usando Stream");
		Stream<String> stream = approved.stream();
		
		stream.forEach(System.out::println);
	}
}
