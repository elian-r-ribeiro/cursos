package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas notas você deseja informar? ");
		
		int gradesNumber = input.nextInt();
		double[] gradesArray = new double[gradesNumber];
		double totalGrade = 0;
		
		for (int i = 0; i < gradesArray.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");

			gradesArray[i] = input.nextDouble();
		}
		
		for(double grade: gradesArray) {
			totalGrade += grade;
		}
		
		double avarageGrade = totalGrade / gradesArray.length;
		
		System.out.println("Média das notas: " + avarageGrade);
		
		input.close();
	}
}
