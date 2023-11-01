package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> {return x + y;};
		System.out.println(soma.exec(2, 3));
		System.out.println(soma.legal());
		
		Calculo multiplicar = (x, y) -> x * y;
		System.out.println(multiplicar.exec(2, 3));
		System.out.println(Calculo.muitoLegal());
	}
}
