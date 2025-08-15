import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int max = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		max = sc.nextInt();
		
		if (max <= 10 && max >= 1) {
			
			int[] numero = new int[max];
			int[] negativo = new int[10];
			
			for (int i = 0; i < numero.length; i++) {
				
				System.out.println("digite um numero: ");
				numero[i] = sc.nextInt();
				
				if(numero[i] < 0){
					
					negativo[x] = numero[i];
					x = x + 1;
				}
			}
			
			for (int i = 0; i < x; i++) {
				
				System.out.println("numeros negativos: " + negativo[i]);
			}
			
		} else {
			System.out.println("digite um numero entre 1 e 10");
		}
	}
}
