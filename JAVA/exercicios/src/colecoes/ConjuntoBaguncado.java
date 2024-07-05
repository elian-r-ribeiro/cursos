package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(1.2);
		set.add(true);
		set.add("Teste");
		set.add(1);
		set.add('x');
		
		System.out.println(set.size());
		
		set.add("Teste");
		set.add(1);
		
		System.out.println(set.size());
		System.out.println(set.remove("Teste"));
		System.out.println(set.size());
		System.out.println(set.contains("Teste"));
		System.out.println(set.contains('x'));
		System.out.println(set.contains(true));
		
		Set numbers = new HashSet();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
		set.addAll(numbers);
		
		System.out.println(set);
		
		set.retainAll(numbers);
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}
}
