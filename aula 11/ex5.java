import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		
		try {
			String a = null;
			int b = a.length();
			System.out.println(b);
		} catch (NullPointerException e) {
			System.out.println("o metodo tem valor nulo");
		}
		
	}


}
