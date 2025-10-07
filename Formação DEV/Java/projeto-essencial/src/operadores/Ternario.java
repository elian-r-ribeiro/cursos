package operadores;

import java.util.Scanner;

public class Ternario {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a nota do aluno? ");
        String valorNota = teclado.nextLine().replace(',', '.');
        double nota = Double.parseDouble(valorNota);

        System.out.print("Teve bom comportamento? ");
        String valorComportamento = teclado.nextLine();
        boolean bomComportamento = valorComportamento.equalsIgnoreCase("s");

        String resultadoEscolar = nota >= 7 ? "Aprovado" : "Em recuperação";
        double valorDesconto = bomComportamento && nota >= 9 ? 0.35 : 0.15;

        System.out.printf("Resultado: %s %nDesconto: %.0f%%", resultadoEscolar, valorDesconto * 100);
    }
}
