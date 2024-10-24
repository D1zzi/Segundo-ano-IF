package desafios;

public class Desafio1 {

	public static void main(String[] args) {
		/* DESAFIO-1
		   Usando apenas UM print e UM println de cada imprima
		   
		  	 	I
		  	 	IF
		  	 	IFR
		  	 	IFRS
		  
		   Use o array "letras"
		   Não pode usar o \n
		 */
		
		char[] letras = {'S', 'R', 'F', 'I'};
		
		for (int i = 0; i < letras.length; i++) {
			for (int j = 3; j > i ; j--) {
				System.out.print(letras[j]);
				
			}
			System.out.println();
		}
		

	}

}
