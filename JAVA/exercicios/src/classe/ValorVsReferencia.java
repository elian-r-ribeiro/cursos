package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (objeto)

		d1.day = 31;
		d2.month = 12;
		d1.year = 2025;

		System.out.println(d1.getDateInBrazilianType());
		System.out.println(d2.getDateInBrazilianType());

		resetDateToDefaultDate(d1);

		System.out.println(d1.getDateInBrazilianType());
		System.out.println(d2.getDateInBrazilianType());
		
		int c = 5;
		changePrimitive(c);
		System.out.println(c);
	}

	static void resetDateToDefaultDate(Data d) {
		d.day = 1;
		d.month = 1;
		d.year = 1970;
	}
	
	static void changePrimitive(int a) {
		a++;
	}
}
