import java.util.Scanner;


public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;double maior = 0; double menor = 999; double soma = 0; double media = 0; int num = 0; double x = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		max = sc.nextInt();
		
		double[] altura = new double[max];
		String[] genero = new String[max];
		
		for (int i = 0; i < altura.length; i++) {
			
			System.out.println("digite sua altura: ");
			altura[i] = sc.nextDouble();
			
			System.out.println("digite o seu gênero, M ou F: ");
			genero[i] = sc.next();
			
			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}
			if (genero[i] == "f") {
				soma = soma + altura[i];
				x = x + 1;
			}
			media = soma/x;
			if (genero[i] == "m") {
				num = num + 1;
			}
			
		}
		System.out.println("Maior altura do grupo: " + maior);
		System.out.println("menor altura do grupo: " + menor);
		System.out.println("Média da altura das mulheres: " + media);
		System.out.println("Numero de homens: " + num);

	}
}