import java.util.Scanner;

public class Exr5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = Integer.parseInt(leitor.nextLine());
		String[] nomes = new String[n];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = leitor.nextLine();
		}
		System.out.println("Quantidade de nomes: " + n);
		
		double totalchar = 0;
		for (int i = 0; i < nomes.length; i++) {
			totalchar += nomes[i].length();
		}
		System.out.println("Quantidade de caracteres: " + totalchar);
		
		System.out.println("Tamanha médio dos nomes: " + totalchar/nomes.length);
		
		for (int i = 0; i < nomes.length; i++) {
			
		}
		
	}

}
