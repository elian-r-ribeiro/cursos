package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> boxA = new Caixa<>();
		
		boxA.storage("Da hora.");
		
		String thingA = boxA.open();
		
		System.out.println(thingA);
		
		Caixa<Double> boxB = new Caixa<>();
		
		boxB.storage(2.3);
		
		Double thingB = boxB.open();
		
		System.out.println(thingB);
	}
}
