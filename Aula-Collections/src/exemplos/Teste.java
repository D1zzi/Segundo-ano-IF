package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int t = 100000;
		int[] numeros = new int[t];
		
		// Preencher o array j� ordenado
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i*2;
		}
		
		System.out.print("Informe o n�mero a ser buscado: ");
		int procurado = Integer.parseInt(leitor.nextLine());
		
		// Busca linear
		long t1 = System.nanoTime();
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == procurado) {
				break;
			}
		}
		long t2 = System.nanoTime();
		System.out.printf("Tempo de busca linear: %d%n",(t2-t1));
		
		// Busca bin�ria
		long t3 = System.nanoTime();
		int indice = Arrays.binarySearch(numeros, procurado);
		long t4 = System.nanoTime();
		
		System.out.printf("Tempo de busca bin�ria: %d%n",(t4-t3));
		
		double dif = ((double)t4-t3)/((double)t2-t1);
		
		System.out.printf("Propor��o: %.5f%n", dif);
	}

}
