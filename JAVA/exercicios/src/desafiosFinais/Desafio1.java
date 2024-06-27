package desafiosFinais;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		
		double tempF = input.nextDouble();
		double tempC = (tempF - 32) / 1.8;
		
		System.out.println("O valor em Celsius é: " + tempC);
		
		input.close();
	}
}
