package ex4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = leitor.nextLine();
		
		double soma = 0;
		double[] saltos = new double[5];
		for (int i = 0; i < saltos.length; i++) {
			System.out.print("Informe a distância da tentativa " + (i+1) + ": ");
			saltos[i] = Double.parseDouble(leitor.nextLine());
			soma += saltos[i];
		}
		
		System.out.println("RESULTADO FINAL");
		System.out.println("Atleta: " + nome);
		System.out.print("Saltos:");
		for (int i = 0; i < saltos.length; i++) {
			System.out.print(" " + saltos[i]);
		}
		System.out.println();
		System.out.println("Média dos Saltos: " + (soma/saltos.length));
	}
}