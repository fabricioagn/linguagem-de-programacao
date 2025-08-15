import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {	
		Scanner numero = new Scanner(System.in);
	
		System.out.println("digite 2 numeros");
		double n1 = numero.nextDouble();
		double n2 = numero.nextDouble();
		System.out.print("escolha o tipo de operação \n" +  "soma(+), subtrair(-), multiplição(x), divisão(/) \n");
		char qt = numero.next().charAt(0);
		
		
		switch (qt) {
		case '+':
			System.out.println("soma: " + soma(n1,n2));
			
		break;
		
		case '-':
			System.out.println("soma: " + subtrair(n1,n2));
			
	    break;
	    
	    case 'x':
	    	System.out.println("soma: " + multiplicar(n1,n2));
			
	    break;
	    
	    case '/':
	    	System.out.println("soma: " + dividir(n1,n2));
			
	    break;
	    
		default:
			System.out.println("numero invalido");
		break;
		}
	
	}	
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}
}


