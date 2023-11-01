package exerciciossolo;

import java.util.Queue;
import java.util.Scanner;

public class TryingQueueTest {

	static void mainProgram(Scanner input, Queue<Long> queue) {
		while (true) {
			int userChoice = askUserChoice(input);
			switch (userChoice) {
			case 1:
				addPersonToQueue(queue, input);
				break;
			case 2:
				removePersonFromQueue(queue, input);
				break;
			case 3:
				seeAllPeoploInQueue(queue);
				break;
			case 4:
				System.out.println("Encerrando programa, até mais. :)");
				return;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	static int askUserChoice(Scanner input) {
		System.out.print("[1]Chegou uma pessoa na fila\n[2]Uma pessoa da fila foi atendida\n[3]Ver pessoas na fila\n[4]Encerrar programa\nEscolha a opção: ");
		int userInputChoice = input.nextInt();
		return userInputChoice;
	}

	static void addPersonToQueue(Queue<Long> queue, Scanner input) {
		System.out.println("Digite o CPF da pessoa: ");
		Long taxIdNumber = input.nextLong();
		queue.add(taxIdNumber);
		System.out.printf("A pessoa de CPF %d chegou na fila.\n", taxIdNumber);
	}

	static void removePersonFromQueue(Queue<Long> queue, Scanner input) {
		if (queue.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.printf("A pessoa de CPF %d foi atendida.\n", queue.poll());
		}

	}

	static void seeAllPeoploInQueue(Queue<Long> queue) {
		if (queue.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println(queue);
		}
	}
}
