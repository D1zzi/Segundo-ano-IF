package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String cidade = new String("Alto Feliz");
		// String � uma classe, tem letra mai�scula
		
		
		System.out.println(cidade.charAt(0));
		
		System.out.println(cidade.length());
		
		// la�o de repeti��o para imprimir todos os chars
		
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