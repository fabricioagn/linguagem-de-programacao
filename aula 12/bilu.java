import java.util.Scanner;


public class bilu {

	public static int soma(int n){
		if(n == 1){
			return 1;
		}else{
			return n + soma(n - 1);  //chamada recursiva
		}
	}
	
	public static void main(String[] args) {
		
	  int n = 5; // 1 + 2 + 3 + 4 + 5 = 15
		
	  System.out.println("A soma de 1 até " + n + " é " + soma(n));
	}

}
