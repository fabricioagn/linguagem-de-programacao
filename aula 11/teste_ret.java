package teste;

import java.util.Scanner;

import formas.retangulo;

public class teste_ret {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		retangulo x = new retangulo();
		
		System.out.println("digite a altura");
		x.altura = sc.nextDouble();
		System.out.println("digite a largura");
		x.largura = sc.nextDouble();
		
		System.out.println("area: " + retangulo.area());
		System.out.println("perimetro: " + retangulo.perimetro());
		System.out.println("diagonal: " + retangulo.diagonal());


	}
	
}
