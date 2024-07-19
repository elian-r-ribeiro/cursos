package oo.heranca.desafio;

public class Lamborghini extends Carro {

	private static int maxSpeed = 350;
	
	public Lamborghini() {
		super(maxSpeed);
	}
	
	@Override
	public void speedUp() {
		if (super.currentSpeed < maxSpeed) {
			super.currentSpeed += 40;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	@Override
	public void brake() {
		if (super.currentSpeed > 0) {
			super.currentSpeed -= 40;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
