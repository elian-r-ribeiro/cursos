package generics;

import java.util.Objects;

public class Par<K, V> {

	private K key;
	private V value;
	
	public Par() {
		
	}
	
	public Par(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(key, other.key);
	}
	
	
}
