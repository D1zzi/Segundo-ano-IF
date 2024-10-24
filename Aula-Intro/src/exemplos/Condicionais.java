package exemplos;

public class Condicionais {

	public static void main(String[] args) {
		
		int x = -5;
		int y = 5;
		
		if(x > 0 && y > 0) { // and = && e || = or e ! = not
			x = 10;
			y = 10;
		} else {
			x = -10;
			y = -10;
		}
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
