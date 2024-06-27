package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final int adjust = 32;
		final double factor = 5.0/9.0;
		double fahrenheit = 86;
		double celsius = (fahrenheit - adjust) * factor;
		
		System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius");
		
		fahrenheit = 150;
		celsius = (fahrenheit - adjust) * factor;
		
		System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius");
	}
}
