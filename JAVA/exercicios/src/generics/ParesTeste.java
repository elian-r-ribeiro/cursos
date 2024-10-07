package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> people = new Pares<>();
		
		people.add(1, "Maria");
		people.add(2, "Pedro");
		people.add(3, "Gui");
		people.add(4, "Ana");
		people.add(2, "Rebeca");
		
		System.out.println(people.getValue(1));
		System.out.println(people.getValue(4));
		System.out.println(people.getValue(2));
	}
	
}
