package exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarPasta {

	public static void main(String[] args) {
		
		// CRIA��O DE TREE QUE USAREMOS, CRIAR MESMO QUE J� EXISTA POR INCERTEZA
		File p1 = new File("arquivos"); // cria pasta "arquivos"
		p1.mkdir(); // para criar diret�rio
		// deleta p1.delete();
		
		
		File p2 = new File("arquivos/nomes"); // o "/" cria uma subpasta
		p2.mkdir();
		
		
		File a1 = new File("arquivos/nomes/teste.txt");
		
		try {
			a1.createNewFile();
			
			FileWriter fw = new FileWriter(a1,true); // escreve no arquivo, parametro 1: arquivo; 2: true: mat�m conte�do do arquivo
			BufferedWriter bw = new BufferedWriter(fw); // ele d� o print no txt
			
			// bw.write("Ola Mundo!\n");
			
			for (int i = 0; i < 10; i++) {
				bw.write(i + "\n"); // TEM QUE FAZER CONVERS�O!!! String.valueOf(i); quebra de linha tamb�m funciona \n
			}
			
			bw.close();
			fw.close();
			// se o close n�o for executado, n�o vai pro disco, fica na ram e � apagado
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
