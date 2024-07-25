package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> plusTwo = n -> n + 2;
		UnaryOperator<Integer> twoTimes = n -> n * 2;
		UnaryOperator<Integer> square = n -> n * n;
		int result1 = plusTwo.
				andThen(twoTimes).andThen(square).apply(0);
		int result2 = square.
				compose(twoTimes).compose(plusTwo).apply(0);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
