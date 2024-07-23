package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Produto product = new Produto("Notebook", 3893.89, 0.15);
		Predicate<Produto> isExpensive = 
				prod -> (prod.price * (1 - prod.discount) >= 750);
		
		System.out.println(isExpensive.test(product));
	}
}
