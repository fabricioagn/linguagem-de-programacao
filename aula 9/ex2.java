import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0; int soma = 0; int media = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		max = sc.nextInt();
		
		int[] numero = new int[max];
		
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println("digite um numero: ");
			numero[i] = sc.nextInt();
			
			soma = soma + numero[i];
			
			media = soma/numero.length;
			
		}
		System.out.print("Valores: ");
		for (int i = 0; i < numero.length; i++) {
			
			System.out.print(numero[i] + " ");
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}
}