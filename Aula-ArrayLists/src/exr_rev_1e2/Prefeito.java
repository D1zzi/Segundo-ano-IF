package exr_rev_1e2;

public class Prefeito {
	
	private String nome;
	private String partido;
	
	public Prefeito(String nome, String partido) {
		super();
		this.nome = nome;
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
}
