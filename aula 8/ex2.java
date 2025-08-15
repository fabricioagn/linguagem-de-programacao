
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero:");
		String vf = vf(scan);
		System.out.println("o número é par? " + vf);		
	}
	
	public static String vf (Scanner scan){
		
		String b;
		int a = scan.nextInt();
		if(a % 2 == 0){
			b = "verdadeiro";
		}else{
			b = "falso";
		}
		
		
		
		return b;
	}
	
}
