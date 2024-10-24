package exemplos;

public class Teste {

	public static void main(String[] args) {
		
		Cidade c1 = new Cidade("Feliz", "RS", "Brasil");
		
		Pessoa p1 = new Pessoa("Jefferson", "Silva", 48, 1.97, "Rua 123, Feliz", c1);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getAltura());
		System.out.println(p1.getEndereco());
		System.out.println(p1.getCidade().getNome());
		System.out.println(p1.getCidade().getEstado());
		System.out.println(p1.getCidade().getPais());
		
	}

}
