import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("digite um numero");
			int a = sc.nextInt();
			System.out.println("digite outro numero");
			int b = sc.nextInt();
			int c = a/b;
			
			System.out.println(c);
			
		} catch (ArithmeticException ex) {
			System.out.println("divisão por zero não permitida");
		}
		
	}


}
