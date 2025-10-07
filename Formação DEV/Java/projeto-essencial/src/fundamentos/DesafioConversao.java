package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1Input = teclado.nextLine().replace(",", ".");
        double salario1 = Double.parseDouble(salario1Input);

        System.out.print("Digite o segundo salário: ");
        String salario2Input = teclado.nextLine().replace(",", ".");
        double salario2 = Double.parseDouble(salario2Input);

        System.out.print("Digite o terceiro salário: ");
        String salario3Input = teclado.nextLine().replace(",", ".");
        double salario3 = Double.parseDouble(salario3Input);

        double mediaSalarial = (salario1 + salario2 + salario3) / 3;

        System.out.printf("Média salarial: %.2f", mediaSalarial);
    }
}
