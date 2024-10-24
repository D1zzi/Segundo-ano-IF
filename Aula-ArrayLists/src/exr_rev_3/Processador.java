package exr_rev_3;

public class Processador {

	private double frequencia;
	private String marca;
	
	public Processador(double frequencia, String marca) {
		super();
		this.frequencia = frequencia;
		this.marca = marca;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
