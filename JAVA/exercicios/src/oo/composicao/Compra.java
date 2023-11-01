package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String clientName;
	List<Item> items = new ArrayList<>();
	
	double getFinalPrice() {
		double finalPrice = 0;
		
		for(Item item: items) {
			finalPrice += item.quantity * item.price;
		}
		
		return finalPrice;
	}
	
	void addItem(Item item) {
		this.items.add(item);
		item.purchase = this;
	}
	
	void addItem(String name, int quantity, double price) {
		this.addItem(new Item(name, quantity, price));
	}
}
