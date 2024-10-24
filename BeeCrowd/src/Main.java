import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int E = Integer.parseInt(in.readLine());
        int F = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());
        while(true) {
        	while(E<0 || E>1000) {
        		E = Integer.parseInt(in.readLine());
    		}
        	
        	while(F<0 || F>1000) {
        		F = Integer.parseInt(in.readLine());
    		}
        	
        	while(C<1 || C>2000) {
        		C = Integer.parseInt(in.readLine());
        	}
        	break;
        }
        
        int total;
        int resto;
        total = (E+F)/C;
        int totalBebido=total;
        
        while(total>1) {
        	resto = total%2;
        	total = (total/2)+resto;
        	totalBebido+=total;
        }
        System.out.printf("%d",totalBebido);
    }
 
}