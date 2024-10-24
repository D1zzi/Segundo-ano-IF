package exemplos;

public class Caderno extends Produto {

	private int numFolhas;
	private boolean capaDura;
	
	public Caderno(String descricao, double preco, int numFolhas, boolean capaDura) {
		super(descricao, preco);
		this.numFolhas = numFolhas;
		this.capaDura = capaDura;		
	}
	
	public int getNumFolhas() {
		return numFolhas;
	}

	public void setNumFolhas(int numFolhas) {
		this.numFolhas = numFolhas;
	}

	public boolean isCapaDura() {
		return capaDura;
	}

	public void setCapaDura(boolean capaDura) {
		this.capaDura = capaDura;
	}

	public void imprimir() {
		
		System.out.println("-----------------");
		System.out.println(this.getDescricao());
		System.out.println(this.getPreco());
		System.out.println(this.getNumFolhas());
		System.out.println(this.isCapaDura());
		
	}
	
}
