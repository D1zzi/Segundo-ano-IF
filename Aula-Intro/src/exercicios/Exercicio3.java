package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Escreva um n�mero: "); 
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.println();
		
		System.out.print("Escreva outro n�mero: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		int dif = 0;
		
		if(num1 != num2) {
			
			System.out.println("Os n�meros s�o diferentes.");
			dif = 1;
			
		}else {
		
			System.out.println("Os n�meros s�o iguais.");
			
		}
		
		if(dif == 1) {
			if(num1 > num2) {
				System.out.println("O maior n�mero �: " + num1);
			}
			else {
				System.out.println("O maior n�mero �: " + num2);
			}
		}
		
	}

}
