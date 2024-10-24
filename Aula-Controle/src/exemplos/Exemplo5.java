package exemplos;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = Integer.parseInt(leitor.nextLine());
		
		// se não tiver break, após considerar True vai executar todos subsequentemente
		switch(numero) {
			
			case 0: {
				System.out.println("ZERO!");
				break;
			}
			case 1: {
				System.out.println("UM!");
				break;
			}
			case 2: {
				System.out.println("DOIS!");
				break;
			}
			
			default: {
				System.out.print("OUTRO NÚMERO!");
			}
		
		}

	}
	
}
