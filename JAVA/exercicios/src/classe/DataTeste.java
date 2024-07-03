package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(29, 05, 2004);
		String finalDate1 = d1.getFullDate();
		
		Data d2 = new Data();
		String finalDate2 = d2.getFullDate();
		
		System.out.println(finalDate1);
		System.out.println(finalDate2);
	}
}
