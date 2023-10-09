package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> books = new ArrayDeque<>();
		
		books.add("O Pequeno Príncipe");
		books.push("Don Quixote");
		books.add("O Hobbit");
		books.push("Eragon");
		
		for(String book: books) {
			System.out.println(book);
		}
		
		System.out.println(books.peek());
		System.out.println(books.element());
		
		System.out.println(books.poll());
		System.out.println(books.remove());
		System.out.println(books.pop());
		System.out.println(books.poll());
		System.out.println(books.remove());
		System.out.println(books.pop());
		
		// queue.size();
		// queue.clear();
		// queue.isEmpty();
		// queue.contains(...);
		
		
	}
}
