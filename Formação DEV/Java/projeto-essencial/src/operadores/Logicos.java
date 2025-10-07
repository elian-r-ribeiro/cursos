package operadores;

import java.util.Scanner;

public class Logicos {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Deu certo o trabalho de terça? (s / n) ");
        boolean trabalhoTercaDeuCerto = teclado.nextLine().equalsIgnoreCase("s");

        System.out.print("Deu certo o trabalho de quinta? (s / n) ");
        boolean trabalhoQuintaDeuCerto = teclado.nextLine().equalsIgnoreCase("s");

        boolean vamosComprarTV72 = trabalhoTercaDeuCerto && trabalhoQuintaDeuCerto;
        boolean vamosComprarTV32 = trabalhoTercaDeuCerto ^ trabalhoQuintaDeuCerto;
        boolean vamosTomarSorvete = trabalhoTercaDeuCerto || trabalhoQuintaDeuCerto;
        boolean vamosFicarEmCasa = !vamosTomarSorvete;

        System.out.printf("Comprar TV 72: %b%nComprar TV 32: %b%nTomar sorvete: %b%nFicar em casa: %b",
                vamosComprarTV72, vamosComprarTV32, vamosTomarSorvete, vamosFicarEmCasa);
    }
}
