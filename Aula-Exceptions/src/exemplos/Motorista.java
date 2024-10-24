package exemplos;

public class Motorista {
	public int idade;

	public Motorista(int idade) throws Exception {
		this.setIdade(idade);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		if(idade < 18) {
			throw new Exception("O motorista não pode ser menor.");
		} // o if termina no throw, sempre
		
		this.idade = idade;
		
	}
	
}
