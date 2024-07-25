package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> priceWithDiscount =
				product -> product.price * (1 - product.discount); 
		UnaryOperator<Double> priceWithTax =
				price -> price >= 2500 ? price * 1.085 : price;
		UnaryOperator<Double> priceWithFreight =
				price -> price >= 3000 ? (price += 100) : (price += 50);
		UnaryOperator<Double> roundToTwoDecimalPlaces =
				price -> Double.parseDouble(String.format("%.2f", price));
		Function<Double, String> format = 
				price -> ("R$" + price).replace(".", ",");
		String finalResult = priceWithDiscount.andThen(priceWithTax)
				.andThen(priceWithFreight).andThen(roundToTwoDecimalPlaces)
				.andThen(format).apply(p1);
		
		System.out.println(finalResult);
	}
}
