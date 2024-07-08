package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> items = new ArrayList<>();
	
	double getTotalPrice() {
		double totalPrice = 0;
		
		for(Item item: items) {
			totalPrice += item.quantity * item.product.price;
		}
		
		return totalPrice;
	}
	
	void addItem(Item item) {
		this.items.add(item);
	}
}
