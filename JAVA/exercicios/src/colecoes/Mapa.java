package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> users = new HashMap<>();
		
		users.put(1, "Roberto");
		users.put(2, "Ricardo");
		users.put(3, "Rafaela");
		users.put(4, "Rebeca");
		
		System.out.println(users.size());
		System.out.println(users.isEmpty());
		
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		
		System.out.println(users.containsKey(1));
		System.out.println(users.containsValue("Rebeca"));
		
		System.out.println(users.get(4));
		
		System.out.println(users.remove(4));
		System.out.println(users.remove(3, "Gui"));
		
		for(int key: users.keySet()) {
			System.out.println(key);
		}
		
		for(String value: users.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> keyAndValue: users.entrySet()) {
			System.out.print(keyAndValue.getKey() + " ==> ");
			System.out.print(keyAndValue.getValue());
			System.out.println("\n" + keyAndValue);
		}
	}
}
