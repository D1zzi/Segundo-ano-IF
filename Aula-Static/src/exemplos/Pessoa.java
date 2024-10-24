package exemplos;

public class Pessoa {

	private String nome;
	public static int contador = 0;
	public static final int MAXIMO = 1000;
	// quando est� em italico significa um objeto est�tico

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
