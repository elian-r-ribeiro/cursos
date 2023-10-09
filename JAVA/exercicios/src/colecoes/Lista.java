package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> list = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		list.add(u1);
		list.add(new Usuario("Carlos"));
		list.add(new Usuario("Lia"));
		list.add(new Usuario("Bia"));
		list.add(new Usuario("Manu"));
		
		System.out.println(list.get(3)); 
		
		System.out.println(">>>> " + list.remove(1));
		System.out.println(list.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + list.contains(new Usuario("Lia")));
		
		for(Usuario user: list) {
			System.out.println(user);
		}
	}
}
