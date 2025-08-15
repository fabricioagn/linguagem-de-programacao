
import javax.swing.JOptionPane;

public class exem3 {
		
	public static void main(String[] args) {
		
		String entrada = receberTextoDoUsuario("Digite um texto");
		int numerointeiro = receberInteiroDoUsuario("Digite um n�mero inteiro");
		double numeroReal = receberDoubleDoUsuario("Digite un n�mero real");
		JOptionPane.showMessageDialog(null, entrada);
		JOptionPane.showMessageDialog(null, "N�mero inteiro: " +numerointeiro);
		JOptionPane.showMessageDialog(null, "N�mero real: " + numeroReal);
	}
	
	private static String receberTextoDoUsuario (String mensagem) {
			String texto = JOptionPane.showInputDialog (mensagem); 
			return texto;
	}
	
	private static int receberInteiroDoUsuario (String mensagem) {
		String entradaTemp = JOptionPane.showInputDialog (mensagem);
		int inteiroRecebido = Integer.parseInt(entradaTemp);
		return inteiroRecebido;
	}
	
	private static double receberDoubleDoUsuario(String mensagem) {
		String entradaTemp = JOptionPane.showInputDialog(mensagem);
		double doubleRecebido = Double.parseDouble(entradaTemp);
		return doubleRecebido;
	}
		
	public static void mostrarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
				