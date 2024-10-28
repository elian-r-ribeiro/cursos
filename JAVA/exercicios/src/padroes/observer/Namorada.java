package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{
	
	@Override
	public void arrived(EventoChegadaAniversariante event) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("Surpresa!!!!");
	}
}
