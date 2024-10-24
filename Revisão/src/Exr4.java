import java.util.Scanner;

public class Exr4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		System.out.print("Informe o nome do atleta: ");
		nome = leitor.nextLine();
		double[] saltos = new double[5];
		double total = 0;
		
		for (int i = 0; i < saltos.length; i++) {
			System.out.println("Informe a distância: ");
			saltos[i] = Double.parseDouble(leitor.nextLine());
			total += saltos[i];
		}
		double media = total/saltos.length;
		
		System.out.println("RESULTADO FINAL");
		System.out.println("Atleta: " + nome);
		System.out.print("Saltos:");
		for (int i = 0; i < saltos.length; i++) {
			System.out.print(" " + saltos[i]);
		}
		System.out.println();
		System.out.print("Média dos saltos: " + media);
		
				
	}

}
