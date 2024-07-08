package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra purchase1 = new Compra();
		
		purchase1.customer = "Elian Ribeiro";
		purchase1.addItem("Caneta", 20, 7.45);
		purchase1.addItem(new Item("Borracha", 12, 3.89));
		purchase1.addItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(purchase1.getTotalPrice());
	}
}
