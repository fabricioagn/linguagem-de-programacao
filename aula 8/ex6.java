
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = m(scan);
		System.out.println("arredondado e potenciado: " + m);	
		
	}
	
	public static int m (Scanner scan){
		int m = 0;
		System.out.println("Digite um número: ");
		double a = scan.nextDouble();
		int b = (int)Math.round(a);
		System.out.println("Digite outro número: ");
		int c = scan.nextInt();
		m = (int) Math.pow(b, c);
		
		return m;
	}
	
}
