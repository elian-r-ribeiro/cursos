package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Digite um dia da semana:");
		String userInput = input.next();
		userInput = userInput.replace('ç', 'c');
		userInput = userInput.replace('á', 'a');
		
		if(userInput.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}else if(userInput.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if(userInput.equalsIgnoreCase("terca")) {
			System.out.println(3);
		}else if(userInput.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if(userInput.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if(userInput.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if(userInput.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido!");
		}
		
		input.close();
	}
}
