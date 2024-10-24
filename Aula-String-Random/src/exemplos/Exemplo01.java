package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String cidade = new String("Alto Feliz");
		// String é uma classe, tem letra maiúscula
		
		
		System.out.println(cidade.charAt(0));
		
		System.out.println(cidade.length());
		
		// laço de repetição para imprimir todos os chars
		
		for (int i = 0; i < cidade.length(); i++) {
			System.out.print(cidade.charAt(i) + " ");
			        
		}
		
		System.out.println();
		
		int n1 = 10;
		int n2 = 20;
		
		// Imprimir na frente do 30 a palavra "Soma: "
		System.out.println("Soma: " + (n1 + n2));
		

	}

}