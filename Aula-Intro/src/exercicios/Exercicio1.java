package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro número: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Divisão: " + (num1 / num2));
		System.out.println("Resto: " + (num1 % num2));
	}

}
