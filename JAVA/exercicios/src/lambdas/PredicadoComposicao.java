package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> isThreeCharacters = 
				num -> num >= 100 && num <= 999;
				
		System.out.println(isEven.and(isThreeCharacters).test(122));
		System.out.println(isEven.or(isThreeCharacters).test(23));
	}
}
