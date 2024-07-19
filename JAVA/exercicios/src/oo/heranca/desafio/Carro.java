package oo.heranca.desafio;

public class Carro {

	public int currentSpeed;
	protected int maxSpeed = 200;
	
	public Carro(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {
		if (currentSpeed < maxSpeed) {
			currentSpeed += 20;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	public void brake() {
		if (currentSpeed > 0) {
			currentSpeed -= 20;
		} else {
			System.out.println("O carro está parado!");
		}
	}
}
