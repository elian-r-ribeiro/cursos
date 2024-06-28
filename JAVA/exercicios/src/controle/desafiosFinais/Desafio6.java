package controle.desafiosFinais;

import java.util.Random;
import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		
		for(int i = 9; i >= 0; i--) {
			System.out.println("Digite um número: ");
			
			int userTry = input.nextInt();
			
			if(userTry == randomNumber) {
				System.out.println("Você acertou!");
				break;
			} else {
				System.out.println("Você errou!");
				System.out.println("Tentativas restantes: " + i);
				if(userTry > randomNumber) {
					System.out.println("O número é menor que o que você digitou!");
				} else {
					System.out.println("O número é maior que o que você digitou!");
				}
			}
		}
		
		System.out.println("O número correto era: " + randomNumber);
		
		input.close();
	}
}
