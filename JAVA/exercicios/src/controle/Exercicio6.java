package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		int randomNumber = random.nextInt(0, 101);
		boolean didPlayerSucceeded = false;

		for (int chancesCounter = 10; chancesCounter > 0; chancesCounter--) {
			System.out.printf("O sistema gerou um número aleatório entre 0 e 100, tente adivinhar qual é (você tem %d chance(s) restante(s)): ", chancesCounter);

			if (input.hasNextInt()) {
				int userTry = input.nextInt();

				if (userTry != randomNumber) {
					if (userTry < randomNumber) {
						System.out.println("O número que você digitou é menor que o número gerado pelo sistema!");
						continue;
					} else {
						System.out.println("O número que você digitou é maior que o número gerado pelo sistema!");
						continue;
					}
				} else {
					System.out.println("Você adivinhou!");
					didPlayerSucceeded = true;
					break;
				}
			} else {
				System.out.println("Você não digitou um número válido, sistema abortado!");
				break;
			}
		}
		
		if(!didPlayerSucceeded) {
			System.out.println("Mais sorte da próxima! :)");
		}

		input.close();
	}
}
