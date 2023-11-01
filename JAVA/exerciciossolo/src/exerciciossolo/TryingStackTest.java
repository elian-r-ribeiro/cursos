package exerciciossolo;

import java.util.Deque;
import java.util.Scanner;

public class TryingStackTest {

	static void mainProgram(Scanner input, Deque<String> stack) {
		while (true) {
			int userInputChoice = TryingStackTest.askUserChoice(input);

			switch (userInputChoice) {
			case 1:
				TryingStackTest.addBookToStack(stack, input);
				break;
			case 2:
				TryingStackTest.removeBookFromStack(stack);
				break;
			case 3:
				TryingStackTest.seeAllBooksOnStack(stack);
				break;
			case 4:
				System.out.println("Saindo do programa, até mais. :)");
				return;
			default:
				System.out.println("Opção inválida.");
			}

		}
	}

	static int askUserChoice(Scanner input) {
		System.out.print("[1]Adicionar livro á pilha\n[2]Remover um livro da pilha\n[3]Ver livros na pilha\n[4]Encerrar programa\nEscolha a opção:");
		int userInputChoice = input.nextInt();
		input.nextLine();
		return userInputChoice;
	}

	static void addBookToStack(Deque<String> stack, Scanner input) {
		System.out.println("Digite o nome do livro que deseja adicionar á pilha: ");
		String bookNameToAdd = input.nextLine();
		stack.add(bookNameToAdd);
		System.out.printf("O livro %s foi adicionado á pilha.\n", bookNameToAdd);
	}

	static void removeBookFromStack(Deque<String> stack) {
		if (stack.isEmpty()) {
			System.out.println("Não há livros na pilha.");
		} else {
			System.out.printf("O livro %s foi removido da pilha.\n", stack.pollLast());
		}

	}

	static void seeAllBooksOnStack(Deque<String> stack) {
		if (stack.isEmpty()) {
			System.out.println("Não há livros na pilha.");
		} else {
			System.out.println(stack);
		}

	}

}
