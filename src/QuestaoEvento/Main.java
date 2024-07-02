package QuestaoEvento;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {	
		
		Participante participante1 = new Participante(
				"Fabio",
				"fabio.leal.sc@gmail.com",
				TipoIngresso.MEIO);
		
		Palestrante palestrante = new Palestrante(
				"Manja muito de programação, Infraestrutura e de confeitaria",
				"Como empreender em 2025",
				"Geovane",
				"geovane@algumacoisa.com"
				);
		
		
		Calendar dataEvento = Calendar.getInstance();
		dataEvento.set(2024, 11, 30);
		
		
		Evento eventoPrincipal = new Evento(
				"Evento sobre empreendimento",
				"Metalúrgica Mor",
				dataEvento,
				palestrante
				);
		
		
		eventoPrincipal.addParticipante(participante1);
		
		System.out.println(eventoPrincipal.toString());
	}

}
