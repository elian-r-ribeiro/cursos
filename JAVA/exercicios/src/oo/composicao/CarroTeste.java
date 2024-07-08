package oo.composicao;

public class CarroTeste {

	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.isOn());
		
		c1.turnOn();
		
		System.out.println(c1.isOn());
		
		System.out.println(c1.engine.rpm());
		
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		
		System.out.println(c1.engine.rpm());
		
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		
		System.out.println(c1.engine.rpm());
	}
}
