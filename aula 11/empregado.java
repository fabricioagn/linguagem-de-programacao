package empresa;

public class empregado {
	
	public static String nome;
	public static double salarioBruto;
	public static double descontos;
	
	public static double salarioLiquido(){
		return salarioBruto - descontos;
		
	}

	public static double aumentarSalario(double a){
		return salarioBruto/2 + a;
		
	}
}
