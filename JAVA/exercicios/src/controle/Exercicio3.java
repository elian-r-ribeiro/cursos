package controle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.print("Digite a nota do aluno no primeiro bimestre: ");
		String firstGradeStringInput = input.nextLine().replace(",", ".").trim().replaceAll("\\s", "");
		System.out.print("Digite a nota do aluno no segundo bimestre: ");
		String secondGradeStringInput = input.nextLine().replace(",", ".").trim().replaceAll("\\s", "");

		try {
			Double firstGradeDouble = Double.parseDouble(firstGradeStringInput);
			Double secondeGradeDouble = Double.parseDouble(secondGradeStringInput);
			Double finalAvarage = (firstGradeDouble + secondeGradeDouble) / 2;

			if (finalAvarage >= 7.0) {
				System.out.println("Aprovado!");
				System.out.printf("Média: %.1f", finalAvarage);
			} else if (finalAvarage >= 4.0) {
				System.out.println("Recuperação!");
				System.out.printf("Média: %.1f", finalAvarage);
			} else if (finalAvarage < 4.0) {
				System.out.println("Reprovado!");
				System.out.printf("Média: %.1f", finalAvarage);
			}
		} catch (NumberFormatException e) {
			System.out.println("Nota inválida!");
		}

		input.close();
	}
}
