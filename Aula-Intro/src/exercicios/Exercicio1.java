package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro n�mero: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtra��o: " + (num1 - num2));
		System.out.println("Multiplica��o: " + (num1 * num2));
		System.out.println("Divis�o: " + (num1 / num2));
		System.out.println("Resto: " + (num1 % num2));
	}

}
