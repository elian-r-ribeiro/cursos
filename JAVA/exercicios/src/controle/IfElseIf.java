package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Digite a nota:");
		String userInput = input.next();
		userInput = userInput.replace(",", ".");
		double grade;
		
		try {
			grade = Double.parseDouble(userInput);
		}catch (NumberFormatException e) {
			System.out.println("Entrada inválida");
			input.close();
			return;
		}
		
		if(grade <= 10.0 && grade >= 0.0) {
			System.out.println("Nota válida!");
			
			if(grade == 10.0) {
				System.out.println("O brabo!!!");
			}else if(grade >= 9.0 && grade <= 9.9) {
				System.out.println("Excelente!");
			}else if(grade >= 8.0 && grade <= 8.9) {
				System.out.println("Muito bom!");
			}else if (grade >= 7.0 && grade <= 7.9) {
				System.out.println("Na média!");
			}else if(grade <= 6.9 && grade >= 0.1) {
				System.out.println("Tá fraco!");
			}else {
				System.out.println("Burro!");
			}
			
		}else {
			System.out.println("Nota inválida");
		}
		
		input.close();
	}
}
