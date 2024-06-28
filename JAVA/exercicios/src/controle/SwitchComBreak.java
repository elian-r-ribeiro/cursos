package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		int nota = input.nextInt();
		String conceito = "";
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "buro";
			break;
		default:
			conceito = "não informado";
		}
		
		System.out.println("Conceito é: " + conceito);
		input.close();
	}
}
