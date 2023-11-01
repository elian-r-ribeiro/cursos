package exerciciossolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryingList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<String> tasksList = new ArrayList<>();
		TryingListTest.mainProgram(input, tasksList);
		input.close();
	}
}
