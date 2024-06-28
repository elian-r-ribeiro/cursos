package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a nota: ");

		double grade = input.nextDouble();

		if (grade > 10 || grade < 0) {
			System.out.println("Nota inválida!");
		} else if (grade >= 8.1) {
			System.out.println("Conceito A!");
			System.out.println("Parabéns!");
		} else if (grade >= 6.1) {
			System.out.println("Conceito B!");
			System.out.println("Ok!");
		} else if (grade >= 4.1) {
			System.out.println("Conceito C!");
			System.out.println("É...");
		} else if (grade >= 2.1) {
			System.out.println("Conceito D!");
			System.out.println("Estudo um pouco mais da próxima!");
		} else {
			System.out.println("Conceito E!");
			System.out.println("C é buro!");
		}

		input.close();
	}
}
