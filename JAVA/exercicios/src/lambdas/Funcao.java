package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> evenOrOdd = 
				number -> number % 2 == 0 ? "Par" : "Ímpar";
		Function<String, String> theResultIs = 
				value -> "O resultado é: " + value;
		Function<String, String> happy = 
				value -> value + "!!!";
		Function<String, String> doubt = 
				value -> value + "???";
				
		String finalResult = evenOrOdd.andThen(theResultIs)
				.andThen(happy).apply(32);
		String finalResult2 = evenOrOdd.andThen(theResultIs)
				.andThen(doubt).apply(33);
		System.out.println(finalResult);
		System.out.println(finalResult2);
	}
}
