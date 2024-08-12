package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        
        List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> add = (ac, n) -> ac + n;
        Integer finalNumber = numbers.stream().reduce(add).get();
        Integer finalNumber2 = numbers.stream().reduce(100, add);
        
        System.out.println(finalNumber);
        System.out.println(finalNumber2);

        numbers.stream().filter(n -> n > 5).reduce(add).ifPresent(System.out::println);
    }
}
