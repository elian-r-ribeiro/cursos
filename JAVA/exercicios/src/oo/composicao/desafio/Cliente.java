package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String name;
	final List<Compra> purchases = new ArrayList<>();
	
	Cliente(String name){
		this.name = name;
	}
	
	void addPurchase(Compra purchase) {
		this.purchases.add(purchase);
	}
	
	double getFinalPriceOfAllPurchases() {
		double finalPrice = 0;
		
		for(Compra purchase: purchases) {
			finalPrice += purchase.getFinalPrice();
		}
		
		return finalPrice;
	}
}
