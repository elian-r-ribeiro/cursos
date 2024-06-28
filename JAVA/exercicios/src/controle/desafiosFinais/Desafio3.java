package controle.desafiosFinais;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		
		double grade1 = input.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		
		double grade2 = input.nextDouble();
		
		if (!(grade1 < 0) || !(grade1 > 10) || 
				!(grade2 < 0) || !(grade2 > 10)) {
			double finalGrade = (grade1 + grade2) / 2;
			
			if(finalGrade >= 7) {
				System.out.println("Aprovado!");
			} else if (finalGrade >= 4 && finalGrade < 7) {
				System.out.println("Recuperação!");
			} else {
				System.out.println("Reprovado!");
			}
		} else {
			System.out.println(
					"Alguma das notas que você digitou está errada!");
		}
		
		input.close();
	}
}
