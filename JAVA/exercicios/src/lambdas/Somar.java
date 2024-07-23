package lambdas;

public class Somar implements Calculo {

	@Override
	public double execute(double a, double b) {
		return a + b;
	}
}
