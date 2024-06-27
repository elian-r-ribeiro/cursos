package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false; // Trabalho na terça (V ou F)
		boolean trabalho2 = false; // Trabalho na quinta (V ou F)
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		boolean estaMaisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou TV 50? " + comprouTv50);
		System.out.println("Comprou TV 25? " + comprouTv32);
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Está mais saudável? " + estaMaisSaudavel);
	}
}
