package exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = leitor.nextLine();
				
		System.out.println("Olá " + nome);
		
		System.out.print("Informe a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("A idade é " + idade + " anos.");
		
		ArrayList<String> exemplo = new ArrayList<String>();
		
		exemplo.add("teste");
		exemplo.add("sexo");
		System.out.println(exemplo.size());
		System.out.println(exemplo.get(1));
	}

}
