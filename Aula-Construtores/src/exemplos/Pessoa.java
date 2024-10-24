package exemplos;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;
	private String endereco;
	private Cidade cidade;
	
	// O construtor é um método, não tem retorno, pois o objeto que retorna é ele mesmo
	public Pessoa() {
		this.nome = "Desconhecido(a)";
		this.sobrenome = "Desconhecido(a)";
		this.idade = 0;
		this.altura = 0.1;
		this.endereco = "Desconhecido";
	}
	
	public Pessoa(String nome, String sobrenome, int idade, double altura, String endereco, Cidade cidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.endereco = endereco;
		this.cidade = cidade;
	}




	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
