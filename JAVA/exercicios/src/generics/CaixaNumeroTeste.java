package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> boxA = new CaixaNumero<>();
		
		boxA.storage(1.2);
		
		Double thingA = boxA.open();
		
		System.out.println(thingA);
	}
}
