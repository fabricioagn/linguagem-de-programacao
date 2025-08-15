
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Ma = Ma(scan);
		System.out.println("O maior é: " + Ma);	
		
	}
	
	public static int Ma(Scanner scan){
		
		System.out.println("Digite um número: ");
		int a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
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
