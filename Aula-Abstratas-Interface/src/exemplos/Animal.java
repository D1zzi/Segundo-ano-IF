package exemplos;

abstract public class Animal {
	// colocar "abstract" antes ou depois do public
	
	
	private String nome;

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// m�todo abstrato
	// As subclasses concretas de animal ter�o de implementar o m�todo asbtrato abaixo
	
	abstract public void emitirSom();
	
}
