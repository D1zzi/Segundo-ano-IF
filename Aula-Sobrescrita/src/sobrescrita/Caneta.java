package sobrescrita;

public class Caneta extends Produto {
	private String cor;
	private String marca;
	
	public Caneta(int codigo, String cor, String marca) {
		super(codigo);
		this.cor = cor;
		this.marca = marca;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Cor: " + this.cor);
		System.out.println("Marca: " + this.marca);
	}

}
