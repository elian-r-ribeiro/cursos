package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "...";
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5;
		
		double d; // Variável foi declarada
		d = 123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi usada
		
		//var e;
		//e = 123.45
		
		var f = 12; // Inteiro
		//f = 12.01;
		System.out.println(f);
	}
}
