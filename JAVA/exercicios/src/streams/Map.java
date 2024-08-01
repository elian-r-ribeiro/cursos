package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;
        List<String> brands = Arrays.asList("BMW, ", "Audi, ", "Honda\n");
        // UnaryOperator<String> upperCase = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        // UnaryOperator<String> scream = n -> n + "!!!";
        UnaryOperator<String> screamMore = n -> n + "!!!";

        brands.stream().map(m -> m.toUpperCase()).forEach(print);;
        brands.stream().map(Utilitarios.upperCase).map(firstLetter).map(Utilitarios::scream).map(screamMore).forEach(print);;
    }
}
