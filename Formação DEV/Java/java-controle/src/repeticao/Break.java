package repeticao;

public class Break {

    static void main() {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
