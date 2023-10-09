package controle;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String wordInput = input.nextLine();
		
		char letters[] = wordInput.toCharArray();
		
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		input.close();
	}
}
