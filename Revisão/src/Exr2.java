import java.util.Scanner;

public class Exr2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("De um n�mero: ");
		int num1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("De outro n�mero: ");
		int num2 = Integer.parseInt(leitor.nextLine());
		
		for (int i = num1+1; i < num2; i++) {
			System.out.print(i + " ");
		}

	}

}
