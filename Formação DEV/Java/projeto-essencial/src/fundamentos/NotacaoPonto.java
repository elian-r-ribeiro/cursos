package fundamentos;

public class NotacaoPonto {

    static void main() {

        String texto = "Bom dia X";
        texto = texto.replace("X", "Senhora!");
        texto = texto.toUpperCase();

        System.out.println(texto);

        final String nome = "Elian Sobrenome".toUpperCase().replace("SOBRENOME", "RIBEIRO");

        System.out.println(nome);
    }
}
