package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá mundo".charAt(2));
		
		String s = "Boa tarde";
	
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Elian";
		var sobrenome = "Ribeiro";
		var idade = 20;
		var salario = 14234.5;
		
		System.out.println("O " + nome + " " + sobrenome + " tem "
				+ idade + " anos e ganha $" + salario);
		System.out.printf("O %s %s tem %d anos e ganha $%.2f", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO %s %s tem %d anos e "
				+ "ganha $%.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		String maisUmaFrase = String.format("O " + nome + " " + 
		sobrenome + " tem " + idade + " anos e ganha $" + salario);
		
		System.out.println(maisUmaFrase);
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
