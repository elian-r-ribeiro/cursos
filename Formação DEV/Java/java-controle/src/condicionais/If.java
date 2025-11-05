package condicionais;

import java.util.Scanner;

public class If {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a média final do aluno: ");
        double media = Double.parseDouble(teclado.nextLine().replace(",", "."));

        if(media <= 10 && media >= 7.0) {
            System.out.print("Aprovado!");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("Em recuperação!");
        }

        if(media < 4.5 && media >= 0) {
            System.out.println("Reprovado!");
        }

        System.out.println("Média final: " + media);

        teclado.close();
    }
}
