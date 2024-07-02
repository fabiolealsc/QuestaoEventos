package QuestaoEvento;

public class Palestrante extends Pessoa{
	
	private String biografia;
	
	private String temaDaPalestra;
	
	public Palestrante(String biografia, String temaDaPalestra, String nome, String email) {
		super(nome, email);
		this.biografia = biografia;
		this.temaDaPalestra = temaDaPalestra;
	}
	
	public String getBiografia() {
		return this.biografia;
	}
	
	public String getTemaDaPalestra() {
		return this.temaDaPalestra;
	}
}
