package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double temperatura_em_fahrenheit = 86;
		final int ajuste = 32;
		final double fator = 5.0 / 9.0;
		double temperatura_em_celsius = (temperatura_em_fahrenheit - ajuste) * fator;
		System.out.println(temperatura_em_fahrenheit + " °F é " + temperatura_em_celsius +" °C.");
		
		temperatura_em_fahrenheit = 0;
		temperatura_em_celsius = (temperatura_em_fahrenheit - ajuste) * fator;
		System.out.println(temperatura_em_fahrenheit + " °F é " + temperatura_em_celsius +" °C.");
	}
}
