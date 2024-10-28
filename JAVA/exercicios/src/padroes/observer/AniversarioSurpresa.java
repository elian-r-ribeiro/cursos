package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada girlFriend = new Namorada();
		Porteiro doorman = new Porteiro();
		
		doorman.registerObserver(girlFriend);
		doorman.registerObserver(e -> {
			System.out.println("Surpresa via Lambda!");
			System.out.println("Ocorreu em: " + e.getMoment());
		});
		doorman.monitor();
	}
}
