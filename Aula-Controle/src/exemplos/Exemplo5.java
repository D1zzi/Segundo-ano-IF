package exemplos;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int numero = Integer.parseInt(leitor.nextLine());
		
		// se n�o tiver break, ap�s considerar True vai executar todos subsequentemente
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
				System.out.print("OUTRO N�MERO!");
			}
		
		}

	}
	
}
