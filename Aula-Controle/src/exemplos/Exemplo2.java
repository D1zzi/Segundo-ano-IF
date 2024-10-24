package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {
		
		for(int i = 9; i >= 0; i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 2; i <= 64; i*=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// forma que fiz:
		int y = 0;
		for(String x = ""; y < 3; y ++) {
			System.out.print(x += "*");
			System.out.println();
			
		}
		// forma do moser:
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
		
		}

	}
	
}