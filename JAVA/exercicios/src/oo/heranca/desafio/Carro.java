package oo.heranca.desafio;

public class Carro {

	private final int MAXSPEED;
	private int currentSpeed;
	private int delta = 5;

	public Carro(int maxSpeed) {
		this.MAXSPEED = maxSpeed;
	}

	public void speedUp() {
		if (currentSpeed + getDelta() > MAXSPEED) {
			currentSpeed = MAXSPEED;
			return;
		}
		currentSpeed += getDelta();
	}

	public void brake() {
		if (currentSpeed <= 0) {
			currentSpeed = 0;
			return;
		}
		currentSpeed -= 5;
	}

	public String toString() {
		return "Velocidade atual: " + currentSpeed + "kmph";
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
