package sobrescrita;

public class Teste {

	public static void main(String[] args) {
		
		Caderno c1 = new Caderno(123, 100, false);
		c1.imprimir();
		
		Caneta c11 = new Caneta(1002, "Rosa", "Bic");
		c11.imprimir();
	}

}
