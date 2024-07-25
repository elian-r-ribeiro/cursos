package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> avarage = (g1, g2) -> (g1 + g2) / 2;
		BiFunction<Double, Double, String> result = 
				(g1, g2) -> ((g1 + g2) / 2) >= 7 ? 
				"Aprovado" : "Reprovado"; 
		Function<Double, String> concept = 
				a -> a >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(avarage.apply(9.8, 5.7));
		System.out.println(result.apply(9.8, 5.7));
		System.out.println(avarage.andThen(concept).apply(9.8, 5.7));
	}
}
