package desafiosFinais;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		
		double tempC = input.nextDouble();
		double tempF = tempC * 1.8 + 32;
		
		System.out.println("Valor em Farenheit: " + tempF);
		
		input.close();
	}
}
