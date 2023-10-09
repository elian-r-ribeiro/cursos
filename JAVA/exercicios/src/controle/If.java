package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Informe a média: ");
		String userInput = input.next();
		userInput = userInput.replace(",", ".");
		double avarage;

		try {
			avarage = Double.parseDouble(userInput);
		}catch (NumberFormatException e) {
			System.out.println("Entrada inválida");
			input.close();
			return;
		}
		
		boolean isApproved = avarage >= 7.0;
		
		if (avarage >= 0.0 && avarage <= 10.0 ) {
			if (isApproved) {
				System.out.println("O aluno está aprovado!");
			}else if(avarage >= 4.0) {
				System.out.println("O aluno está de recuperação!");
			}else {
				System.out.println("O aluno está reprovado!");
			}
		}else {
			System.out.println("Nota inválida!");
		}
		
		input.close();
	}
}
