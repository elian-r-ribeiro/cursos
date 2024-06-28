package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userValue = "";
		
		while (!userValue.equalsIgnoreCase("sair")) {
			System.out.print(
					"Digite qualquer coisa (sair para sair): ");
			
			userValue = input.nextLine();
			
			System.out.println(userValue);
		}
		
		input.close();
	}
}
