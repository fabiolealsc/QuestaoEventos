package QuestaoEvento;

public class Participante extends Pessoa{
	
	private TipoIngresso tipoIngresso;
	
	public Participante(String nome, String email, TipoIngresso tipoIngresso) {
		super(nome, email);
		this.tipoIngresso = tipoIngresso;
	}
	
	public String getTipoIngresso() {
		
		return this.tipoIngresso.toString();
	
	}
}
