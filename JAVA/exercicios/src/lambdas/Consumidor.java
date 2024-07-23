package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Produto product1 = new Produto("Lápis", 4.0, 0.15);
		Produto product2 = new Produto("Caderno", 10.0, 0.15);
		Produto product3 = new Produto("Caneta", 5.0, 0.15);
		Produto product4 = new Produto("Borracha", 2.0, 0.15);
		Produto product5 = new Produto("Apontador", 1.0, 0.15);
		
		Consumer<Produto> print = 
				product -> System.out.println(product.name);
				
		print.accept(product1);
		
		List<Produto> products = Arrays.asList(product1, product2,
				product3, product4, product5);
		
		products.forEach(print);
		products.forEach(p -> System.out.println(p.price));
		products.forEach(System.out::println);
	}
}
