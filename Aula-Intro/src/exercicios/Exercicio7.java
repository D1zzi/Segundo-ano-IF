package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu salário: R$");
		double salario = Double.parseDouble(leitor.nextLine());
		
		double novoSalario = 0;
		
		if(salario <= 1000) {
			double aumento = salario * 0.2;
			novoSalario = salario + aumento;
		}
		//outros ifs:
		
		if((1000 < salario) && (salario <= 2000)) {
			double aumento = salario * 0.15;
			novoSalario = salario + aumento;
		}
		if(salario > 2000) {
			double aumento = salario * 0.10;
			novoSalario = salario + aumento;			
		}

		System.out.print("Seu salário atual é: R$" + novoSalario);
	}

}
