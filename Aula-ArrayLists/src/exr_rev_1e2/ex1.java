package exr_rev_1e2;

import java.util.ArrayList;

public class ex1 {

	public static void main(String[] args) {
		
		ArrayList<Cidade> regi�o = new ArrayList<Cidade>();
		
		Prefeito p1 = new Prefeito("Renato Garcia", "PTSD");
		Prefeito p2 = new Prefeito("Rog�rio Senna", "PP");
		Prefeito p3 = new Prefeito("Rato Sujo", "DIPIRONA");
		
		Cidade c1 = new Cidade("Feliz", "Rio Grande do Sul", "Brasil", p1);
		Cidade c2 = new Cidade("Nigeria", "Venezuela", "Africa", p2);
		Cidade c3 = new Cidade("Brasil", "F�sico", "Burundi", p3);
		
		regi�o.add(c1);
		regi�o.add(c2);
		regi�o.add(c3);
		
		for (int i = 0; i < regi�o.size(); i++) {
			
			System.out.println((i+1) + "� Cidade: " + regi�o.get(i).getNome());
			System.out.println((i+1) + "� Estado: " + regi�o.get(i).getEstado());
			System.out.println((i+1) + "� Pa�s: " + regi�o.get(i).getPais());
			System.out.println((i+1) + "� Nome prefeito: " + regi�o.get(i).getPrefeito().getNome());
			System.out.println((i+1) + "� Partido prefeito: " + regi�o.get(i).getPrefeito().getPartido());
			System.out.println();
			
		}
		
	}

}
