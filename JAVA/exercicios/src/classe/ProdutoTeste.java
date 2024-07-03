package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.name = "Caneta preta";
		p2.price = 12.56;
		
		Produto.discount = 0.50;
		
		System.out.println(p1.name + " " + p1.priceWithDiscount());
		System.out.println(p2.name + " " + p2.priceWithDiscount());

		double finalPrice1 = p1.priceWithDiscount();
		double finalPrice2 = p2.priceWithDiscount(0.1);
		double mediaCarrinho = (finalPrice1 + finalPrice2) / 2;
		
		System.out.println(finalPrice1);
		System.out.println(finalPrice2);
		System.out.println("Média do carrinho: R$" + mediaCarrinho);
	}
}
