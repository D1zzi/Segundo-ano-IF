package exemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerNomes {

	public static void main(String[] args) {
		
		File a1 = new File("teste/nomes.txt");
		
		try {
			FileReader fr = new FileReader(a1);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = null;
			
			while( (linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			
		}
		
		
	}
}
