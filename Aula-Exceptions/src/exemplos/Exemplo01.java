package exemplos;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// erro é diferente de exceção
		// erro finaliza o processo sem poder contornar (falta de memória até não permissão)
		// exceções são problemas contoráveis
		
		// NumberFormatException
		try {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero = Integer.parseInt(leitor.nextLine());
		System.out.printf("Número: %d%n",numero);
		} catch(Exception e) {
			System.out.println("Conversão inválida!");
		}
		
		// ArrayIndexOutOfBoundsException
		try {
			int[] valores = new int[3];
			valores[20] = 3;
		} catch(Exception e) {
			System.out.println("Índice fora dos limites do array.");
		}
		
		// ArithmeticException
		try {
			int x = 10;
			int y = 0;
			int w = x / y;
			System.out.printf("w = %d%n",w);
		} catch(Exception e) { // "Exception" é a superclasse do topo da hierarquia
			System.out.println("Não é  possível dividir por zero!");
		}
		
		System.out.println("FIM");
		
		
	}

}
