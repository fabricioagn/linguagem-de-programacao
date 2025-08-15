
import java.util.Scanner;

public class exemplo_aula {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nota = new int[4];
	    int soma = 0; int media = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + i + "°");
			int n1 = scan.nextInt();
			
			
			 soma = soma + i;
			
		}
		
		 media = soma/4;
		     System.out.println("A média das quatro notas e: " + media);
		
	}

}
