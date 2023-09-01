package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean work1 = false;
		boolean work2 = false;
		
		boolean bought50TV = work1 && work2;
		boolean bought32TV = work1 ^ work2;
		boolean boughtIceCream = work1 || work2;
		boolean healthier = !boughtIceCream;
		
		
		System.out.println("Comprou a TV de 50 polegadas? " + bought50TV);
		System.out.println("Comprou a TV de 32 polegadas? "+ bought32TV);
		System.out.println("Tomou sorvete? " + boughtIceCream);
		System.out.println("Está mais saudável porque não tomou sorvete? " + healthier);
		
	}
}
