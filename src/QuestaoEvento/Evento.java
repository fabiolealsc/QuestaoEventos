package QuestaoEvento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Evento {
	
	private String descricao;
	
	private String local;
	
	private Calendar data;
	
	private Palestrante palestrante;
	
	private List<Participante> LstInscritos = new ArrayList<Participante>();
	
	public Evento(String descricao, String local, Calendar data, Palestrante palestrante) {
		this.descricao = descricao;
		this.local = local;
		this.data = data;
		this.palestrante = palestrante;
	}
	
	public void addParticipante(Participante participante) {
		LstInscritos.add(participante);
	}
	
	public String toString() {
		
		String participantesString = "";
		
		int contador = 1;
		
		for(Participante participante : this.LstInscritos) {
			participantesString += "  Participante " + contador + ":" +
					"\n    Nome: " + participante.getNome() + 
					"\n    Email:" + participante.getEmail() + 
					"\n    Tipo de ingresso: " + participante.getTipoIngresso() +"\n";  
			contador++;
		}
		
		
		return "\n - Descrição do evento: " + this.descricao +
				"\n - Local do evento: " + this.local +
				"\n - Data do evento: " + this.data.getTime() +
				"\n - Palestrante: " + this.palestrante.getNome() +
				"\n - Tema da palestra: " + this.palestrante.getTemaDaPalestra() +
				"\n - Email do palestrante: " + this.palestrante.getEmail() +
				"\n - Biografia do Palestrante: " + this.palestrante.getBiografia() +
				"\n - Participantes{\n " + participantesString + "}";
	}
}
