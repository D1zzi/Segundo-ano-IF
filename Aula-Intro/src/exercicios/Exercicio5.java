package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double salario = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Digite a porcentagem de aumento: ");
		double porc_aumento = Double.parseDouble(leitor.nextLine());
		
		double aumento = salario * porc_aumento / 100;
		
		double novo_salario = salario + aumento;
		
		System.out.println();
		
		System.out.println("Salário antigo: " + "R$ " + salario);
		System.out.println("Porcentagem de Aumento: " + porc_aumento + "%");
		System.out.println("Valor a aumentar: " + "R$ " + aumento);
		System.out.println("Salário novo: " + "R$ " + novo_salario);
		
	}
	
}
