package ex2;

public class Produto {

	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor: " + this.valor);
	}
	
}
