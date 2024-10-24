package exr_rev_1e2;

public class Cidade {

	private String nome;
	private String estado;
	private String pais;
	private Prefeito prefeito;
	
	public Cidade(String nome, String estado, String pais, Prefeito prefeito) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.pais = pais;
		this.prefeito = prefeito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}
	
}
