package controle;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int divisorCounter = 0;

		System.out.println("Digite um número: ");
		int numberInput = input.nextInt();

		if (numberInput <= 1) {
			divisorCounter++;
		} else {
			for (int i = 2; i <= Math.sqrt(numberInput); i++) {
				if (numberInput % i == 0) {
					divisorCounter++;
					break;
				}
			}
		}

		switch (divisorCounter) {
		case 0:
			System.out.println("O número digitado é um número primo!");
			break;
		default:
			System.out.println("O número digitado não é um número primo");
		}

		input.close();
	}
}
