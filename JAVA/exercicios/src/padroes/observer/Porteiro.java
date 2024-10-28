package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observers = 
			new ArrayList<>();
	
	public void registerObserver(ObservadorChegadaAniversariante observer) {
		observers.add(observer);
	}
	
	public void monitor() {
		Scanner input = new Scanner(System.in);
		
		String value = "";
		
		while(!"sair".equalsIgnoreCase(value)) {
			System.out.println("Aniversariante chegou? ");
			
			EventoChegadaAniversariante event = new EventoChegadaAniversariante(new Date());
			value = input.nextLine();
			
			if("sim".equalsIgnoreCase(value)) {
				observers.stream().forEach(o -> o.arrived(event));
				value = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		
		input.close();
	}
}
