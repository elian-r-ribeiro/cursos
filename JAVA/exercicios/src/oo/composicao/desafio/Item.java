package oo.composicao.desafio;

public class Item {

	final int quantity;
	final Produto product;
	
	Item(Produto product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
}
