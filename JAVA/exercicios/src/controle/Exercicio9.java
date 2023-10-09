package controle;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int highestValue = 0;
		int counter = 0;
		
		do {
			System.out.println("Digite um número inteiro positivo: ");
			
			if(input.hasNextInt()) {
				int userNumberInput = input.nextInt();
				
				if(userNumberInput > highestValue) {
					highestValue = userNumberInput;
				}
				
				counter++;
			}else {
				System.out.println("Número digitado é inválido!");
				input.next();
			}
			
		}while(counter != 10);
		
		System.out.println("O maior valor foi: " + highestValue);
		
		input.close();
	}
}
