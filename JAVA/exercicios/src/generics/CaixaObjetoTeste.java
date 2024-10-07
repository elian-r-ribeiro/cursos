package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto box1 = new CaixaObjeto();
		
		box1.storage(2.3);
		
		Double thing = (Double) box1.open();
		
		System.out.println(thing);
		
		CaixaObjeto box2 = new CaixaObjeto();
		
		box2.storage("Olá!");
		
		String thing2 = (String) box2.open();
		
		System.out.println(thing2);
	}
}
