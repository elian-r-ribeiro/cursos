package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	final String name;
	final ArrayList<Compra> purchases = new ArrayList<>();
	
	Cliente(String name) {
		this.name = name;
	}
	
	String getCostumerInfo() {
		int totalNumberOfPurchases = 0;
		
		for(int i = 0; i < purchases.size(); i++) {
			totalNumberOfPurchases += 1;
		}
		
		return String.format("O cliente %s possui %d "
				+ "compra(s) no total de R$%.2f", 
				this.name, totalNumberOfPurchases,
				this.getTotalPrice());
	}
	
	double getTotalPrice() {
		
		double totalPrice = 0;
		
		for(Compra purchase: purchases) {
			totalPrice += purchase.getTotalPrice();
		}
		
		return totalPrice;
	}
	
	void addPurchase(Compra purchase) {
		this.purchases.add(purchase);
	}
}
