package generics;

public class CaixaObjeto {

	private Object thing;
	
	public void storage(Object thing) {
		this.thing = thing;
	}
	
	public Object open() {
		return thing;
	}
}
