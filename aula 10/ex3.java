import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
		int a[] = new int[3];
		
		System.out.println("digite um numero");
		a[3] = sc.nextInt();

		System.out.println(a[3]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("numero fora do vetor");
		}
	}

}
