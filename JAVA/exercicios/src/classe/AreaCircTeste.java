package classe;

public class AreaCircTeste {
	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		a1.radius = 10;

		System.out.println(a1.calculateArea());
		System.out.println(AreaCirc.calculateArea(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
