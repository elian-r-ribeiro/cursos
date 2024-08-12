package streams;

public class MediaTeste {

	public static void main(String[] args) {
        
        Media a1 = new Media().add(8.3).add(6.7);
        Media a2 = new Media().add(7.9).add(6.6);

        System.out.println(a1.getAvarage());
        System.out.println(a2.getAvarage());

        System.out.println(Media.combine(a1, a2).getAvarage());
    }
}
