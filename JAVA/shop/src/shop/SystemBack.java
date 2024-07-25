package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemBack {
	
	static Scanner input = new Scanner(System.in);
	static private double shopMoney;
	static private List<Product> productsList = new ArrayList<>();
	static private String buyOrRemoveLabel = "remover";

	static public void addProduct() {
		System.out.println("===============================");
		System.out.print("Digite o nome do item: ");
		
		String newProductName = input.nextLine();
		
		System.out.print("Digite o preço do item: R$");
		
		double newProductPrice = input.nextDouble();
		input.nextLine();
		
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
		
		System.out.printf("Qual item deseja %s? ", buyOrRemoveLabel);
		
		int userChoice = input.nextInt();
		
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
			System.out.printf("[%d] %s - %.2f", 
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
