import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {	
		Scanner numero = new Scanner(System.in);
	
		System.out.println("escolha enter 3 e 5 numeros");
		int qt = numero.nextInt();
		
		
		switch (qt) {
		case 3:
			double media3 = Media03(numero);
			System.out.println("média de 3 numeros: " + media3);
			
		break;
		
		case 4:
			double media4 = Media03(numero);
			System.out.println("média de 3 numeros: " + media4);
			
	    break;
	    
	    case 5:
			double media5 = Media03(numero);
			System.out.println("média de 3 numeros: " + media5);
			
	    break;
	    
		default:
			System.out.println("numero invalido");
		break;
		}
	
	}	
	
	public static double Media03(Scanner numero) {
		double soma = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("digite o " + i + "° numero");
			soma += numero.nextDouble();
		}
		return soma/3;
	}
	
	public static double Media04(Scanner numero) {
		double soma = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("digite o " + i + "° numero");
			soma += numero.nextDouble();
		}
		return soma/4;
	}
	
	public static double Media05(Scanner numero) {
		double soma = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("digite o " + i + "° numero");
			soma += numero.nextDouble();
		}
		return soma/5;
	}
}


