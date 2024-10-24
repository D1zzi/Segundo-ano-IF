package exercicio01;

public class Retangulo extends FiguraGeometrica {

	private double lado1;
	private double lado2;
	
	public Retangulo(String nome, double lado1, double lado2) {
		super(nome);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double calculaPerimetro() {
		double P = 2*(lado1 * lado2);
		return P;
	}

	@Override
	public double calculaArea() {
		double A = lado1 * lado2;
		return A;
	}
	
}
