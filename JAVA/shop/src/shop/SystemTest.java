package shop;

import java.util.Scanner;

public class SystemTest {

	public static void main(String[] args) {
		
		boolean systemIsOn = true; 
		
		Scanner input = new Scanner(System.in);
		
		while(systemIsOn != false) {
			System.out.println("[1] Ver lista da itens na loja");
			System.out.println("[2] Adicionar um item a loja");
			System.out.println("[3] Remover um item da loja");
			System.out.println("[4] Comprar um item da loja");
			System.out.println("[5] Ver dinheiro no caixa da loja");
			System.out.println("[6] Desligar sistema");
			System.out.print("Oque deseja fazer? ");
			
			String userChoice = input.nextLine().trim();
			           
			switch (userChoice) {
			case "1":
				SystemBack.getShopItems();
				break;
			case "2":
				SystemBack.addProduct();
				break;
			case "3":
				SystemBack.removeProduct();
				break;
			case "4":
				SystemBack.buyProduct();
				break;
			case "5":
				SystemBack.getShopMoney();
				break;
			case "6":
				System.out.println("Até mais!");
				systemIsOn = false;
				break;
			default:
				System.out.println("Opção inválida");
			} 
		}
		
		input.close();
	}
}
