package oo.composicao;

public class Carro {

	final Motor engine;
	
	Carro() {
		this.engine = new Motor(this);
	}
	
	void speedUp() {
		if(engine.injectionFactor < 2.6) {
			engine.injectionFactor += 0.4;
		}
	}
	
	void brake() {
		if(engine.injectionFactor > 0.5) {
			engine.injectionFactor -= 0.4;
		}
	}
	
	void turnOn() {
		engine.isOn = true;
	}
	
	void turnOff() {
		engine.isOn = false;
	}
	
	boolean isOn() {
		return engine.isOn;
	}
}
