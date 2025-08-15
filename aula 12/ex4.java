import java.util.Scanner;



public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero");
		int n = sc.nextInt();
		System.out.println("digite a potencia");
		int m = sc.nextInt();
		
		System.out.println("potencia do numumero " + n + " elevado a " + m +": " + poten(n, m));
	}
	


	public static int poten(int a, int b){

		if(b == 1){
			return a;
		}else{
			return  a * poten(a, b - 1);
		}
	}
	
}
