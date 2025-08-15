import java.util.Scanner;


public class ex1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int n = sc.nextInt();
		
		System.out.println("O fatorial e: " + fatorial(n));

	}
	
	public static int fatorial(int a){
		if(a == 1){
			return 1;
		}else{
			return a * fatorial(a - 1);
		}
		
	}

}
