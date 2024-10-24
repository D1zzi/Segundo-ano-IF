package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro número: ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		int soma = 0;
		for (int i = n1+1; i < n2; i++) {
			soma += i;
		}
		
		System.out.print("Soma: " + soma);
	}
}
