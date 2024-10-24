package exemplos2;

public class Calculadora implements OperacoesBasicas, OperacoesMedias {

	
	@Override
	public void somar(int a, int b) {
		System.out.printf("Soma: %d%n" + (a + b));
	}

	@Override
	public void subtrair(int a, int b) {
		System.out.printf("Subtração: %d%n" + (a - b));
	}

	@Override
	public void mediaAritmetica(double[] numeros) {
			
	}

	@Override
	public void mediaPonderada(double[] numeros, double[] pesos) {
		// TODO Auto-generated method stub
		
	}
	
}
