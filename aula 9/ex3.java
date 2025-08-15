import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int max = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		max = sc.nextInt();
			
		int[] numero = new int[max];
		int[] pares = new int[max];
			
		for (int i = 0; i < numero.length; i++) {
				
			System.out.println("digite um numero: ");
			numero[i] = sc.nextInt();
				
			if(numero[i] % 2 == 0){
					
				pares[x] = numero[i];
				x = x + 1;
			}
		}
		System.out.println("numeros pares: ");
		for (int i = 0; i < x; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.printf("\nquantidade de numeros pares = " + x);
			

	}
}
