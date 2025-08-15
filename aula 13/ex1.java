import javax.swing.JFileChooser;
import java.io.File;


public class ex1 {


	public static void main(String[] args) {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int retorno = fc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File pasta = fc.getSelectedFile();
			if (pasta.exists()) {
				System.out.println("existe");
				
			} else {
				System.out.println("não existe");
			}
		} else {
			System.out.println("operação cancelada");

		}
		
		

	}

}
