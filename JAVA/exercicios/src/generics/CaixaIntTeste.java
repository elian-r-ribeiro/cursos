package generics;

public class CaixaIntTeste {

	
	public static void main(String[] args) {
		
		CaixaInt boxA = new CaixaInt();
		
		boxA.storage(123);
		
		Integer thingA = boxA.open();
		
		System.out.println(thingA);
	}
}
