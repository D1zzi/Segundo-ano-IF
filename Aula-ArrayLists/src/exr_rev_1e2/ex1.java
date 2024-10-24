package exr_rev_1e2;

import java.util.ArrayList;

public class ex1 {

	public static void main(String[] args) {
		
		ArrayList<Cidade> região = new ArrayList<Cidade>();
		
		Prefeito p1 = new Prefeito("Renato Garcia", "PTSD");
		Prefeito p2 = new Prefeito("Rogério Senna", "PP");
		Prefeito p3 = new Prefeito("Rato Sujo", "DIPIRONA");
		
		Cidade c1 = new Cidade("Feliz", "Rio Grande do Sul", "Brasil", p1);
		Cidade c2 = new Cidade("Nigeria", "Venezuela", "Africa", p2);
		Cidade c3 = new Cidade("Brasil", "Físico", "Burundi", p3);
		
		região.add(c1);
		região.add(c2);
		região.add(c3);
		
		for (int i = 0; i < região.size(); i++) {
			
			System.out.println((i+1) + "º Cidade: " + região.get(i).getNome());
			System.out.println((i+1) + "º Estado: " + região.get(i).getEstado());
			System.out.println((i+1) + "º País: " + região.get(i).getPais());
			System.out.println((i+1) + "º Nome prefeito: " + região.get(i).getPrefeito().getNome());
			System.out.println((i+1) + "º Partido prefeito: " + região.get(i).getPrefeito().getPartido());
			System.out.println();
			
		}
		
	}

}
