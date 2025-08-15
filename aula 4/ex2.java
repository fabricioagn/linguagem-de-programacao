import java.util.Scanner;


public class ex2 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float pi = 3.14159f;
		float r;
		
		System.out.println("digite o valor do raio");
		
		r = ler.nextFloat();
		
		System.out.printf("valor da área: %.4f %n", pi*(r*r));
	
		
	}

}
