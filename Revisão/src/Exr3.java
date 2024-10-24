import java.util.Scanner;

public class Exr3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("De um número: ");
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("De outro número: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		int soma = 0;
		
		for (int i = num1+1; i < num2; i++) {
			soma += i;
		}
		System.out.print("Soma do intervalo: " + soma);

	}

}
