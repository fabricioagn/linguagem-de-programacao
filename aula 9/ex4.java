import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mv = 0;
		int pmv = 0;
		int max = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		max = sc.nextInt();
		

			
		int[] numero = new int[max];
			
		for (int i = 0; i < numero.length; i++) {
				
			System.out.println("digite um numero: ");
			numero[i] = sc.nextInt();
				
			if(numero[i] > mv){
					
				mv = numero[i];
				pmv = i;
					
			}
		}
			
		System.out.println("maior valor: " + mv);
		System.out.println("posição do maior valor: " + pmv);

	}
}
