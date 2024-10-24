package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Produto> sistema = new ArrayList<Produto>();
		
		System.out.println("Funções digitadas: ");
		System.out.println();
		System.out.println("1: Inserir produtos no sistema;"); //a
		System.out.println("2: Remover um produto através do seu codigo;"); //b
		System.out.println("3: Remover todos os produtos;"); //c
		System.out.println("4: Mostrar na tela os dados de todos os produtos;"); //d
		System.out.println("5: Mostrar os dados de um produto em particular através do seu codigo."); //e
		
		while(true) {
			System.out.print("\nFunção que deseja desempenhar: ");
			int fun = Integer.parseInt(leitor.nextLine());
			
			System.out.println();
			
			if(fun == 1) {
				
				System.out.print("Digite o nome do produto: ");
				String nome = leitor.nextLine();
				
				System.out.print("Digite o código do produto: ");
				int code = Integer.parseInt(leitor.nextLine());
				
				System.out.print("Digite o nome do fabricante: ");
				String nomef = leitor.nextLine();
				
				System.out.print("Digite o endereço do fabricante: ");
				String endereco = leitor.nextLine();
				
				Fabricante fab = new Fabricante(nomef, endereco);
				
				System.out.print("Digite o valor do produto: R$ ");
				double price = Double.parseDouble(leitor.nextLine());
				
				Produto p = new Produto(code, nome, fab, price);
				sistema.add(p);
				
			}else if(fun == 2) {
				System.out.print("Digite o código do produto que deseja remover: ");
				int code = Integer.parseInt(leitor.nextLine());
				
				for (int i = 0; i < sistema.size(); i++) {
					int codever = sistema.get(i).getCodigo();
					
					if(code == codever) {
						sistema.remove(i);
					}
				}
				
			}else if(fun == 3) {
				
				sistema.clear();
				
			}else if(fun == 4) {
				
				for (int i = 0; i < sistema.size(); i++) {
					
					System.out.println("\nNome do produto: " + sistema.get(i).getNome());
					System.out.println("Código do produto: " + sistema.get(i).getCodigo());
					System.out.println("Nome do fabricante: " + sistema.get(i).getFabricante().getNome());
					System.out.println("Endereço do fabricante: " + sistema.get(i).getFabricante().getEndereco());
					System.out.println("Preço do produto: R$ " + sistema.get(i).getValor());
					
				}
				
			}else if(fun == 5) {
				
				System.out.print("Digite o código do produto que deseja visualizar: ");
				int code = Integer.parseInt(leitor.nextLine());
				
				for (int i = 0; i < sistema.size(); i++) {
					int codever = sistema.get(i).getCodigo();
					
					if(code == codever) {
						
						System.out.println("\nNome do produto: " + sistema.get(i).getNome());
						System.out.println("Código do produto: " + sistema.get(i).getCodigo());
						System.out.println("Nome do fabricante: " + sistema.get(i).getFabricante().getNome());
						System.out.println("Endereço do fabricante: " + sistema.get(i).getFabricante().getEndereco());
						System.out.println("Preço do produto: R$ " + sistema.get(i).getValor());
					}
				}
				
			}else {
				break;
			}
				
		}

	}

}
