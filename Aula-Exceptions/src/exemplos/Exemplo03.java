package exemplos;

public class Exemplo03 {

	public static void main(String[] args) {
		
		int idade = 17;
		
		try {
		Motorista m = new Motorista(idade);
		System.out.printf("Idade: %d%n",m.getIdade());
		} catch(Exception e) {
			System.out.println(e.getMessage()); // apresenta APENAS a mensagem tratada
			e.printStackTrace(); // para ver o erro, é útil para identificar o problema
		}
//		try {
//			Motorista m = new Motorista(idade);
//			System.out.printf("Idade: %d%n",m.getIdade());
//		} catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
		
		System.out.println("FIM");
		
		
		
		
	}

}
