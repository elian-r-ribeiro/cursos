package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribuição por valor (Tipo primitivo)
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.day = 29;
		d2.month = 12;
		d1.year = 2002;
		
		System.out.println(d1.getFullDate());
		System.out.println(d2.getFullDate());
		
		setDefaultDate(d1);
		
		System.out.println(d1.getFullDate());
		System.out.println(d2.getFullDate());
		
		int c = 5;
		
		changePrimitive(c);
		
		System.out.println(c);
	}
	
	static void setDefaultDate(Data d) {
		d.day = 1;
		d.month = 1;
		d.year = 1970;
	}
	
	static void changePrimitive(int a) {
		a++;
	}
}
