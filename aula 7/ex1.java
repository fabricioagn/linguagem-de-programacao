import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {	
		Scanner numero = new Scanner(System.in);
	
		System.out.println("Digite a primeira nota");
		double n1 = numero.nextDouble();
		System.out.println("Digite a segunda nota");
		double n2 = numero.nextDouble();
		System.out.println("A média das notas é notas: " + Media(n1,n2));
}
	
	
	public static double Media(double a, double b){
		
		return (a + b)/2;
	}
	
}

