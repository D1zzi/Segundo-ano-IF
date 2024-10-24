package exemplos;

public class Teste {

	public static void main(String[] args) {
		
		// Matematica
		int s = Matematica.somar(10, 20);
		System.out.printf("Soma = %d%n%n", s);
		
		
		
		// Pessoa
		System.out.println("PESSOA:");
		System.out.printf("Máximo de pessoas: %d%n%n",Pessoa.MAXIMO);
		
		System.out.printf("Contador = %d%n",Pessoa.contador);
		Pessoa p1 = new Pessoa("Maria");
		Pessoa p2 = new Pessoa("Jorge");
		System.out.printf("Contador = %d%n",Pessoa.contador);
		
		System.out.println(Math.PI);
		// Math.PI é uma constante usada ao longo do ano
	}

}
