package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pet pet1 = new Pet();
		
		pet1.setNome("Christopher");
		pet1.setEspecie("Pomba rolinha");
		
		p1.setNome("Roger");
		p1.setIdade(18);
		p1.setPet(pet1);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getPet().getNome());
		System.out.println(p1.getPet().getEspecie());
	}

}
