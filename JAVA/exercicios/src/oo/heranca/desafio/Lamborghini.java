package oo.heranca.desafio;

public class Lamborghini extends Carro {

	@Override
	void speedUp() {
		if (super.currentSpeed < 350) {
			super.currentSpeed += 40;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	@Override
	void brake() {
		if (super.currentSpeed > 0) {
			super.currentSpeed -= 40;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
