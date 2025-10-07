package operadores;

@SuppressWarnings("all")
public class Unarios {

    static void main() {

        int a = 1;
        int b = 2;

        a++;
        --a;

        b--;
        ++b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--);
        System.out.println(a == b);
    }
}
