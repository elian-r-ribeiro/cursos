package controle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o ano: ");

		if (input.hasNextInt()) {
			int yearInput = input.nextInt();

			if ((yearInput % 4 == 0 && yearInput % 100 != 0) || (yearInput % 400 == 0)) {
				System.out.println("O ano digitado é bissexto");
			} else {
				System.out.println("O ano digitado não é bissexto");
			}
		} else {
			System.out.println("O ano digitado não é válido");
		}

		input.close();
	}
}
