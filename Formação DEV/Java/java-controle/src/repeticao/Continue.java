package repeticao;

public class Continue {

    static void main() {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}
