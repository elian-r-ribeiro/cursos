package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = input.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = input.nextDouble();
		System.out.print("Digite o operador (+, -, *, /, %): ");
		String op = input.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);
		
		input.close();
	}
}
