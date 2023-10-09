package classe;

public class AreaCirc {

	double radius;
	static final double PI = 3.1415;

	AreaCirc(double firstRadius) {
		radius = firstRadius;
	}

	double calculateArea() {
		return PI * Math.pow(radius, 2);
	}

	static double calculateArea(double radius) {
		return PI * Math.pow(radius, 2);
	}
}
