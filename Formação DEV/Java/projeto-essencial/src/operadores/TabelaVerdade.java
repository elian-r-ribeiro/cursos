package operadores;

@SuppressWarnings("all")
public class TabelaVerdade {

    static void main() {

        // Tabela verdade and (&&)
        System.out.println(true && true); // True
        System.out.println(false && true); // False
        System.out.println(true && false); // False
        System.out.println(false && false); // False

        // Tabela verdade or (||)
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true); // True
        System.out.println(false || false); // False

        // Tabela verdade XOR, ou exclusivo (^)
        System.out.println(true ^ true); // False
        System.out.println(true ^ false); // True
        System.out.println(false ^ true); // True
        System.out.println(false ^ false); // False

        // Tabela verdade diferente (!=)
        System.out.println(true != true); // False
        System.out.println(true != false); // True
        System.out.println(false != true); // True
        System.out.println(false != false); // False

        // Tabela verdade igual (==)
        System.out.println(true == true); // True
        System.out.println(true == false); // False
        System.out.println(false == true); // False
        System.out.println(false == false); // True

        // Tabela verdade not (!)
        System.out.println(!true); // False
        System.out.println(!false); // True
    }
}
