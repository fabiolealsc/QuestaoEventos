package QuestaoEvento;

public class Pessoa {
	
	private String nome;
	
	private String email;
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
}
