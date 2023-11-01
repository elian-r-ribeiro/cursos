package oo.abstrato;

public abstract class Mamifero extends Animal{
	
	public abstract String breastfeed();
	
	@Override
	public String walk() {
		return "Saindo do lugar";
	}
}
