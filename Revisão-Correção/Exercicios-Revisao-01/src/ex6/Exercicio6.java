package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[] produtos = {
				"Cachorro Quente",
				"Bauru Simples",
				"Bauru com Ovo",
				"Hambúrguer",
				"Cheeseburguer",
				"Refrigerante" 
		};
		
		double[] precos = {1.2, 1.3, 1.5, 1.2, 1.3, 1.0};
		int[] quantidades = {0, 0, 0, 0, 0, 0};
		
		int opcao;
		
		do {
			System.out.println();
			System.out.println("Menu:");
			for (int i = 0; i < produtos.length; i++) {
				System.out.print((i+1) + " - ");
				System.out.print(produtos[i]);
				System.out.println(" R$" + precos[i]);
			}
			System.out.println("0 - Sair");

			
			System.out.println();
			System.out.print("Informe a sua opção: ");
			opcao = Integer.parseInt(leitor.nextLine());
			
			if((opcao < 0) || (opcao > produtos.length)) {
				System.out.println();
				System.out.println("Opção inválida.");
			} else if(opcao != 0){
				int j = opcao - 1;
				System.out.print("Informe a quantidade de " + produtos[j] + ": ");
				int quantidade = Integer.parseInt(leitor.nextLine());
				quantidades[j] += quantidade;
				System.out.println("Foram adicionados " + quantidade + " itens de " + produtos[j] + ".");
			}
		} while(opcao != 0);
		
		double soma = 0;
		System.out.println("Cod. | Produto | Valor");
		for (int i = 0; i < quantidades.length; i++) {
			if(quantidades[i] != 0) {
				System.out.print(quantidades[i] + "  ");
				System.out.print(produtos[i] + "  R$");
				System.out.println(quantidades[i]*precos[i]);
				soma += quantidades[i]*precos[i];
			}
		}
		
		System.out.println();
		System.out.println("Total R$" + soma);
	}

}
