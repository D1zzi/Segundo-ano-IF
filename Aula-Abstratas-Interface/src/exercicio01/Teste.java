package exercicio01;

public class Teste {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo("bola", 51);
		Retangulo r1 = new Retangulo("travessa", 69, 3);
		
		System.out.printf("%.2f%n", c1.calculaArea());
		System.out.printf("%.2f%n", c1.calculaPerimetro());
		
		System.out.printf("%.2f%n", r1.calculaArea());
		System.out.printf("%.2f%n", r1.calculaPerimetro());
		
	}

}
