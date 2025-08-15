import java.util.Scanner;



public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("A soma de 1 até " + n + " é " + soma(n));
	}
	


	public static int soma(int n){
		if(n == 1){
			return 1;
		}else{
			return n + soma(n - 1);
		}
	}
	
}
