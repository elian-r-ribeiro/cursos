package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		
		System.out.println(car1.isOn());
		
		car1.turnOn();
		System.out.println(car1.isOn());
		
		System.out.println(car1.engine.rpm());
		
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		
		System.out.println(car1.engine.rpm());
		
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		
		//Faltou encapsulamento
		//car1.engine.injectionFactor = -30;
		
		System.out.println(car1.engine.rpm());
	}
}
