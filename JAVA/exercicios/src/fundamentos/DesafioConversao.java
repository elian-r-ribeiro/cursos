package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		
		String salary1 = input.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		
		String salary2 = input.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salário: ");
		
		String salary3 = input.nextLine().replace(",", ".");
		
		double salary1ToDouble = Double.parseDouble(salary1);
		double salary2ToDouble = Double.parseDouble(salary2);
		double salary3ToDouble = Double.parseDouble(salary3);
		double media = (salary1ToDouble + salary2ToDouble +
				salary3ToDouble) / 3;
		
		System.out.println(media);
		
		input.close();
	}
}
