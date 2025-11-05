package desafios;

import java.util.Scanner;

public class NumeroSecretoMaquina {

    static void main() {

        Scanner input = new Scanner(System.in);

        int numbersInterval = (int)(Math.random() * 10_001);
        System.out.print("Digite um número aleatório entre 0 e 10.000: ");
        int secretNumer = input.nextInt();
        int attemps = 0;
        int machineInput;

        do {
            machineInput = (int) (Math.random() * 10_001);

            attemps++;

        } while (machineInput != secretNumer && attemps < 1_000_000);

        if(machineInput == secretNumer) {
            System.out.printf("A máquina levou %d tentativas para acertar o número %d", attemps, secretNumer);
        } else {
            System.out.println("A máquina não conseguiu acertar o número.");
        }

        System.out.println("O número secreto era: " + secretNumer);

        input.close();
    }
}
