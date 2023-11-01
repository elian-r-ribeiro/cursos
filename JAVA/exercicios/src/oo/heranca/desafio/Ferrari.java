package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean turnOnTurbo;
	private boolean turnOnAc;
	
	public Ferrari() {
		this(325);
	}

	public Ferrari(final int maxSpeed) {
		super(maxSpeed);
		setDelta(15);
	}
	
	@Override
	public void turnOnTurbo() {
		turnOnTurbo = true;
	}
	
	@Override
	public void turnOffTurbo() {
		turnOnTurbo = false;
	}
	
	@Override
	public void turnOnAc() {
		turnOnAc = true;
	}
	
	@Override
	public void turnOffAc() {
		turnOnAc = false;
	}
	
	@Override
	public int getDelta() {
		if(turnOnTurbo && !turnOnAc) {
			return 35;
		} else if(turnOnTurbo && turnOnAc) {
			return 30;
		} else if(!turnOnTurbo && !turnOnAc) {
			return 20;
		} else {
			return 15;
		}
	}
}
