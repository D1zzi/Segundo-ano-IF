package exemplos;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos n�meros deseja adicionar: ");
		int x = Integer.parseInt(leitor.nextLine());
		
		int[] numeros = new int[x];
		
		System.out.println();
		
		// Criar um for para ler os 3 n�meros do teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um n�mero: ");
			numeros[i] = Integer.parseInt(leitor.nextLine());
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
