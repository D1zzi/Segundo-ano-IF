package ex5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		// (a)
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor de n: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		// (b)
		String[] nomes = new String[n];
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Informe o " + (i+1) + "º nome: ");
			nomes[i] = leitor.nextLine();
		}

		// (c.1)
		System.out.println("- quantidade de nomes: " + n);
		
		// (c.2)
		double soma = 0;
		for (int i = 0; i < nomes.length; i++) {
			soma += nomes[i].length();
		}
		System.out.println(" - quantidade total de caracteres em todos nomes: " + soma);
		
		// (c.3)
		System.out.println("- o tamanho médio dos nomes: " + (soma/n));
		
		// (c.4-5)
		int numeroCharsMaior = nomes[0].length();
		int numeroCharsMenor = nomes[0].length();
		
		for (int i = 1; i < nomes.length; i++) {
			if(nomes[i].length() > numeroCharsMaior) {
				numeroCharsMaior = nomes[i].length();
			}
			
			if(nomes[i].length() < numeroCharsMenor) {
				numeroCharsMenor = nomes[i].length();
			}
		}
		
		System.out.println("Maior(es) nome(s): ");
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[i].length() == numeroCharsMaior) {
				System.out.println(nomes[i]);
			}
		}
		
		System.out.println("Menor(es) nome(s): ");
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[i].length() == numeroCharsMenor) {
				System.out.println(nomes[i]);
			}
		}
		


		
	}

}
