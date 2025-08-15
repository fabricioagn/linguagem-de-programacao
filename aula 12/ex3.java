import java.util.Scanner;



public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		int n = sc.nextInt();
		
		System.out.println("numero " + n + "º de fibonacci: " + fibo(n));
	}
	


	public static int fibo(int n){
		int a = 0;
		int b = 1;
		
		if(n == 1){
			return a;
		}else{
			return  fibo2(n - 1, a, b);
		}
	}



	private static int fibo2(int n, int a, int b) {
		a = a + b;
		b = a - b;
		
		if(n == 0){
			return a;
		}else{
			return  fibo2(n - 1, a, b);
		}
	}
	
}
