package exemplos;

public class Tipos {

	public static void main(String[] args) {
		
		// tipos de dados primitivos numéricos:
		byte b = -128; //byte 2^8
		b -= 1;
		System.out.println(b);
		
		
		short s = 200; //short 2^16
		System.out.println(s);
		
		int i = 32; //int 2^32
		System.out.println(i);
		
		long l = 124213400008888l; //long 2^64. Se botar l direita pode mais
		System.out.println(l);
		
		float f = 3.1415f; //tem que botar a letra f à direita
		System.out.println(f);
		
		double d = 3.1415; //este não precisa do f
		System.out.println(d);
		
		// outros tipos de dados primitivos:
		
		boolean x = true;
		boolean y = false;
		System.out.println(x);
		System.out.println(y);
		
		char c1 = 'a'; // sempre caractere único
		char c2 = '2'; // sempre aspas simples, sendo únicas do char
		char c3 = ' ';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// dados não primitivos

		String nome = "Maria";
		System.out.println(nome);
		
	}

}
