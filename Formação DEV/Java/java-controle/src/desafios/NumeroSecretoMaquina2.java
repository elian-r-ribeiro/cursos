package desafios;

import java.util.Scanner;

public class NumeroSecretoMaquina2 {

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número aleatório entre 0 e 10.000: ");
        int secretNumer = input.nextInt();

        int attemps = 0;
        int machineInput;

        int min = 0;
        int max = 10_001;

        do {
            machineInput = (max - min) / 2 + min;
            attemps++;

            if(secretNumer > machineInput) {
                min = machineInput;
            } else if (secretNumer < machineInput) {
                max = machineInput;
            }

        } while (machineInput != secretNumer && attemps < 1_000_000);

        if(machineInput == secretNumer) {
            System.out.printf("A máquina levou %d tentativas para acertar o número %d", attemps, secretNumer);
        } else {
            System.out.println("A máquina não conseguiu acertar o número.");
        }

        System.out.println("\nO número secreto era: " + secretNumer);

        input.close();
    }
}
