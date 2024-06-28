package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");

		String dayName = input.nextLine();

		if (dayName.equalsIgnoreCase("Domingo")) {
			System.out.println("Valor 1!");
		} else if (dayName.equalsIgnoreCase("Segunda")) {
			System.out.println("Valor 2!");
		} else if (dayName.equalsIgnoreCase("Terça")) {
			System.out.println("Valor 3!");
		} else if (dayName.equalsIgnoreCase("Quarta")) {
			System.out.println("Valor 4!");
		} else if (dayName.equalsIgnoreCase("Quinta")) {
			System.out.println("Valor 5!");
		} else if (dayName.equalsIgnoreCase("Sexta")) {
			System.out.println("Valor 6!");
		} else if (dayName.equalsIgnoreCase("Sábado")) {
			System.out.println("Valor 7!");
		} else {
			System.out.println("Dia inválido!");
		}
		
		input.close();
	}
}
