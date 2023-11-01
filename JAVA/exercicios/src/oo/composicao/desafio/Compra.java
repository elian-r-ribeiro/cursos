package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> items = new ArrayList<>();
	
	double getFinalPrice() {
		double finalPrice = 0;
		
		for(Item item: items) {
			finalPrice += item.quantity * item.product.price;
		}
		
		return finalPrice;
	}
	
	void addItem(Item item) {
		this.items.add(item);
	}
	
	void addItem(Produto product, int quantity) {
		this.items.add(new Item(quantity, product));
	}
	
	void addItem(String name, double price, int quantity) {
		this.items.add(new Item(quantity, new Produto(name, price)));
	}
}
