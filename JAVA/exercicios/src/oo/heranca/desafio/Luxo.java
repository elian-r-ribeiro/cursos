package oo.heranca.desafio;

public interface Luxo {
	
	void turnOnAc();
	void turnOffAc();
	default int acSpeed() {
		return 0;
	}
}
