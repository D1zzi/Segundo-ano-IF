package exr_rev_3;

public class Computador {

	private String marca;
	private double preço;
	private Disco disco;
	private Memoria memoria;
	private Processador processador;
	
	public Computador(String marca, double preço, Disco disco, Memoria memoria, Processador processador) {
		super();
		this.marca = marca;
		this.preço = preço;
		this.disco = disco;
		this.memoria = memoria;
		this.processador = processador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}	
	
}
