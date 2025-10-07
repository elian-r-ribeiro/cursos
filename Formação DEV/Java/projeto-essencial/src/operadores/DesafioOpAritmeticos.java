package operadores;

public class DesafioOpAritmeticos {

    static void main() {

        int primeiraDaPrimeiraParte = 3 + 2;
        int seundaDaPrimeiraParte = 6 * primeiraDaPrimeiraParte;
        int terceiraDaPrimeiraParte = Math.powExact(seundaDaPrimeiraParte, 2);
        int quartaDaPrimeiraParte = 3 * 2;
        int quintaDaPrimeiraParte = terceiraDaPrimeiraParte / quartaDaPrimeiraParte;

        int primeiraDaSegundaParte = 1 - 5;
        int segundaDaSegundaParte = 2 - 7;
        int terceiraDaSegundaParte = primeiraDaSegundaParte * segundaDaSegundaParte;
        int quartaDaSegundaParte = terceiraDaSegundaParte / 2;
        int quintaDaSegundaParte = Math.powExact(quartaDaSegundaParte, 2);

        int primeiraDaParteFinal = quintaDaPrimeiraParte - quintaDaSegundaParte;
        int segundaDaParteFinal = Math.powExact(primeiraDaParteFinal, 3);
        int terceiraDaParteFinal = Math.powExact(10, 3);
        int parteFinal = segundaDaParteFinal / terceiraDaParteFinal;

        System.out.println(parteFinal);
    }
}
