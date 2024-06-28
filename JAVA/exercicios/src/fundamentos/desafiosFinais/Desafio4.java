package fundamentos.desafiosFinais;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		
		double value = input.nextDouble();
		double squared = Math.pow(value, 2);
		double cubed = Math.pow(value, 3);
		
		System.out.println("Ao quadrado: " + squared);
		System.out.println("Ao cubo: " + cubed);
		
		input.close();
	}
}
