package sobrescrita;

public class Produto {
	private int codigo;

	public Produto(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	public void imprimir() {
		System.out.println("Código: " + this.codigo);
	}

}
