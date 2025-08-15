import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int media = 0;
		int max = 0;
		System.out.println("Quantos aluno voce vai digitar? ");
		max = sc.nextInt();
			
			String[] nomes = new String[max];
			int[][] notas = new int[max][2];
			String[] aprovados = new String[max];
			
			for (int i = 0; i < nomes.length; i++) {
				
				System.out.println("digite o nome do aluno: ");
				nomes[i] = sc.next();
			}
			for (int i = 0; i < notas.length; i++) {
				
				System.out.println("digite a nota do 1° semestre do aluno " + nomes[i]);
				notas[i][0] = sc.nextInt();
				System.out.println("digite a nota do 2° semestre do aluno " + nomes[i]);
				notas[i][1] = sc.nextInt();
				
				media = (notas[i][0] + notas[i][1])/2;
				
				if (media >= 6){
					
					aprovados[i] = nomes[i];
					
				}
			}
			
		for (String aprovado : aprovados) {
				
			if (aprovado != null){
			System.out.println("aprovados: " + aprovado);
			}
		}
			
	}
}
