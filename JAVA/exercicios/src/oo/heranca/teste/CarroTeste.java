package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Corolla;
import oo.heranca.desafio.Fusca;
import oo.heranca.desafio.Lamborghini;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Corolla();
		Carro c2 = new Fusca();
		Carro c3 = new Lamborghini();
		
		c1.speedUp();
		c2.speedUp();
		c3.speedUp();
		
		System.out.println(c1.currentSpeed);
		System.out.println(c2.currentSpeed);
		System.out.println(c3.currentSpeed);
		
		c1.brake();
		c2.brake();
		c3.brake();
		
		System.out.println(c1.currentSpeed);
		System.out.println(c2.currentSpeed);
		System.out.println(c3.currentSpeed);
	}
}
