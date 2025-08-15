
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mediana = mediana(scan);
		System.out.println("a mediana é: " + mediana);	
		
	}
	
	public static int mediana (Scanner scan){
	
		int mediano = 0; 
		
		System.out.println("Digite o primeiro número: ");
		int a = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int b = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int c = scan.nextInt();
		
		if ((a > b) && (a > c) && (b > c)) {
			mediano  = b;
			
		}else{
			if ((b > a) && (b > c) && (a > c)) {
				
				mediano  = a;
				
			}else{
				mediano  = c;
			}
		}
		
		return mediano;
	}
	
}
