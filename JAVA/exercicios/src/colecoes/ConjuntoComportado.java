package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Set<String> listApproved = new HashSet<>();
		SortedSet<String> listApproved = new TreeSet<>();
		
		listApproved.add("Ana");
		listApproved.add("Carlos");
		listApproved.add("Luca");
		listApproved.add("Pedro");
		
		System.out.println(listApproved);
		
		SortedSet<Integer> nums = new TreeSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
	}
}
