package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Produto product1 = new Produto("Caneta", 5.00);
		Produto product2 = new Produto("Caderno", 10.00);
		Produto product3 = new Produto("Lápis", 3.00);
		Produto product4 = new Produto("Borracha", 2.00);
		Item item1 = new Item(product1, 3);
		Item item2 = new Item(product2, 3);
		Item item3 = new Item(product3, 3);
		Item item4 = new Item(product4, 3);
		Compra purchase1 = new Compra();
		Compra purchase2 = new Compra();
		Cliente costumer1 = new Cliente("João");
	
		purchase1.addItem(item1);
		purchase1.addItem(item2);
		purchase2.addItem(item3);
		purchase2.addItem(item4);
		costumer1.addPurchase(purchase1);
		costumer1.addPurchase(purchase2);
		
		System.out.println(costumer1.getCostumerInfo());
	}
}
