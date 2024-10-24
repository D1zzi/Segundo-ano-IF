package exr_rev_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Computador> computadores = new ArrayList<Computador>();
		
		while(true) {
			while(true) {
				System.out.print("Dê a marca do computador: ");
				String marcac = leitor.nextLine();
			
				System.out.println();
			
				System.out.print("Preço: ");
				int preco = Integer.parseInt(leitor.nextLine());
			
				Computador c1 = new Computador(marcac,preco);
			
				break;
			
			}
		}
		
	}

}
