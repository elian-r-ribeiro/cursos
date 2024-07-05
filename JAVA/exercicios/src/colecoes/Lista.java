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
		list.add(new Usuario("Manu"));
		
		System.out.println(list.get(3));
		
		list.remove(1);
		
		list.remove(new Usuario("Manu"));
		list.remove(new Usuario("Manu"));
		list.remove(new Usuario("Manu"));
		
		System.out.println(list.contains(new Usuario("Lia")));
		
		for(Usuario u: list) {
			System.out.println(u);
		}
	}
}
