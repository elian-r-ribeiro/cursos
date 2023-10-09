package controle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");

		if (input.hasNextInt()) {
			int userInputNumber = input.nextInt();

			if (userInputNumber <= 10 && userInputNumber >= 0) {
				System.out.println("O número digitado está entre 0 e 10");
			} else {
				System.out.println("O número digitado não está entre 0 e 10");
			}

			if (userInputNumber % 2 == 0) {
				System.out.println("O número digitado é um número par");
			} else {
				System.out.println("O número digitado é um número ímpar");
			}
		} else {
			System.out.println("O número digitado não é um número inteiro válido!");
		}

		input.close();
	}
}
