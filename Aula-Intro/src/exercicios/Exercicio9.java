package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Digite o 2� n�mero: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Digite o 3� n�mero: ");
		int num3 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Digite o 4� n�mero: ");
		int num4 = Integer.parseInt(leitor.nextLine());
		
		int total = num1 + num2 + num3 + num4;
		int media = total/4;
		
		int maior = 0;
		int menor = 0;
		
		if(num1 > num2) {
			if(num2 > num3) {
				maior = num2;
				if(num3 > num4) {
					maior = num3;
				}
			}
		}
		
	}
	
}
