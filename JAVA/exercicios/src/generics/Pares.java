package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {

	private final Set<Par<K, V>> items = new LinkedHashSet<>();
	
	public void add(K key, V value) {
		if(key == null) return;
		
		Par<K, V> newPair = new Par<K, V>(key, value);
		
		if(items.contains(newPair)) {
			items.remove(newPair);
		}
		
		items.add(newPair);
	}
	
	public V getValue(K key) {
		if(key == null) return null;
		
		Optional<Par<K, V>> optionalPair = items.stream().
				filter(p -> key.equals(p.getKey())).
				findFirst();
		
		return optionalPair.isPresent() ? optionalPair.get().getValue() : null;
	}
}
