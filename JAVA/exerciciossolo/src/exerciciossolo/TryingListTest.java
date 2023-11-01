package exerciciossolo;

import java.util.List;
import java.util.Scanner;

public class TryingListTest {
	static void mainProgram(Scanner input, List<String> list) {
		while (true) {
			int userChoice = askUserChoice(input);

			switch (userChoice) {
			case 1:
				addTaskToList(list, input);
				break;
			case 2:
				removeTaskFromList(list, input);
				break;
			case 3:
				seeAllTasksList(list);
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
		System.out.print("[1]Registrar tarefa a ser feita\n[2]Concluir tarefa\n[3]Ver lista de tarefas\n[4]Encerrar programa\nEscolha a opção:");
		int userInputChoice = input.nextInt();
		input.nextLine();
		return userInputChoice;
	}

	static void addTaskToList(List<String> list, Scanner input) {
		System.out.print("Digite a tarefa á ser adicionada: ");
		String taskToAddInput = input.nextLine();
		System.out.printf("Tarefa \"%s\" adicionada á lista de tarefas.\n", taskToAddInput);
		list.add(taskToAddInput);
	}

	static void removeTaskFromList(List<String> list, Scanner input) {
		if(list.isEmpty()) {
			System.out.println("A lista de tarefas está vazia.");
		} else {
			seeAllTasksList(list);
			System.out.print("Digite o número da tarefa que deseja remover: ");
			int taskRemovalIdInput = input.nextInt() - 1;
			System.out.printf("Tarefa \"%s\" removida da lista de tarefas.\n", list.get(taskRemovalIdInput));
			list.remove(taskRemovalIdInput);
		}
	}

	static void seeAllTasksList(List<String> list) {
		if (list.isEmpty()) {
			System.out.println("A lista de tarefas está vazia.");
		} else {
			System.out.println("===============================");
			for (int counter = 0; counter < list.size(); counter++) {
				System.out.printf("[%d]%s\n", counter + 1, list.get(counter));
			}
			System.out.println("===============================");
		}
	}
}
