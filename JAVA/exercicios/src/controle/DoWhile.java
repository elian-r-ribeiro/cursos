package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String value = "";
		
		do {
			System.out.println(
					"Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair?");
			
			value = input.nextLine();
		} while (!value.equalsIgnoreCase("por favor"));
		
		input.close();
	}
}
