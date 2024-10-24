package exemplos;

public class Exemplo {

	public static void main(String[] args) {
		
		// construção de um objeto da classe Computador
		// c1 é o objeto
		Computador c1 = new Computador();
		c1.marca = "Dell";
		c1.modelo = "Pavillion";
		c1.processador = "Pentium 100";
		c1.resolucao = "640x480";
		
		// construir um novo objeto c2
		Computador c2 = new Computador();
		
		c2.marca = "Acer";
		c2.modelo = "Aspire";
		c2.processador = "i3 11ª geração";
		c2.resolucao = "1366 x 768";
		
		// imprimam na tela os valores dos atributos de c1 e c2
		
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.processador);
		System.out.println(c1.resolucao);
		
		System.out.println();
		
		System.out.println(c2.marca);
		System.out.println(c2.modelo);
		System.out.println(c2.processador);
		System.out.println(c2.resolucao);
		
		
	}

}
