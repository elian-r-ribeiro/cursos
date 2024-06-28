package controle.desafiosFinais;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int number = input.nextInt();
		
		if(number <= 10 || number >= 0) {
			System.out.println("Ele está entre 0 e 10!");
		} else {
			System.out.println("Ele não está entre 0 e 10!");
		}
		
		if(number % 2 == 0) {
			System.out.println("É um número par!");
		} else {
			System.out.println("É um número ímpar!");
		}
		
		input.close();
	}
}
