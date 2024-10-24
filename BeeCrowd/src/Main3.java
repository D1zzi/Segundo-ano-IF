import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main3 {
 
    public static void main(String[] args) throws IOException {
    	
    	InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int n = Integer.parseInt(in.readLine());
        
        int total = n*n;
        int resto = total%2;
        
        int preto = total/2;
        int branco = (total/2)+resto;
        
        System.out.printf("%d",branco+" casas brancas e ");
        System.out.printf("%d%n",preto+" casas pretas");
 
    }
 
}