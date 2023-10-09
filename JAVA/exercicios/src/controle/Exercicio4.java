package controle;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo: ");

		while (true) {
			if (input.hasNextInt()) {

				int number = input.nextInt();

				if (number <= 1) {
					System.out.println("O número digitado não é um número primo!");
				} else {
					boolean isPrime = true;
					for (int i = 2; i <= Math.sqrt(number); i++) {
						if (number % i == 0) {
							isPrime = false;
							break;
						}
					}

					if (isPrime) {
						System.out.println("O número digitado é um número primo!");
					} else {
						System.out.println("O número digitado não é um número primo!");
					}
				}
				break;
			} else {
				System.out.println("É necessário ser um número inteiro!");
			}
		}

		input.close();
	}
}
