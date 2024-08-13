package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println(7 / input.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
			input.close();
		}
		
		System.out.println("Fim");
	}
}