package fundamentos;

import javax.swing.*;

public class ConversaoStringParaNumero {

    static void main() {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        double n1 = Double.parseDouble(valor1);

        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        double n2 = Double.parseDouble(valor2);

        double soma = n1 + n2;

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.printf("%.2f + %.2f = %2f", n1, n2, soma);
    }
}
