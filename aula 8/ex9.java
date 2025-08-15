import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = scan.nextInt();
		f(x,1,0);
		
	}
	
	public static int f (int z, int a, int b){

		if (z == 1) {
			System.out.println(a);
		}
		
		a = a + b;
		b = a - b;
		
		
		if (z != 1){
			f (z - 1,a,b);
		}
		return a;
	}
	
}
