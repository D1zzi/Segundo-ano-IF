package exemplos;

public class Aluno extends Pessoa {
	
	protected String matricula;
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
	}
	
}
