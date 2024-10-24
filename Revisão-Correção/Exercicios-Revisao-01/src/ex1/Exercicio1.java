package ex1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String usuario;
		String senha;

		do {
			System.out.print("Informe o username: ");
			usuario = leitor.nextLine();
			System.out.print("Informe a senha: ");
			senha = leitor.nextLine();
		} while(senha.equals(usuario));
	}
}
