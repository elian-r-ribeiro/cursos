package exerciciossolo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TryingStack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deque<String> booksStack = new ArrayDeque<>();
		TryingStackTest.mainProgram(input, booksStack);
		input.close();
	}
}
