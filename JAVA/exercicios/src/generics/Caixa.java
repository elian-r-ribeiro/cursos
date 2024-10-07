package generics;

public class Caixa<T> {
	
	private T thing;
	
	public void storage(T thing) {
		this.thing = thing;
	}
	
	public T open() {
		return thing;
	}
}
