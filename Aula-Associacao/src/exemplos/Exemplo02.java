package exemplos;

public class Exemplo02 {

	public static void main(String[] args) {

		Fabricante fabricante = new Fabricante();
		fabricante.nome = "Roger Industries";
		fabricante.pais = "Indonésia";

		Celular celular = new Celular();
		celular.modelo = "Roger to the sky";
		celular.usado = true;
		celular.fabricante = fabricante;

		celular.imprimir();

	}

}
