package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);

		var p2 = new Produto();
		p2.productName = "Caneta Preta";
		p2.productPrice = 12.56;

		Produto.productDiscount = 0.50;

		System.out.println(p1.productName + " " + p1.priceWithDiscount());
		System.out.println(p2.productName + " " + p2.priceWithDiscount());

		double finalPrice1 = p1.priceWithDiscount();
		double finalPrice2 = p2.priceWithDiscount(0.1);
		double avaragePrice = (finalPrice1 + finalPrice2) / 2;

		System.out.printf("Média do carrinho = R$%.2f", avaragePrice);
	}
}
