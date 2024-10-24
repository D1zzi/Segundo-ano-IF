package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<String> linhas = new ArrayList<String>();
		ArrayList<Integer> soma = new ArrayList<Integer>();
		File a1 = new File("exercicios/ex11.txt");
		try {
			FileReader fr = new FileReader(a1);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			linha.split(" ");
			
			
			
			int linha1 = 0;
			
			while( (linha1 = br.readLine()) != 0) {
				soma.add(linha1);
				System.out.println("aaa");
			}
			
			
			br.close();
			fr.close();
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		File a2 = new File("exercicios/ex12.txt");
		
		try {
			a1.createNewFile();
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
