package exemplos;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	// 0: iguais (não faz nada)
	// 1: maior, "vai para o final"
	// -1: menor, "vai para o começo"
	public int compareTo(Pessoa o) {
		if(this.idade < o.idade) {
			return -1;
		}else if(this.idade > o.idade){
			return 1;
		}
		return this.nome.compareTo(o.nome);
	}
	
}
