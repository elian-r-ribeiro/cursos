package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.println("Quantos alunos? ");
		int studentsAmount = input.nextInt();

		System.out.println("Quantos notas por aluno? ");
		int gradesAmount = input.nextInt();

		double[][] classGrades = new double[studentsAmount][gradesAmount];
		
		double totalGrade = 0;

		for (int s = 0; s < classGrades.length; s++) {
			for (int g = 0; g < classGrades[s].length; g++) {
				System.out.printf("Informe a nota %d do aluno %d: ", g + 1, s + 1);
				classGrades[s][g] = input.nextDouble();
				totalGrade += classGrades[s][g];
			}
		}
		
		double avarageGrade = totalGrade / (studentsAmount * gradesAmount);
		
		System.out.println("A média da turma é " + avarageGrade);
		
		for(double[] allGrades : classGrades) {
			System.out.println(Arrays.toString(allGrades));
		}
		
		input.close();
	}
}
