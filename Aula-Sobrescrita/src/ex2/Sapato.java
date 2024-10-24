package ex2;

public class Sapato extends Produto {
	
	private int tamanho;
	
	public Sapato(String nome, double valor, int tamanho) {
		super(nome, valor);
		this.tamanho = tamanho;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Tamanho do Sapato: " + this.tamanho);
	}
	
}
