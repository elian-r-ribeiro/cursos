package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

	private final Date moment;
	
	public EventoChegadaAniversariante(Date moment) {
		this.moment = moment;
	}
	
	public Date getMoment() {
		return this.moment;
	}
}
