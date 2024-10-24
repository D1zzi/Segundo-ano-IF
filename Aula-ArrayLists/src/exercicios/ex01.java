package exercicios;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("040.351.550-55", "Diogo Vettorazzi", 17));
		pessoas.add(new Pessoa("072.344.344-23", "Renatão Gaseificado", 23));
		pessoas.add(new Pessoa("030.405.060-70", "Joaquim Fenix", 54));
		
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println("---------------");
			System.out.println(pessoas.get(i).getCpf());
			System.out.println(pessoas.get(i).getNome());
			System.out.println(pessoas.get(i).getIdade() + " Anos");
			
		}
		
	}

}
