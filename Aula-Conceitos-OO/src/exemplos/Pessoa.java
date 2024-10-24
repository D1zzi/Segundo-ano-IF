package exemplos;

public class Pessoa {
	// atributos
	public int idade = 1;
	public String nome = "Desconhecido";
	// valores padrão são atribuídos pela falta de valores dado no código
	
	
	// métodos (analogos às funções)
	// métodos começam or letra minúscula
	// quase sempre são descritos por verbos
	public void falarOla() {
		System.out.println("Olá mundo!");
	}
	// o uso do void é pela não presença de um return
	
	public void imprimir() {
		System.out.println(this.nome + " tem " + this.idade + " anos.");	
		// só trocar o "p1" por "this"
	}
	
	// exemplo de método com argumento (frase)
	public void falar(String frase) {
		System.out.println(this.nome + ": " + frase);
		// this é pra atributo, não para parametro
	}
	
	public String obterIdade() {
		String r = "Idade: " + this.idade;
		
		return r;
	}
	
	// método que retorna a idade no formato numérico
	public int obterIdadeint() {
		return this.idade;
	}
	
	// Criar um método chamado fazerAniversario onde a idade é incrementada em um unidade
	public void fazerAniversario() {
		this.idade++;
	}
	
	
	
	
	
	
}
