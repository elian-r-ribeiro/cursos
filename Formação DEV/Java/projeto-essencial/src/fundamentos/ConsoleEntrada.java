package fundamentos;

import java.util.Scanner;

public class ConsoleEntrada {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // Capturar caractere em branco após a leitura

        System.out.print("Qual o seu nome? ");
        String nome = teclado.nextLine();

        System.out.printf("%s, %d anos", nome, idade);

        teclado.close();
    }
}
