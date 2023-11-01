package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {

		Carro civic = new Civic();
		Ferrari ferrari = new Ferrari(325);

		civic.speedUp();
		System.out.println(civic);
		civic.speedUp();
		System.out.println(civic);
		civic.speedUp();
		System.out.println(civic);
		
		System.out.println(ferrari.acSpeed());
		ferrari.turnOnTurbo();
		ferrari.turnOnAc();
		ferrari.turnOffAc();
		ferrari.speedUp();
		ferrari.brake();
		System.out.println(ferrari);
		ferrari.speedUp();
		ferrari.brake();
		System.out.println(ferrari);
		ferrari.speedUp();
		System.out.println(ferrari);
	}
}
