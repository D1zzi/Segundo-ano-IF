package exercicio01;

public class Circulo extends FiguraGeometrica {
	
	private double raio;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaPerimetro() {
		double P = (2*3.14)*raio;
		return P;
	}

	@Override
	public double calculaArea() {
		double A  = 3.14*(raio*raio);
		return A;
	}
	
}
