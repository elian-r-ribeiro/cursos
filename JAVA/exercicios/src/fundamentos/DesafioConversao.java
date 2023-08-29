package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String payment1 = input.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salário: ");
		String payment2 = input.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salário: ");
		String payment3 = input.nextLine().replace(",", ".");
		
		double numberPayment1 = Double.parseDouble(payment1);
		double numberPayment2 = Double.parseDouble(payment2);
		double numberPayment3 = Double.parseDouble(payment3);
		
		double salary = (numberPayment1 + numberPayment2 + numberPayment3) / 3;
		
		System.out.printf("A média salarial é: %.2f", salary);
		
		input.close();
	}
}
