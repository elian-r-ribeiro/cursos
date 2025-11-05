package condicionais;

import java.util.Scanner;

public class IfElse {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

        teclado.close();
    }
}
