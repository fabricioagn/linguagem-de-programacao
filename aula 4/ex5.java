import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int c1;
		int n1;
		float v1;
		int c2;
		int n2;
		float v2;
		
		System.out.println("digite o codigo da pe�a 1");
		c1 = ler.nextInt();
		
		System.out.println("digite o numero de pe�as 1");
		n1 = ler.nextInt();
		
		System.out.println("digite o valor da pe�a 1");
		v1 = ler.nextFloat();
		
		System.out.println("digite o codigo da pe�a 1");
		c2 = ler.nextInt();
		
		System.out.println("digite o numero de pe�as 1");
		n2 = ler.nextInt();
		
		System.out.println("digite o valor da pe�a 1");
		v2 = ler.nextFloat();
		
		float pagar = n1*v1+n2*v2;
		
		System.out.printf("valor a pagar: R$ %.2f", pagar);
		
	}

}
