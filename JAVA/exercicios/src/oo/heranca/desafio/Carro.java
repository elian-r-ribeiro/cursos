package oo.heranca.desafio;

public abstract class Carro {

	public int currentSpeed;
	protected int maxSpeed = 200;
	protected int speedUpDelta = 20;
	protected int brakeDelta = 20;
	
	public void speedUp() {
		if (currentSpeed < maxSpeed) {
			currentSpeed += speedUpDelta;
		} else {
			System.out.println("Velocidade máxima atingida!");
		}
	}
	
	public void brake() {
		int brakingVariable = currentSpeed -= brakeDelta;
		
		if (currentSpeed > 0) {
			currentSpeed = brakingVariable;
		} else if (brakingVariable < 0) {
			currentSpeed = 0;
		}
	}
}
