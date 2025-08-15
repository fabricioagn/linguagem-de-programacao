package formas;

public class retangulo {

	public static double altura;
	public static double largura;
	
	
	public static double area(){
		return altura * largura;
	}
	
	public static double perimetro(){
		return (altura * 2) + (largura * 2);
	}
	
	public static double diagonal(){
		return Math.sqrt((altura * altura) + (largura * largura));
	}
	
	
	
}
