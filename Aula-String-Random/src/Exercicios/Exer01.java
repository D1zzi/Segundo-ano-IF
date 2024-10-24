package Exercicios;

import javax.swing.JOptionPane;

public class Exer01 {

	public static void main(String[] args) {
		
		int contador = 10;
		double caracteres = 0;
		
		for (int i = 0; i < contador; i++) {
			String nome = JOptionPane.showInputDialog("Digite um texto legal: ");
				for (int j = 0; j < contador; j++) {
					caracteres++;
				}
		}
		
		double media = caracteres/contador;
		
		
	}
	
}
