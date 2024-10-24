package sobrescrita;

public class Caderno extends Produto {
	private int numeroFolhas;
	private boolean capaDura;
	
	public Caderno(int codigo, int numeroFolhas, boolean capaDura) {
		super(codigo);
		this.numeroFolhas = numeroFolhas;
		this.capaDura = capaDura;
	}
	
	public void imprimir() {
		super.imprimir(); //vai puxar da outra classe
		System.out.println("Número de folhas: " + this.numeroFolhas);
		System.out.println("Capadura: " + this.capaDura);
	}
	
}
