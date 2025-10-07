package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    static void main() {

        double a = 1;
        System.out.println(a);

        int b = (int) 1.0;
        System.out.println(b);

        long c = 123456;
        byte d = (byte) c;
        System.out.println(d);
    }
}
