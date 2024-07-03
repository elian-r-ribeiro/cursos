package rpgMonsterFight;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		ArrayList<Player> players = new ArrayList<Player>();

		while (true) {
			System.out.println("Escolha uma opção:\n[1]Ver jogadores e seu HP" + "\n[2]Ver monstros e seu HP"
					+ "\n[3]Registrar novo jogador" + "\n[4]Registrar novo monstro" + "\n[5]Jogador dar dano em monstro"
					+ "\n[6]Monstro dar dano em jogador" + "\n[7]Recuperar vida de um player"
					+ "\n[8]Recuperar vida de um monstro");
			int masterChoice = input.nextInt();

			switch (masterChoice) {
			case 1:
				showPlayersList(players);
				break;
			case 2:
				showMonstersList(monsters);
				break;
			case 3:
				registerNewPlayer(input, players);
				break;
			case 4:
				registerNewMonster(input, monsters);
				break;
			case 5:
				giveMonsterDamage(input, monsters);
				break;
			case 6:
				givePlayerDamage(input, players);
				break;
			case 7:
				healPlayerLife(input, players);
				break;
			case 8:
				healMonsterLife(input, monsters);
			}

		}
	}

	private static void showMonstersList(ArrayList<Monster> monsters) {
		if (monsters.size() <= 0) {
			System.out.println("Não há monstros ainda.");
		} else {
			for (int i = 0; i < monsters.size(); i++) {
				System.out.println(
						"[" + (i + 1) + "]" + "Monstro: " + monsters.get(i).name + " HP: " + monsters.get(i).hp);
			}
		}
	}

	private static void showPlayersList(ArrayList<Player> players) {
		if (players.size() <= 0) {
			System.out.println("Não há jogadores ainda.");
		} else {
			for (int i = 0; i < players.size(); i++) {
				System.out
						.println("[" + (i + 1) + "]" + "Monstro: " + players.get(i).name + " HP: " + players.get(i).hp);
			}
		}
	}

	private static void registerNewPlayer(Scanner input, ArrayList<Player> players) {
		System.out.println("Digite o nome do novo jogador (digite cancelar para cancelar): ");
		input.nextLine();
		String newPlayerName = input.nextLine();
		if (newPlayerName.toLowerCase().trim().equals("cancelar")) {
			return;
		}
		System.out.println("Digite o HP do novo jogador: ");
		int newPlayerHP = input.nextInt();
		Player newPlayer = new Player(newPlayerName, newPlayerHP);
		players.add(newPlayer);
	}

	private static void registerNewMonster(Scanner input, ArrayList<Monster> monsters) {
		System.out.println("Digite o nome do novo monstro: ");
		input.nextLine();
		String newMonsterName = input.nextLine();
		if (newMonsterName.toLowerCase().trim().equals("cancelar")) {
			return;
		}
		System.out.println("Digite o HP do novo monstro: ");
		int newMonsterHP = input.nextInt();
		Monster newPlayer = new Monster(newMonsterName, newMonsterHP);
		monsters.add(newPlayer);
	}

	private static void giveMonsterDamage(Scanner input, ArrayList<Monster> monsters) {
		if (monsters.isEmpty()) {
			System.out.println("Não há monstros registrados ainda.");
			return;
		}
		showMonstersList(monsters);
		System.out.println("Em qual monstro você quer dar dano? (0 para cancelar)");
		int monsterToTakeDamage = input.nextInt();
		if (monsterToTakeDamage == 0) {
			return;
		} else {
			System.out.println("Quanto de dano ele tomou?");
			int damageTakenByTheMonster = input.nextInt();
			monsters.get(monsterToTakeDamage - 1).monsterTookDamage(damageTakenByTheMonster);
			System.out.println("O monstro " + monsters.get(monsterToTakeDamage - 1).name + " agora está com o HP de "
					+ monsters.get(monsterToTakeDamage - 1).hp);
		}

	}

	private static void givePlayerDamage(Scanner input, ArrayList<Player> players) {
		if (players.isEmpty()) {
			System.out.println("Não há jogadores registrados ainda.");
			return;
		}
		showPlayersList(players);
		System.out.println("Em qual player você quer dar dano? (0 para cancelar)");
		int playerToTakeDamage = input.nextInt();
		if (playerToTakeDamage == 0) {
			return;
		} else {
			System.out.println("Quanto de dano ele tomou?");
			int damageTakenByTheplayer = input.nextInt();
			players.get(playerToTakeDamage - 1).playerTookDamage(damageTakenByTheplayer);
			System.out.println("O jogador " + players.get(playerToTakeDamage - 1).name + " agora está com o HP de "
					+ players.get(playerToTakeDamage - 1).hp);
		}
	}

	private static void healMonsterLife(Scanner input, ArrayList<Monster> monsters) {
		if (monsters.isEmpty()) {
			System.out.println("Não há monstros registrados ainda.");
			return;
		}
		showMonstersList(monsters);
		System.out.println("Qual monstro irá recuperar HP? (0 para cancelar)");
		int monsterToHeal = input.nextInt();
		if (monsterToHeal == 0) {
			return;
		} else {
			System.out.println("Quanto de vida ele vai recuperar?");
			int hpHealedByTheMonster = input.nextInt();
			monsters.get(monsterToHeal - 1).healMonsterLife(hpHealedByTheMonster);
			System.out.println("O monstro " + monsters.get(monsterToHeal - 1).name + " agora está com o HP de "
					+ monsters.get(monsterToHeal - 1).hp);
		}
	}

	private static void healPlayerLife(Scanner input, ArrayList<Player> players) {
		if (players.isEmpty()) {
			System.out.println("Não há jogadores registrados ainda.");
			return;
		}
		showPlayersList(players);
		System.out.println("Qual player irá recuperar HP? (0 para cancelar)");
		int playerToHeal = input.nextInt();
		if (playerToHeal == 0) {
			return;
		} else {
			System.out.println("Quanto de vida ele vai recuperar?");
			int hpHealedByThePlayer = input.nextInt();
			players.get(playerToHeal - 1).healPlayerLife(hpHealedByThePlayer);
			System.out.println("O jogador " + players.get(playerToHeal - 1).name + " agora está com o HP de "
					+ players.get(playerToHeal - 1).hp);
		}
	}
}
