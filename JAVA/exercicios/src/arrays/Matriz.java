package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		
		int studentsAmount = input.nextInt();
		
		System.out.print("Quantas notas por aluno: ");
		
		int gradesAmount = input.nextInt();
		double[][] classGrades = new double[studentsAmount][gradesAmount];
		double totalGrades = 0;
		
		for (int a = 0; a < classGrades.length; a++) {
			for (int n = 0; n < classGrades[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				classGrades[a][n] = input.nextDouble();
				totalGrades += classGrades[a][n];
			}
		}
		
		double avarageGrade = totalGrades / (studentsAmount * gradesAmount);
		
		System.out.println("A média da turma é: " + avarageGrade);
		
		input.close();
	}
}
