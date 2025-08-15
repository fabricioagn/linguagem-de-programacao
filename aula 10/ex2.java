import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("digite um numero");
			String a = sc.next();
			int b = Integer.parseInt(a);
			System.out.println(b);
		
		} catch (NumberFormatException ex) {
			System.out.println("converção impossivel");
		}	
	}
	
}