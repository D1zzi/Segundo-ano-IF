package exr04;

public class Equipe {
	
	public String nome;
	public Cidade origem;
	public int vitorias;
	public int empates;
	public int derrotas;
	
	public int pontuacao() {
		return this.vitorias*3 + this.empates;
	}
	
}
