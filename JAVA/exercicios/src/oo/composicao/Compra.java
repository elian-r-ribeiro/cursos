package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String customer;
	ArrayList<Item> items = new ArrayList<>();
	
	void addItem(String name, int quantity, double price) {
		this.addItem(new Item(name, quantity, price));
	}
	
	void addItem(Item item) {
		this.items.add(item);
		item.purchase = this;
	}
	
	double getTotalPrice() {
		double total = 0;
		
		for (Item item: items) {
			total += item.quantity * item.price;
		}
		
		return total;
	}
}
