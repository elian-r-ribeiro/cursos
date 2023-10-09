package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> users = new HashSet<>();
		
		users.add(new Usuario("Pedro"));
		users.add(new Usuario("Ana"));
		users.add(new Usuario("Guilherme"));
		
		boolean searchResult = users.contains(new Usuario("Guilherme"));
		System.out.println(searchResult);
	}
}
