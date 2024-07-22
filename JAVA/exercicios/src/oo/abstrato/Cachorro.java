package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String walk() {
		return "Usando as patas";
	}
	
	@Override
	public String breastfeed() {
		return "Usando leite";
	}
}
