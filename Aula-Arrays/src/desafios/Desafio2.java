package desafios;

public class Desafio2 {

	public static void main(String[] args) {
		/* DESAFIO-2
		   Usando apenas UM print e UM println de cada imprima
		  
		   14 21 35
		   20 30 50
		   26 39 65
		   32 48 80
		  
		   Use os arrays "m" e "n"
		   Não pode usar o \n
		 */
		
		int[] m = {7, 10, 13, 16};
		int[] n = {2, 3, 5};
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(m[i]*n[j] + " ");
			}
			System.out.println();
		}

	}

}
