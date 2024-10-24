package exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CriarCidades {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		File a1 = new File("arquivos");
		a1.mkdir();
		File a2 = new File("arquivos/cidades");
		a2.mkdir();
		
		ArrayList<String> cidades = new ArrayList<String>();
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Digite o nome da cidade: ");
			cidades.add(leitor.nextLine());
			
		}
		
		File a3 = new File("arquivos/cidades/info.txt");
		
		try {
			a3.createNewFile();
			FileWriter fw = new FileWriter(a3,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < cidades.size(); i++) {
				bw.write(cidades.get(i) + "\n");
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
