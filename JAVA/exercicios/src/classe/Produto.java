package classe;

public class Produto {

	String productName;
	double productPrice;
	static double productDiscount = 0.25;

	Produto() {

	}

	Produto(String firstProductName, double firstProductPrice) {
		productName = firstProductName;
		productPrice = firstProductPrice;
	}

	double priceWithDiscount() {
		return productPrice * (1 - productDiscount);
	}

	double priceWithDiscount(double managerDiscount) {
		return productPrice * (1 - productDiscount + managerDiscount);
	}
}
