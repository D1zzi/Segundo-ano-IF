package exemplos;

public class Pessoa {
	// atributos
	public int idade = 1;
	public String nome = "Desconhecido";
	// valores padr�o s�o atribu�dos pela falta de valores dado no c�digo
	
	
	// m�todos (analogos �s fun��es)
	// m�todos come�am or letra min�scula
	// quase sempre s�o descritos por verbos
	public void falarOla() {
		System.out.println("Ol� mundo!");
	}
	// o uso do void � pela n�o presen�a de um return
	
	public void imprimir() {
		System.out.println(this.nome + " tem " + this.idade + " anos.");	
		// s� trocar o "p1" por "this"
	}
	
	// exemplo de m�todo com argumento (frase)
	public void falar(String frase) {
		System.out.println(this.nome + ": " + frase);
		// this � pra atributo, n�o para parametro
	}
	
	public String obterIdade() {
		String r = "Idade: " + this.idade;
		
		return r;
	}
	
	// m�todo que retorna a idade no formato num�rico
	public int obterIdadeint() {
		return this.idade;
	}
	
	// Criar um m�todo chamado fazerAniversario onde a idade � incrementada em um unidade
	public void fazerAniversario() {
		this.idade++;
	}
	
	
	
	
	
	
}
