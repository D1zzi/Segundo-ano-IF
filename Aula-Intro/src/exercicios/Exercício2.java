package exercicios;

import java.util.Scanner;

public class Exerc�cio2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Escreva um n�mero: ");
		int numero = Integer.parseInt(leitor.nextLine());
		
		String resultado = "";
		
		if(numero%2 == 0) {
			
			resultado = "Par";
			
		}
		else {
			
			resultado = "Impar";
			
		}
		System.out.println();
		
		System.out.print("O n�mero �: " + resultado + "!");
	}

}
