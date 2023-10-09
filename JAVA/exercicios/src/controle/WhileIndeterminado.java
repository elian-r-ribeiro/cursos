package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userMessage = "";
		
		while(!userMessage.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma mensagem (Digite 'sair' para sair): ");
			userMessage = input.nextLine();
			System.out.printf("Mensagem digitada: %s\n", userMessage);
		}
		
		input.close();
	}
}
