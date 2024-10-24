package exemplos;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		// NumberFormatException
		try {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero = Integer.parseInt(leitor.nextLine());
		System.out.printf("Número: %d%n",numero);
		
		int[] valores = new int[3];
		valores[numero] = 3;
		
		int x = 10;
		int y = numero;
		int w = x / y;
		System.out.printf("w = %d%n",w);
		} catch(NumberFormatException e) {
			System.out.println("Conversão inválida.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice fora dos limites do array.");
		}  catch(ArithmeticException e) {
			System.out.println("Não é  possível dividir por zero!");
		}
		
		System.out.println("FIM");
		
		
	}

}
