package exercicios;

import java.util.Scanner;

public class Exercício2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Escreva um número: ");
		int numero = Integer.parseInt(leitor.nextLine());
		
		String resultado = "";
		
		if(numero%2 == 0) {
			
			resultado = "Par";
			
		}
		else {
			
			resultado = "Impar";
			
		}
		System.out.println();
		
		System.out.print("O número é: " + resultado + "!");
	}

}
