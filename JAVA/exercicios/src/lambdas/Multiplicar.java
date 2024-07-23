package lambdas;

public class Multiplicar implements Calculo {

	@Override
	public double execute(double a, double b) {
		return a * b;
	}
}
