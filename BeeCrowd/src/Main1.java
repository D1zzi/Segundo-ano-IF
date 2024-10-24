import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main1 {
 
    public static void main(String[] args) throws IOException {
 
    	InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        String A = in.readLine();
        String C = "";
        if(A.length()>=10) {
        	C = "palavrao";
        }else {
        	C = "palavrinha";
        }
        System.out.printf("%s%n",C);
 
    }
 
}