package desafios;

import java.util.Scanner;

public class DesafioOpMatematicas {

    static void main() {

        Scanner input = new Scanner(System.in);
        byte opcao = 0;

        while(opcao != 3) {
            System.out.print("Menu\n---------------\n1) Somar\n2) Subtrair\n3) Sair\nOpção: ");
            opcao = input.nextByte();
            input.nextLine();

            if(opcao != 3) {
                System.out.print("Digite o primeiro valor: ");
                double n1 = input.nextDouble();
                input.nextLine();

                System.out.print("Digite o segundo valor: ");
                double n2 = input.nextDouble();
                input.nextLine();

                double resultado = 0;

                switch (opcao) {
                    case 1 -> resultado = n1 + n2;
                    case 2 -> resultado = n1 - n2;
                }

                System.out.println("Resultado: " + resultado);
            }
        }


        input.close();
    }
}
