package desafios;

import java.util.Scanner;

public class NumeroSecreto {

    static void main() {

        Scanner input = new Scanner(System.in);

        int secretNumer = (int)(Math.random() * 10);
        int userInput;

        do {
            System.out.print("Digite um número: ");
            userInput = input.nextInt();
            input.nextLine();

            if(userInput < secretNumer) {
                System.out.println("O número secreto é maior do que o que você digitou.");
            } else if(userInput > secretNumer) {
                System.out.println("O número secreto é menor do que o que você digitou.");
            } else {
                System.out.println("Parabéns, você acertou!");
            }

        } while (userInput != secretNumer);

        System.out.println("O número secreto era: " + secretNumer);

        input.close();
    }
}
