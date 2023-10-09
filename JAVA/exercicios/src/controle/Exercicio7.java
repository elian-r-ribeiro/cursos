package controle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		double totalNumbersSum = 0;

		while(true) {
			System.out.println("Digite um número (para encerra digite um número negativo): ");
			if(input.hasNextDouble()) {
				double userNumbersInput = input.nextDouble();
				if(userNumbersInput > 0) {
					totalNumbersSum += userNumbersInput;
					System.out.printf("A soma total dos números até agora é: %.2f\n", totalNumbersSum);
				}else {
					System.out.printf("A soma total dos números foi: %.2f\n", totalNumbersSum);
					break;
				}
				
			}else {
				System.out.println("Você digitou um número inválido, sistema abortado!");
				break;
			}
			
			
		}
		
		input.close();
	}
}
