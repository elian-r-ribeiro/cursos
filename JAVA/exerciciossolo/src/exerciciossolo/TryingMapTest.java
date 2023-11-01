package exerciciossolo;

import java.util.Map;
import java.util.Scanner;

public class TryingMapTest {

	static void mainProgram(Map<Integer, String> map, Scanner input) {
		while (true) {
			int userChoice = askUserChoice(input);

			switch (userChoice) {
			case 1:
				addPersonToRegistry(input, map);
				break;
			case 2:
				removePersonFromRegistry(input, map);
				break;
			case 3:
				seeAllPeopleOnRegistry(map);
				break;
			case 4:
				System.out.println("Encerrando programa, até mais. :)");
				return;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	static int askUserChoice(Scanner input) {
		System.out.print("[1]Registrar pessoa\n[2]Apagar pessoa do registro\n[3]Ver pessoas registradas\n[4]Encerrar programa\nEscolha a opção:");
		int userInputChoice = input.nextInt();
		return userInputChoice;
	}

	static void addPersonToRegistry(Scanner input, Map<Integer, String> map) {
		System.out.println("Digite o ID que irá pertencer a pessoa: ");
		int personIdInput = input.nextInt();
		input.nextLine();
		System.out.println("Digite o nome que irá pertencer ao ID: ");
		String personNameInput = input.nextLine();
		map.put(personIdInput, personNameInput);
		System.out.printf("Registro criado com ID %d e nome %s.\n", personIdInput, personNameInput);
	}

	static void removePersonFromRegistry(Scanner input, Map<Integer, String> map) {
		if (map.isEmpty()) {
			System.out.println("O registro está vazio.");
		} else {
			seeAllPeopleOnRegistry(map);
			System.out.println("Digite o ID da pessoa que deseja remover: ");
			int idRemovalInput = input.nextInt();
			String personNameById = map.get(idRemovalInput);
			System.out.printf("Pessoa de ID %d e nome %s removida.\n", idRemovalInput, personNameById);
			map.remove(idRemovalInput);
		}
	}

	static void seeAllPeopleOnRegistry(Map<Integer, String> map) {
		if (map.isEmpty()) {
			System.out.println("O registro está vazio.");
		} else {
			System.out.println(map);
		}
	}
}
