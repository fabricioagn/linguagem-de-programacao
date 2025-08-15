package teste;

import java.util.Scanner;

import empresa.empregado;

public class teste_emp {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		empregado x = new empregado();
		double a;
		
		System.out.println("digite o nome");
		x.nome = sc.next();
		System.out.println("digite a salarioBruto");
		x.salarioBruto = sc.nextDouble();
		System.out.println("digite a descontos");
		x.descontos = sc.nextDouble();
		System.out.println("digite o almento do salario");
		a = sc.nextDouble();
		double aumento = empregado.aumentarSalario(a);
		
		System.out.println("nome: " + empregado.nome);
		System.out.println("Salário Liquido: " + empregado.salarioLiquido());
		System.out.println("Aumento do Salário: " + empregado.aumentarSalario(aumento));


	}
	
}
