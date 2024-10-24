package ex2;

public class Camiseta extends Produto {
	
	private String cor;

	public Camiseta(String nome, double valor, String cor) {
		super(nome, valor);
		this.cor = cor;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Cor da camiseta: " + this.cor);
	}

}
