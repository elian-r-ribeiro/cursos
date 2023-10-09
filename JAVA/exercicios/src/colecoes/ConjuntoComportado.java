package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> approvedsList = new HashSet<>();
		SortedSet<String> approvedsList = new TreeSet<>();
		
		approvedsList.add("Ana");
		approvedsList.add("Carlos");
		approvedsList.add("Luca");
		approvedsList.add("Pedro");
		
		for(String candidates: approvedsList) {
			System.out.printf("[%s]", candidates);
		}
		
		System.out.println();
		
		Set<Integer> numbers = new HashSet<>();
		//SortedSet<Integer> nums = new TreeSet<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(120);
		numbers.add(6);
		
		for(int number: numbers) {
			System.out.printf("[%d]", number);
		}
	}
}
