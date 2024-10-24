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
	
	// método abstrato
	// As subclasses concretas de animal terão de implementar o método asbtrato abaixo
	
	abstract public void emitirSom();
	
}
