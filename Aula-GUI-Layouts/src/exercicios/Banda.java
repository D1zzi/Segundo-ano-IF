package exercicios;

public class Banda {
	private String nome;
	private String genero;
	private String integrantes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}
	public Banda(String nome, String genero, String integrantes) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.integrantes = integrantes;
	}
	
}	
