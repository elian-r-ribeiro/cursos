package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		// Parte 1
		int a1 = 6;
		int b1 = 3 + 2;
		int c1 = a1 * b1;
		double d1 = Math.pow(c1, 2);
		int e1 = 3 * 2;
		double f1 = d1 / e1;
		
		// Parte 2
		int a2 = 1 - 5;
		int b2 = 2 - 7;
		int c2 = a2 * b2;
		int d2 = c2 / 2;
		double f2 = Math.pow(d2, 2);
		
		//Parte 3
		double a3 = f1 - f2;
		
		//Parte 4
		double a4 = Math.pow(a3, 3);
		double b4 = Math.pow(10, 3);
		
		//Parte 5 (final)
		double a5 = a4 / b4;
		
		System.out.println(a5);
	}
}
