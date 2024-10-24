package exemplos;

import javax.swing.JOptionPane;

public class Exemplo04 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bom dia!");
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		if((nome == null) || (nome.length() == 0)) { 
			nome = "Anônimo.";
		}
		
		// "==" pra String não funciona
		
		if(nome.equals("admin")) {
			nome = "Administrador";
		}
		
		JOptionPane.showMessageDialog(null, "Olá " + nome);
		
	} 
}
