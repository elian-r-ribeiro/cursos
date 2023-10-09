package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d1 = new Data();
		d1.year = 2021;

		var d2 = new Data(29, 05, 2004);

		String brazilianFormatDate1 = d1.getDateInBrazilianType();

		System.out.println(brazilianFormatDate1);
		System.out.println(d2.getDateInBrazilianType());

		d1.printDataInBrazilianType();
		d2.printDataInBrazilianType();
	}
}
