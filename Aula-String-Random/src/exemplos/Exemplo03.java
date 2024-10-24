package exemplos;

import java.util.Random;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//System.out.println(r.nextInt(2)); // duas possibilidades, 0 e 1
		
		// Simular 100000 lançamentos de moeda
		// Imprimir o % de cara e o % de coroa
		
		int lancamento = r.nextInt(2);
		
		float cara = 0;
		float coroa = 0;
		
		for(int i = 0; i < 100000; i++) {
			lancamento = r.nextInt(2);
			if(lancamento == 0) {
				cara++;
			}else {
				coroa++;
			}
				
		}
		System.out.println("Cara: " + (cara/1000)+ "%");
		System.out.println("Coroa: " + (coroa/1000) + "%");
		
	}
}
