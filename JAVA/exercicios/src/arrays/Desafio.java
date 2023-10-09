package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.println("Quantas notas você desja informar? ");
		int gradesAmount = input.nextInt();
		double[] studentsGrades = new double[gradesAmount];
		double finalStudentsGrade = 0;
		
		for(int i = 0; i < gradesAmount; i ++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			double userGradeInput = input.nextDouble();
			studentsGrades[i] = userGradeInput;
		}
		
		for(double studentsGrade : studentsGrades) {
			finalStudentsGrade += studentsGrade;
		}
		
		System.out.println("A média dos alunos foi: " + (finalStudentsGrade / studentsGrades.length));
		
		input.close();
	}
}
