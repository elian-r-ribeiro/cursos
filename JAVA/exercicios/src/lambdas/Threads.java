package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable task1 = new Trabalho1();
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {}
				}
			}
		};
		Runnable task3 = Threads::task3;
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	static void task3() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
}
