package exemplos;

import java.util.ArrayList;

public class TesteArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>(); // o que está do lado direito é um construtor
		
		nomes.add("Renato do gás");
		nomes.add("Jesus Cristo");
		nomes.add("Trombose da silva");
		
		//System.out.println(nomes.get(2));
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		
		
		nomes.remove(1);
		
		System.out.println("--------------------");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		
		
		nomes.add(0, "Renato Garcia");
		
		System.out.println("--------------------");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		nomes.clear();
		
	}

}
