package sobrecarga;

public class Pessoa {
	private String nome;
	
	//public void falar(String nome) {
	//	System.out.println(nome + ": Olá!");
	//}
	public void falar() {
		System.out.println("Bom dia!");
	}
	
	public void falar(String frase) {
		System.out.println(frase);
	}
	
	public void falar(String frase, int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println(frase);
		}
	}
	
	
	
	
	public void somar(int a, int b) {
		System.out.println(a + b);
	}
	
	public void somar(double b, int a) {
		System.out.println(a + b);
	}
}
