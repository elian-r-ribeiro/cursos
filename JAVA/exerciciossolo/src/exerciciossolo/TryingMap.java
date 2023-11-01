package exerciciossolo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TryingMap {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Map<Integer, String> personRegistry = new HashMap<>();
		TryingMapTest.mainProgram(personRegistry, input);
		input.close();
	}
}
