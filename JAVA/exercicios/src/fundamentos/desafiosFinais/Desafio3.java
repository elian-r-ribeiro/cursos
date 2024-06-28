package fundamentos.desafiosFinais;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		
		double weight = input.nextDouble();
		input.nextLine();
		
		System.out.print("Digite sua altura: ");
		
		double height = input.nextDouble();
		double bmi = weight / (height * height);
		
		System.out.println("IMC: " + bmi);
		
		input.close();
	}
}
