package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        Predicate<Produto> isExpensive = prod -> (prod.price * (1 - prod.discount)) >= 750;
        
        Produto prod1 = new Produto("Notebook", 3893.89, 0.85);

        System.out.println(isExpensive.test(prod1)); 
    }
}
