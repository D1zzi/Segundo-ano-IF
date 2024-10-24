package ex2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome da camiseta: ");
		String nomeCam = leitor.nextLine();
		
		System.out.print("Informe o preço da camiseta: ");
		double priceCam = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Informe a cor da camiseta: ");
		String cor = leitor.nextLine();
		
		Camiseta camiseta = new Camiseta(nomeCam, priceCam, cor);
		System.out.println();
		
		
		
		System.out.print("Informe o nome do sapato: ");
		String nomeSap = leitor.nextLine();
		
		System.out.print("Informe o preço do sapato: ");
		double priceSap = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Informe o tamanho do sapato: ");
		int tam = Integer.parseInt(leitor.nextLine());
		
		Sapato sapato = new Sapato(nomeSap, priceSap, tam);
		
		Comprador comprador = new Comprador();
		
		comprador.consulta(sapato);
		comprador.consulta(camiseta);

	}

}
