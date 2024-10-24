package exemplos;

public class Caneta extends Produto{

	private String cor;
	private double ponta;
	
	public Caneta(String descricao, double preco, String cor, double ponta) {
		super(descricao, preco);
		this.ponta = ponta;
		this.cor = cor;		
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public void imprimir() {
		
		System.out.println("-----------------");
		System.out.println(this.getDescricao());
		System.out.println(this.getPreco());
		System.out.println(this.getCor());
		System.out.println(this.getPonta());

	}
}
