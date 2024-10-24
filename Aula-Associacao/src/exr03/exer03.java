package exr03;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Diretor diretor = new Diretor();
		System.out.print("Nome do Diretor: ");
		diretor.nome = leitor.nextLine();
		
		System.out.print("Sobrenome do Diretor: ");
		diretor.sobrenome = leitor.nextLine();
		
		System.out.print("Quantidade de prêmios: ");
		diretor.premios = Integer.parseInt(leitor.nextLine());
		
		System.out.println();
		
		Cidade cidade = new Cidade();
		System.out.print("Nome da cidade: ");
		cidade.nome = leitor.nextLine();
		
		System.out.print("Nome do país: ");
		cidade.pais = leitor.nextLine();
		
		System.out.print("Nome do estado: ");
		cidade.estado = leitor.nextLine();
		
		System.out.print("Número de habitantes: ");
		cidade.numHab = Integer.parseInt(leitor.nextLine());
		
		Filme filme = new Filme();
		filme.cidade = cidade;
		filme.diretor = diretor;
		
		filme.imprimir();

	}

}
