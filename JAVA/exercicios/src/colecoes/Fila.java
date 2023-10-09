package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		// Offer e add -> adicionam elementos na fila
		queue.add("Ana");
		queue.offer("Bia");
		queue.add("Carlos");
		queue.offer("Daniel");
		queue.add("Rafaela");
		queue.offer("Gui");

		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue.element());

		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		// queue.size();
		// queue.clear();
		// queue.isEmpty();
		// queue.contains(...);
	}
}
