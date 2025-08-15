import java.util.Scanner;


public class ex3 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("digite o 1° valor");
		
		a = ler.nextInt();
		
		System.out.println("digite o 2° valor");
		
		b = ler.nextInt();
		
		System.out.println("digite o 3° valor");
		
		c = ler.nextInt();
		
		System.out.println("digite o 4° valor");
		
		d = ler.nextInt();
		
		System.out.print("diferença: " );
		System.out.println(a*b-c*d);
		
	}

}
