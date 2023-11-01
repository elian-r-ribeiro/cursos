package lambdas;

public class Produto {
    
    final String name;
    final double price;
    final double discount;

    public Produto(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    
    public String toString() {
    	final double finalPrice = price * (1 - discount);
    	return "Nome: " + name + " Preço: R$" + finalPrice + "";
    }
}
