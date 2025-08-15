import javax.swing.JOptionPane;
	
public class exem2{

	
	public static void main(String[] args) {
	mostrarHelloWorld();
	mostrarMensagem("ola, mundo!");
	
	}
	
	public static void mostrarHelloWorld() {
		JOptionPane.showMessageDialog(null, "Hello, World!");
	}
	
	public static void mostrarMensagem (String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
