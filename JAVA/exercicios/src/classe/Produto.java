package classe;

public class Produto {

	String name;
	double price;
	static double discount = 0.25;
	
	Produto(String firstName, double firstPrice) {
		name = firstName;
		price = firstPrice;
	}
	
	Produto(String firstName) {
		name = firstName;
	}

	Produto() {}

	double priceWithDiscount() {
		return price * (1 - discount);
	}

	double priceWithDiscount(double managerDiscount) {
		return price * (1 - (discount + managerDiscount));
	}
}
