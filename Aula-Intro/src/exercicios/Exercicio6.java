package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quilometragem inicial do carro: ");
		double km_inicial = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Quilometragem após viajem: ");
		double km_depois = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Litros de gasolina consumida: ");
		double litros = Double.parseDouble(leitor.nextLine());
		
		double km_percorrido = km_depois-km_inicial;
		
		double media_litros = km_percorrido/litros;
		
		System.out.println("A média de litros de gasolina gastos por quilometro é: " + media_litros);
		
	}

}
