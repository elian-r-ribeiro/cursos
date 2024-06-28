package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		
		double avarage = input.nextDouble();
		
		if(avarage <= 10 && avarage >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(avarage < 7 && avarage >= 5) {
			System.out.println("Recuperação!");
		}
		
		if(avarage < 5 && avarage >= 0) {
			System.out.println("Reprovado!");
		}
		
		input.close();
	}
}
