package oo.heranca.desafio;

public class Lamborghini extends Carro implements Esportivo {
	
	public Lamborghini() {
		maxSpeed = 350;
		speedUpDelta = 40;
		brakeDelta = 40;
	}
	
	@Override
	public void turnOnTurbo() {
		speedUpDelta = 50;
	}
	
	@Override
	public void turnOffTurbo() {
		speedUpDelta = 40;
	}
}
