package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Batom de chocolate", 1.00);
		Produto p2 = new Produto("Pringles churrasco", 8.99);
		Item i1 = new Item(2, p1);
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		Compra c3 = new Compra();
		
		Cliente client1 = new Cliente("João");
		
		c1.addItem(i1);
		c1.addItem(p2, 4);
		c1.addItem("Torrone", 6.99, 2);
		
		c2.addItem(i1);
		c2.addItem(p2, 4);
		c2.addItem("Torrone", 6.99, 2);
		
		c3.addItem(i1);
		c3.addItem(p2, 4);
		c3.addItem("Torrone", 6.99, 2);
		
		client1.addPurchase(c1);
		client1.addPurchase(c2);
		client1.addPurchase(c3);
		
		System.out.printf("O cliente %s comprou um total de R$%.2f", client1.name, client1.getFinalPriceOfAllPurchases());
	}
}
