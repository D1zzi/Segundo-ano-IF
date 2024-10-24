package ex1;

public class Produto {

	private int codigo;
	private String nome;
	private Fabricante fabricante;
	private double valor;
	
	public Produto(int codigo, String nome, Fabricante fabricante, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fabricante = fabricante;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
