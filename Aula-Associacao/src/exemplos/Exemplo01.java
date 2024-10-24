package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Pet pet1 = new Pet();
		pet1.nome = "Roger";
		pet1.idade = 13;
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Renatão";
		pessoa1.pet = pet1;
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.pet.nome);
		System.out.println(pessoa1.pet.idade);
		
		System.out.println();
		
		Pet pet2 = new Pet();
		pet2.nome = "Rojer";
		pet2.idade = 14;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jorge";
		pessoa2.pet = pet2;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.pet.nome);
		System.out.println(pessoa2.pet.idade);
		
		// Ctrl + Shift + S = Salvar todos os documentos
		// Ctrl + I = Identa código atual (selecionar tudo)

	}

}
