package exemplos;

public class Pessoa {

	private String nome;
	public static int contador = 0;
	public static final int MAXIMO = 1000;
	// quando está em italico significa um objeto estático

	public Pessoa(String nome) {
		super();
		this.nome = nome;
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
