package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa();
		System.out.println(p0.nome);
		System.out.println(p0.idade);
		
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Diogo";
		p1.idade = 16;
		
		p1.imprimir();
		
		p1.falarOla();
		
		p1.falar("aaaaa aaaaa carambolas");
		
		String r = p1.obterIdade();
		System.out.println(r);
		
		System.out.println(p1.obterIdadeint());
		p1.fazerAniversario();
		System.out.println(p1.obterIdadeint());
		
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Renato";
		p2.idade = 69;
		
		Pessoa p3 = new Pessoa();
		
		p2.nome = "Renato";
		p2.idade = 69;
		
		if(p2 == p3) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		// mesmo os valores internos sendo iguais, ainda são dois objetos diferentes
		
		if((p2.nome.equals(p3.nome)) && (p2.idade == p3.idade)) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		
		Pessoa p4 = p3;
		// mesmo tendo duas variáveis elas se referem ao mesmo objeto
		if(p3 == p4) {
			System.out.println("Mesmo objeto");
		}
	}

}
