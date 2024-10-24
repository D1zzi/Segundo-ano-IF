package exemplos;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Pet pet;
	
	// "set" serve para inserir um valor em um atributo
	// "set" n�o possui retorno ( VOID )
	// "set" possui um par�metro do mesmo tipo//classe do atributo

	public void setNome(String nome) {
		this.nome = nome;
	}
	// "get" serve para ler um valor de um atributo
	// "get" possui retorno do tipo/classe do atributo
	// "get" n�o possui par�metro
	// N�O COLOCAR PRINT DENTRO DE "GET" E "SET"
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Pet getPet() {
		return this.pet;
	}
		
}
