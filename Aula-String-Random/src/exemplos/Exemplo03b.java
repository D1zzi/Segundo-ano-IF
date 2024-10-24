package exemplos;

import java.util.Random;

public class Exemplo03b {

	public static void main(String[] args) {
		
		Random r = new Random();
		int numeroLancamentos = 100000;
		double[] lancamentos = new double[2]; // cara, coroa
		
		for (int i = 0; i < numeroLancamentos; i++) {
			lancamentos[r.nextInt(2)]++;
		}
		System.out.println("Cara: " + (lancamentos[0]*100/numeroLancamentos)+ "%");
		System.out.println("Coroa: " + (lancamentos[1]*100/numeroLancamentos) + "%");

	}

}
