package shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SystemBack {
	
	static Scanner input = new Scanner(System.in);
	static private double shopMoney;
	static private List<Product> productsList = new ArrayList<>();
	static private String buyOrRemoveLabel = "remover";

	static public void addProduct() {
		System.out.println("===============================");
		
		String newProductName = "";
		
		while(true) {
			System.out.print("Digite o nome do item: ");
			
			newProductName = input.nextLine();
			
			if(newProductName.equalsIgnoreCase("")) {
				System.out.println("O nome do produto é obrigatório");
			} else {
				break;
			}
		}
		
		double newProductPrice = 0;
		
		while(true) {
			System.out.print("Digite o preço do item: R$");
			
			try {
				newProductPrice = input.nextDouble();
				input.nextLine();
				
				if(newProductPrice <= 0) {
					System.out.println("Valor do produto inválido");
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, insira um número válido.");
				input.next();
			}
		}
		
		Product newProduct = new Product(
				newProductName, newProductPrice);
		
		System.out.println("Item adicionado com sucesso!");
		System.out.println("===============================");
		SystemBack.productsList.add(newProduct);
	}
	
	static public void buyProduct() {
		buyOrRemoveLabel = "comprar";
		
		removeProduct();
		
		buyOrRemoveLabel = "remover";
	}
	
	static public void removeProduct() {
		getShopItems();
		
		String finishedLabel = "Item removido com sucesso!";
		
		int userChoice = 0;
		
		while(true) {
			System.out.printf("Qual item deseja %s? ", buyOrRemoveLabel);
			
			try {
				userChoice = input.nextInt();
				
				if(userChoice < productsList.size() || 
						userChoice > productsList.size()) {
					System.out.println("Número inválido, tente novamente.");
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, insira um número válido.");
				input.next();
			}
			
		}
		
		if(buyOrRemoveLabel.equals("comprar")) {
			shopMoney += SystemBack.productsList
					.get(userChoice - 1).getPrice();
			finishedLabel = "Item comprado com sucesso!";
		}
		
		SystemBack.productsList.remove(userChoice - 1);
		
		System.out.println(finishedLabel);
		System.out.println("===============================");
	}
	
	static public void getShopItems() {
		int itemsCounter = 1;
		
		System.out.println("===============================");
		
		for(Product product: SystemBack.productsList) {
			System.out.printf("[%d] %s - R$%.2f", 
					itemsCounter, product.getName(), product.getPrice());
			System.out.println();
			
			itemsCounter += 1;
		}
		
		System.out.println("===============================");
	}
	
	static public void getShopMoney() {
		System.out.println("===============================");
		System.out.printf("R$%.2f\n", SystemBack.shopMoney);
		System.out.println("===============================");
	}
}
