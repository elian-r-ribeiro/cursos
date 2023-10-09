package exerciciossolo;

import java.util.Scanner;
import java.util.Set;

public class TryingSet {
	
	static void addElementString(Scanner input, Set<String> set) {
		System.out.println("Digite o elemento que deseja adicionar: ");
		
		if(input.hasNext()) {
			String element = input.next();
			set.add(element);
		}else {
			System.out.println("Valor inválido detectado, encerrando programa!");
			System.exit(1);
		}
	}

	static void addElementInt(Scanner input, Set<Integer> set) {
		System.out.println("Digite o elemento que deseja adicionar: ");
		
		if(input.hasNextInt()) {
			int element = input.nextInt();
			set.add(element);
		}else {
			System.out.println("Valor inválido detectado, encerrando programa!");
			System.exit(1);
		}
	}
	
	static void addElementDouble(Scanner input, Set<Double> set) {
		System.out.println("Digite o elemento que deseja adicionar: ");
		
		if(input.hasNextDouble()) {
			double element = input.nextDouble();
			set.add(element);
		}else {
			System.out.println("Valor inválido detectado, encerrando programa!");
			System.exit(1);
		}
	}
}
