package exemplos;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// erro � diferente de exce��o
		// erro finaliza o processo sem poder contornar (falta de mem�ria at� n�o permiss�o)
		// exce��es s�o problemas contor�veis
		
		// NumberFormatException
		try {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int numero = Integer.parseInt(leitor.nextLine());
		System.out.printf("N�mero: %d%n",numero);
		} catch(Exception e) {
			System.out.println("Convers�o inv�lida!");
		}
		
		// ArrayIndexOutOfBoundsException
		try {
			int[] valores = new int[3];
			valores[20] = 3;
		} catch(Exception e) {
			System.out.println("�ndice fora dos limites do array.");
		}
		
		// ArithmeticException
		try {
			int x = 10;
			int y = 0;
			int w = x / y;
			System.out.printf("w = %d%n",w);
		} catch(Exception e) { // "Exception" � a superclasse do topo da hierarquia
			System.out.println("N�o �  poss�vel dividir por zero!");
		}
		
		System.out.println("FIM");
		
		
	}

}
