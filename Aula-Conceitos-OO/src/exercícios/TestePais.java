package exerc�cios;

import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Pais p = new Pais();
		
		System.out.print("Insira o nome do Pa�s: ");
		p.nome = leitor.nextLine();
		
		System.out.print("Insira o nome da capital: ");
		p.capital = leitor.nextLine();
		
		System.out.print("Insira o n�mero de habitantes: ");
		p.numHab = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Pais: " + p.nome + "\n" + 
						   "Capital: " + p.capital + "\n" + 
						   "N�mero de habitantes: " + p.numHab);
		
	}

}
