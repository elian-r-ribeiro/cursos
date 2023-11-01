package exerciciossolo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TryingQueue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<Long> peopleQueue = new LinkedList<>();
		TryingQueueTest.mainProgram(input, peopleQueue);
		input.close();
	}
}
