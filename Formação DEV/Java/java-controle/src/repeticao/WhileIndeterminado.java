package repeticao;

import java.util.Scanner;

public class WhileIndeterminado {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String comando = "";

        while(!comando.equals("sair")) {
            System.out.print("Digite o comando ou sair: ");

            comando = teclado.nextLine();

            System.out.println("Comando: " + comando);
        }

        System.out.println("Fim!");

        teclado.close();
    }
}
