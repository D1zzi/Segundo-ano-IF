package exemplos;

public class Teste {

	public static void main(String[] args) {
		
		//Cachorro c1 = new Cachorro("Renato");
		//Gato g1 = new Gato("Roger");
		
		Animal[] a1 = new Animal[2];
		a1[0] = new Cachorro("Tinhoso");
		a1[1] = new Gato("Capeta");
		
		
		// Versão resumida que passa por todos os itens
		for(Animal a : a1) {
			a.emitirSom();
		}
		
		for (int i = 0; i < a1.length; i++) {
			a1[i].emitirSom();
		}
		
	}

}
