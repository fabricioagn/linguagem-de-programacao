import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ex4 {


	public static void main(String[] args) {
		FileReader antigo = null;
		FileWriter novo = null;
		Scanner sc = new Scanner(System.in);
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int retorno = fc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File arquivo = fc.getSelectedFile();
			if (arquivo.exists()) {
				try {
					antigo = new FileReader(arquivo);
					String[] partes = antigo.split("/");
					String name = "/"+sc.next();
					novo = new FileWriter(arg0)
				} catch (FileNotFoundException e) {
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
