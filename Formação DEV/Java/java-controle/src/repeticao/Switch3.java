package repeticao;

import java.util.Scanner;

public class Switch3 {

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String diaDaSemana = input.nextLine();

        switch (diaDaSemana) {
            case "segunda" -> System.out.println("Início da semana :(");
            case "sexta" -> System.out.println("Sextouuuuuu!");
            case "sábado" -> System.out.println("Uhuuuu! Sabadão!");

            case "domingo" -> System.out.println("A deprê já começou a bater...");
            default -> System.out.println("Trabalhando demais");
        }

        input.close();
    }
}
