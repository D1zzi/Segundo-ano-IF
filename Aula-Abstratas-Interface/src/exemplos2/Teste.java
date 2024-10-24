package exemplos2;

public class Teste {

	public static void main(String[] args) {
		// OperacoesBasicas op = new OperacoesBasicas(); NÃO PODE
		
		OperacoesBasicas ob = new Calculadora();
		ob.somar(0, 0);
		ob.subtrair(0, 0);
		// op.mediaAritmetica; É DE OperacoesMedias LOGO NÃO FUNCIONA
		
		OperacoesMedias om = new Calculadora();
		om.mediaAritmetica(null);
		om.mediaPonderada(null, null);
		// ob.somar(0, 0); É DE OperacoesBasicas LOGO NÃO FUNCIONA
		
		Calculadora op = new Calculadora();
		op.somar(3, 4);
		op.subtrair(5, 3);
		
		System.out.println(OperacoesBasicas.x);

	}

}
