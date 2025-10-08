package desafio;

import java.util.Scanner;

public class DesafioCalculadora {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        float n1 = Float.parseFloat(teclado.nextLine().replace(",", "."));

        System.out.print("Segundo número: ");
        float n2 = Float.parseFloat(teclado.nextLine().replace(",", "."));

        System.out.print("Operação (+, -, *, / ou %): ");
        String op = teclado.nextLine();

        float resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2: resultado;
        resultado = "*".equals(op) ? n1 * n2: resultado;
        resultado = "/".equals(op) ? n1 / n2: resultado;
        resultado = "%".equals(op) ? n1 % n2: resultado;

        System.out.println(resultado);
    }
}
