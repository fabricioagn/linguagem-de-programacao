import java.util.Scanner;

public class ex6 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double pi = 3.14159;
		
		System.out.println("digite o valor de A");
		A = ler.nextDouble();
		
		System.out.println("digite o valor de B");
		B = ler.nextDouble();
		
		System.out.println("digite o valor de C");	
		C = ler.nextDouble();
		
		System.out.printf("triangulo: %.3f %n", (A*C)/2);
		System.out.printf("circulo: %.3f %n", pi*(C*C));
		System.out.printf("trapezio: %.3f %n", (A+B)*C/2);
		System.out.printf("quadrado: %.3f %n", B*B);
		System.out.printf("retangulo: %.3f %n", A*B);
	
	}
	
}