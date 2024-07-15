package oo.heranca.desafio;

public class Carro {

	int currentSpeed;
	
	void speedUp() {
		if (currentSpeed < 200) {
			currentSpeed += 20;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	void brake() {
		if (currentSpeed > 0) {
			currentSpeed -= 20;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
