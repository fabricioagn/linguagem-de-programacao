package util1;

public class utilidade {
	
	
	
    public static double farenheitParaCelsius(double farenheit){
    	return (farenheit - 32) *5/9;
    }
    
    public static double CelsiusParaFarenheit(double celsius){
   	 return (celsius * 9) + 32;
   }
    
    //metodopara exibir uma mensagem
    
    public static void exibirMensagem(String mensagem){
    	System.out.println("Mensagem: " + mensagem);
    }
}
