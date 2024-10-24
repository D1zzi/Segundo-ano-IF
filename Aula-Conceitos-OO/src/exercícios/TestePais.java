package exercícios;

import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Pais p = new Pais();
		
		System.out.print("Insira o nome do País: ");
		p.nome = leitor.nextLine();
		
		System.out.print("Insira o nome da capital: ");
		p.capital = leitor.nextLine();
		
		System.out.print("Insira o número de habitantes: ");
		p.numHab = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Pais: " + p.nome + "\n" + 
						   "Capital: " + p.capital + "\n" + 
						   "Número de habitantes: " + p.numHab);
		
	}

}
