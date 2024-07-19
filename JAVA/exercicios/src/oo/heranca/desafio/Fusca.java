package oo.heranca.desafio;

public class Fusca extends Carro {

	private static int maxSpeed = 120;
	
	public Fusca() {
		super(maxSpeed);
	}
	
	@Override
	public void speedUp() {
		if (super.currentSpeed < maxSpeed) {
			super.currentSpeed += 10;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	@Override
	public void brake() {
		if (super.currentSpeed > 0) {
			super.currentSpeed -= 10;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
