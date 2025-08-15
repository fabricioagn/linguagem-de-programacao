
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o seu nome: ");
		String sp = sp(scan);
		System.out.println("bem vindo " + sp);		
	}
	
	public static String sp (Scanner scan){
		
		String b = scan.next();
		
		return b;
	}
	
}
