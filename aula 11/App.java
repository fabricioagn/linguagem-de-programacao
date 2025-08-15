package App;

import util1.utilidade;

public class App {

	
	public static void main(String[] args) {
		double celsius = utilidade.farenheitParaCelsius(100);
		System.out.println("100° F é igual a " + celsius + " ºc");
		
		utilidade.exibirMensagem("reutilização de classes! ");

	}

}
