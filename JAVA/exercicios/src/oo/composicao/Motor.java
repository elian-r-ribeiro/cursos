package oo.composicao;

public class Motor {

	Carro car;
	
	Motor(Carro car){
		this.car = car;
	}
	
	boolean isOn = false;
	double injectionFactor = 1;

	int rpm() {
		if (!isOn) {
			return 0;
		} else {
			return (int) Math.round(injectionFactor * 3000);
		}
	}
}
