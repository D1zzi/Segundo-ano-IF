package exerc�cios;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Iforme o n�mero de turmas: ");
		int turma = Integer.parseInt(leitor.nextLine());
		int tempturma = turma;
		int alunostotal = 0;
		
		while(turma > 0) {
			System.out.print("Informe a quantidade de alunos: ");
			int alunos = Integer.parseInt(leitor.nextLine());
			if(alunos <= 32) {
				alunostotal += alunos;
				turma--;
			}
			else {
				System.out.println("Quantidade de alunos inv�lida");
			}
			
		}
		
		System.out.print("A m�dia de alunos foi: " + (alunostotal/tempturma));
		
	}

}
