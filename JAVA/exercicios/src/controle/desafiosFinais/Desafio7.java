package controle.desafiosFinais;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int inputNumber = 0;
		int total = 0;
		
		do {
			System.out.println("Digite um número (negativo para sair): ");
			inputNumber = input.nextInt();
			if(inputNumber > 0) {
				total += inputNumber;
			}
		} while (inputNumber > 0);
		
		System.out.println("Soma final: " + total);
		
		input.close();
	}
}
