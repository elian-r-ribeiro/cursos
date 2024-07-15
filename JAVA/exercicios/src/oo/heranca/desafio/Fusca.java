package oo.heranca.desafio;

public class Fusca extends Carro {

	@Override
	void speedUp() {
		if (super.currentSpeed < 120) {
			super.currentSpeed += 10;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	@Override
	void brake() {
		if (super.currentSpeed > 0) {
			super.currentSpeed -= 10;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
