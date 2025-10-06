package fundamentos;

public class TiposPrimitivos {

    static void main() {

        final char letra = 'a';

        final boolean estaChovendo = true;
        final boolean estouComFome = false;

        final byte numero1 = 127;
        final short numero2 = 32_767;
        final int numero3 = 2_147_483_647;
        final long numero4 = 9_223_372_036_854_775_807L;

        float numeroReal1 = 123.45f;
        double numeroReal2 = 123.45;

        System.out.println(letra);
        System.out.println(estaChovendo);
        System.out.println(estouComFome);
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numeroReal1);
        System.out.println(numeroReal2);
    }
}
