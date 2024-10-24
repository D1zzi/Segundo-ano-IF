package exemplos;

import java.util.Arrays;

public class Exemplo01 {

	public static void main(String[] args) {
		
		int[] numeros = {40,-3,12,23,-666,123,5};
		String[] palavras = {"teste", "renato", "garcia", "a", "helicoptero", "aa", "ab"};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
		
		// bubble sort - compara primero com o segundo e se for menor joga pro primeiro, assim consecutivamente.
		// bubble sort, de todos é o mais lento
		Arrays.sort(numeros);
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
		
		System.out.println();
		
		Arrays.sort(palavras);
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.printf("%s ", palavras[i]);
		}
		
		// busca ordenada - continuamente compara o alvo com parte da metade do tamanho do array, descartando a outra metade
		
		int procurado = 40;
		
		int posicao = Arrays.binarySearch(numeros, procurado);
		
		System.out.println();
		System.out.printf("Posição do elemento: %d%n",posicao);
		
	}

}
