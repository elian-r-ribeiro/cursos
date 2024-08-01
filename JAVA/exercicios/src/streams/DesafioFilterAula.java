package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilterAula {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 3450, 0.3, 0);
        Produto p2 = new Produto("Caderno", 20, 0, 0);
        Produto p3 = new Produto("Computador gamer", 5230, 0.3, 50);
        Produto p4 = new Produto("Galaxy S20 FE 5G", 2120, 0.2, 0);
        List<Produto> productsList = Arrays.asList(p1, p2, p3, p4);

        productsList.stream().filter(Utilitarios.checkIfProductHasAHighDiscount).filter(Utilitarios.checkIfFreightIsFree).
        map(Utilitarios.giveProductDiscount).forEach(Utilitarios.println);
    }
}
