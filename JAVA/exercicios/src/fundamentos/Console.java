package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Elian");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		
		byte idade = entrada.nextByte();
		
		System.out.println("Nome: " + nome + " " + sobrenome +
				"\nIdade: " + idade);
		
		entrada.close();
	}
}
