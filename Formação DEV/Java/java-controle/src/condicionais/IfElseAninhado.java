package condicionais;

import java.util.Scanner;

public class IfElseAninhado {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        double nota = teclado.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else {
            System.out.println("Nota válida!");
            if(nota >= 8) {
                System.out.println("Conceito A!");
                System.out.println("Parabéns!");
            } else {
                if(nota >= 6) {
                    System.out.println("Conceito B!");
                } else {
                    if(nota >= 4) {
                        System.out.println("Conceito C!");
                    } else {
                        if(nota >= 2) {
                            System.out.println("Conceito D!");
                        } else {
                            System.out.println("Conceito E!");
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}
