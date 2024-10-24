package exemplos;

public class Exemplo02 {

	public static void main(String[] args) {
		
		int x = 10;
		
		double d = x;
		float f = x;
		
		System.out.println(x);
		System.out.println(d);
		System.out.println(f);
		
		double d2 = 10.5;
		float f2 = 20.7f;
		
		int i1 = (int) d2;
		int i2 = (int) f2;
		
		System.out.println(i1);
		System.out.println(i2);
		
		double div = ((double) i1)/100;
		System.out.println(div);
		
		
		String frase = "Programar em Java";
		String[] palavras = frase.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);     
		}
		
	}

}
