package sobrecarga;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.falar();
		p1.falar("Adios!");
		p1.falar("Bom dia", 3);
		
		p1.somar(1, 2);
		p1.somar(2.3, 4);

	}

}
