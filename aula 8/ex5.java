
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int f = f(scan);
		System.out.println("fatorial: " + f);	
		
	}
	
	public static int f(Scanner scan){
		
		System.out.println("Digite um número: ");
		int a = scan.nextInt();
		int fat = a;
		for (int i = a - 1; i >= 1; i--) {
			
			fat = i * fat;
			
		}
		return fat;
	}
	
}
