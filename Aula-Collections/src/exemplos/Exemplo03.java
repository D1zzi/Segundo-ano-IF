package exemplos;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo03{

	public static void main(String[] args) {
		
		ArrayList<Pessoa> turma = new ArrayList<Pessoa>();
		
		turma.add(new Pessoa("Maria", 23));
		turma.add(new Pessoa("Renato", 32));
		turma.add(new Pessoa("Garcia", 61));
		turma.add(new Pessoa("Jorge", 49));
		turma.add(new Pessoa("Roger", 18));
		
		// Ordena
		Collections.sort(turma);
		
		// Inverte
		//Collections.reverse(turma);
		
		// Embaralha
		//Collections.shuffle(turma);
		
		for (int i = 0; i < turma.size(); i++) {
			System.out.printf("%s tem %d anos, ", turma.get(i).getNome(),turma.get(i).getIdade());
		}
		
		// Busca Binária
		// Busca Binária só funciona em lista ordenada
		
		int indice = Collections.binarySearch(turma, new Pessoa("Maria",23));
		System.out.printf("%n Encontrado na posição %d%n",indice);
		
		// Se dois elementos forem iguais ele retorna o primeiro que ele achar na busca
		
	}

}
