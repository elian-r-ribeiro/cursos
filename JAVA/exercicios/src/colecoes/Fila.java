package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		// offer e add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		// Offer retorna verdadeiro ou falso
		// Add lança uma exceção
		queue.add("Ana");
		queue.offer("Bia");
		queue.add("Carlos");
		queue.offer("Daniel");
		queue.add("Rafaela");
		queue.offer("Gui");
		
		// peek e element -> Mostram o próximo da fila sem remover
		// Diferença é o comportamento quando a fila está vazia
		// peek retorna null
		// element lança uma exceção
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		// poll e remove -> Pegam e removem o próximo da fila
		// Diferença é o comportamento quando a fila está vazia
		// poll retorna null
		// remove lança uma exceção
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
	}
}
