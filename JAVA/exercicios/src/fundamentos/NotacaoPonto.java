package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		
		System.out.println(s);
		
		s = s.replace("X", "senhora");
		
		System.out.println(s);
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Elian".toUpperCase());
		
		String y = "Bom dia X".replace("X", "senhor")
				.concat("!!!").toUpperCase();
		
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		byte a = 3;
		System.out.println(a);
	}
}
