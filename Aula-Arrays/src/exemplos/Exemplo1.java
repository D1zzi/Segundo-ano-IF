package exemplos;

import java.util.Iterator;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		// Array de inteiros
		
		int[] numeros = {10, 20, 30, 40};
		
		System.out.println(numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
		// Array de string
		
		String[] nomes = {"Jorge", "Roberto", "Vagner"};
		
		for(int x = 0; x < nomes.length; x++) {
			System.out.print(nomes[x] + " ");
			
		}
		// Array de double
		// Imprimam a soma dos números contidos no array
		
		double[] numeros2 = {10.7, 11.3, 43.2};
		double total = 0;
		
		for (int i = 0; i < numeros2.length; i++) {
			total += numeros2[i];
			
		}
		System.out.println();
		System.out.println("Soma = " + total);
		// Imprimir a média
		
		double media = total/numeros2.length;
		System.out.println("Média = " + media);
		
	}
}