package exr03;

public class Filme {
	
	public Diretor diretor;
	public Cidade cidade;
	
	public void imprimir() {
		System.out.println();
		System.out.println("Diretor: " + this.diretor.nome + " " + this.diretor.sobrenome + ", tem " + this.diretor.premios + " pr�mios.");
		System.out.println();
		System.out.println("Cidade: " + this.cidade.nome);
		System.out.println("Pa�s: " + this.cidade.pais);
		System.out.println("Estado: " + this.cidade.estado);
		System.out.println("N�mero de habitantes: " + this.cidade.numHab);
		
	}

}
