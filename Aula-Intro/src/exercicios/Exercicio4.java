package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o raio de uma esfera: ");
		double raio = Double.parseDouble(leitor.nextLine());
		
		double volume = ((4/3*3.141559)*(raio*raio));
	
		System.out.print("O volume da esfera é: " + volume + "m³");
	}

}
