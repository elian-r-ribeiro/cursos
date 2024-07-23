package lambdas;

@FunctionalInterface
public interface Calculo {

	double execute(double a, double b);
	
	default String cool() {
		return "cool";
	}
	
	static String veryCool() {
		return "very cool";
	}
}
