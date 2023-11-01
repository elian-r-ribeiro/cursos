package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TryingFunctionalInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> number1 = x -> x;
        UnaryOperator<Integer> number2 = y -> y;
        BinaryOperator<Integer> add = (x, y) -> x + y;

        System.out.println(add.apply(number1.apply(1), number2.apply(2)));
    }
}
