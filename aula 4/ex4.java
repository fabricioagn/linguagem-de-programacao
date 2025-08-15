import java.util.Scanner;

public class ex4 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n_f;
		float h;
		float v_h;
		
		System.out.println("digite o numero do funcionario");
		
		n_f = ler.nextInt();
		
		System.out.println("digite o numero de horas trabalhadas");
		
		h = ler.nextFloat();
		
		System.out.println("digite o valor ganho por hora");
		
		v_h = ler.nextFloat();
		
		
		System.out.println("numero = " + n_f);
		System.out.printf("salario = %.2f", h*v_h);
		
	}

}
