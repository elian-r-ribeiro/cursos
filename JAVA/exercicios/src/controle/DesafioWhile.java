package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		int validGrades = 0;
		double totalGrade = 0;
		
		while (true) {
			System.out.print("\nDigite uma nota (para sair digite -1): ");
			String userInputGradeString = "";
			userInputGradeString = input.nextLine();
			userInputGradeString = userInputGradeString.replace(",", ".");
	
			double userInputGradeDouble;
			
			try {
				userInputGradeDouble = Double.parseDouble(userInputGradeString);
			}catch (NumberFormatException e) {
				System.out.println("É necessário ser um número!");
				continue;
			}
			
			if(userInputGradeDouble != -1) {
				if(userInputGradeDouble <= 10.0 && userInputGradeDouble >=0.0) {
					validGrades++;
					totalGrade = totalGrade + userInputGradeDouble;
				}else {
					System.out.print("É necessário ser uma nota válida (entre 10.0 e 0.0)!");
				}
			}else {
				System.out.println("Até mais :)");
				break;
			}
		}
		
		if(validGrades >= 2) {
			totalGrade = totalGrade / validGrades;
			System.out.printf("\nMédia das notas: %.1f", totalGrade);
		}else if(validGrades == 1) {
			System.out.printf("\nVocê digitou apenas a nota: %.1f", totalGrade);
		}
		
		input.close();
	}
}
