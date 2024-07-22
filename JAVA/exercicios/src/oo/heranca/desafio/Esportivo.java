package oo.heranca.desafio;

public interface Esportivo {

	void turnOnTurbo();
	void turnOffTurbo();
	
	default int turboPhase() {
		return 1;
	}
}
