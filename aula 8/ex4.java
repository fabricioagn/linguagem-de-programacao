
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Ma = Ma(scan);
		System.out.println("O maior �: " + Ma);	
		
	}
	
	public static int Ma(Scanner scan){
		
		System.out.println("Digite um n�mero: ");
		int a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int b = scan.nextInt();
		int maior = 0;
		if (a > b) {
			maior = a;
		}else{
			maior = b;
		}
		return maior;
	}
	
}
