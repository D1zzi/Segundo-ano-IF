package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu sal�rio: R$");
		double salario = Double.parseDouble(leitor.nextLine());
		
		double novoSalario = 0;
		
		if(salario <= 1000) {
			double aumento = salario * 0.2;
			novoSalario = salario + aumento;
		}
		//outros ifs:
		
		else if((1000 < salario) && (salario <= 2000)) {
			double aumento = salario * 0.15;
			novoSalario = salario + aumento;
		}
		else {
			double aumento = salario * 0.10;
			novoSalario = salario + aumento;			
		}

		System.out.print("Seu sal�rio atual �: R$" + novoSalario);
	}

}
