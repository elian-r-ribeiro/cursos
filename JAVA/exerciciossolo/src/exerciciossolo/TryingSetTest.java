package exerciciossolo;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class TryingSetTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		Set<String> stringSet = new HashSet<>();
		Set<Integer> intSet = new HashSet<>();
		Set<Double> doubleSet = new HashSet<>();

		while (true) {
			System.out.println("[0]Sair\n[1]Strings\n[2]Inteiros\n[3]Números de Ponto Flutuante");
			System.out.println("Você deseja adicionar elementos a qual tipo de Set? ");
			if (input.hasNextInt()) {
				int userInputChoice = input.nextInt();

				if (userInputChoice == 0) {
					input.close();
					break;
				}

				switch (userInputChoice) {
				case 1:
					TryingSet.addElementString(input, stringSet);
					break;
				case 2:
					TryingSet.addElementInt(input, intSet);
					break;
				case 3:
					TryingSet.addElementDouble(input, doubleSet);
					break;
				default:
					System.out.println("Valor inválido detectado, encerrando programa!");
					return;
				}
			} else {
				System.out.println("Valor inválido detectado, encerrando programa!");
				input.close();
				return;
			}

			System.out.println("=========================");
			System.out.println(stringSet);
			System.out.println(intSet);
			System.out.println(doubleSet);
			System.out.println("=========================");
		}
	}
}
