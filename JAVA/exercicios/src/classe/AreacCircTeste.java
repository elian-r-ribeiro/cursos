package classe;

public class AreacCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		// a1.pi = 10;
		a1.raio = 25;
		// AreaCirc.pi = 3.1415;
		
		System.out.println(AreaCirc.pi);
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(25));
	}
}
