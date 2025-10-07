package operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class IgualdadeEntreStrings {

    static void main() {

        System.out.println("olá" == "olá");
        System.out.println("olá" == new String("olá"));
        System.out.println("olá".equals(new String("olá")));

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite olá: ");
        String texto = teclado.nextLine();
        System.out.println("olá" == texto);
        System.out.println("olá".equals(texto));

        String string1 = "bom";
        String string2 = "bom";
        System.out.println(string1 == string2);
    }
}
