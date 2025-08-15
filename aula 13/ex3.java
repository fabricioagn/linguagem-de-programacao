import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ex3 {


	public static void main(String[] args) {
		FileWriter arq_n = null;
		Scanner sc = new Scanner(System.in);
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int retorno = fc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File pasta = fc.getSelectedFile();
			if (pasta.exists()) {
				System.out.println("existe");
				System.out.println("nome do arquivo:");
				String name = "/"+sc.next();
				try {
					arq_n = new FileWriter(pasta + name);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				System.out.println("não existe");
			}
		} else {
			System.out.println("operação cancelada");

		}
		
		

	}

}
