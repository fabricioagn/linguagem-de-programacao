import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {	
		Scanner numero = new Scanner(System.in);
	
		System.out.println("digite 1 numero \ncaso seja positivo ou zero, retorna 1, do contrario 0");
		int n = numero.nextInt();
		System.out.println(bi(n));
	
	}	
	
	public static int bi(int a) {
		int b = 2;
		if (a >= 0){
			b = 1;
		} else {
			b = 0;
		}
		return b;
	}
}


