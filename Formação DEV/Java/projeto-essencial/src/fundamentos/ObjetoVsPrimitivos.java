package fundamentos;

public class ObjetoVsPrimitivos {

    static void main() {

        int a = 10;
        System.out.println(a);

        String b = "texto";
        System.out.println(b.toUpperCase());

        Integer c = 1234;
        System.out.println(c.doubleValue());

        double d1 = 1234;
        System.out.println(d1);

        Double d2 = 1234.56;
        System.out.println(d2.intValue());
    }
}
