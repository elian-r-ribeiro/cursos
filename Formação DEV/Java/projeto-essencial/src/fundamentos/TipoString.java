package fundamentos;

@SuppressWarnings("all")

public class TipoString {

    static void main() {

        String texto = "Boa tarde!";

        System.out.println(texto.concat("!!!"));
        System.out.println(texto.startsWith("tarde"));
        System.out.println(texto.toLowerCase().startsWith("boa"));
        System.out.println(texto.equalsIgnoreCase("boa tarde"));
        System.out.println(texto.length());

        String nome = "Pedro";
        String sobrenome = "Santos";
        byte idade = 33;
        float salario = 12345.67f;

        System.out.println(
                "Nome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalário: " + salario
        );

        String formatado = String.format("%s %s tem %d anos e atualmente ganha R$%.2f",
                nome, sobrenome, idade, salario
        );

        System.out.println(formatado);
    }
}
