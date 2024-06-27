package desafiosFinais;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		
		double base = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Digite o valor da altura: ");
		
		double height = input.nextDouble();
		double area = (base * height) / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		input.close();
	}
}
