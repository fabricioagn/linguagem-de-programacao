
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero:");
		int d = d(scan);
		System.out.println("dobro: " + d);		
	}
	
	public static int d (Scanner scan){
		
		int a = scan.nextInt();
		int b = a*2;
		
		return b;
	}
	
}
