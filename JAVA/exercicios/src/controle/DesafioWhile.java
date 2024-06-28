package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double grade = 0;
		double gradesAmount = 0;
		double totalGrades = 0;

		while (grade != -1) {
			System.out.print("Digite uma nota (-1 para sair): ");

			grade = input.nextDouble();

			input.nextLine();

			if (grade >= 0 && grade <= 10) {
				gradesAmount++;
				totalGrades += grade;
			} else if (grade != -1) {
				System.out.println("Nota inválida.");
			}
		}

		double gradesAvarage = totalGrades / gradesAmount;

		System.out.println("Média da turma: " + gradesAvarage);

		input.close();
	}
}
