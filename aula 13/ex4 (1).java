import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class ex4 {


	public static void main(String[] args) throws FileNotFoundException, IOException {
		String antigo = null;
		FileInputStream entrada = null;
		FileOutputStream novo = null;
		Scanner sc = new Scanner(System.in);
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int retorno = fc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File arquivo = fc.getSelectedFile();
			if (arquivo.exists()) {
				try {
					antigo = arquivo.getPath();
					antigo = antigo.replace("\\", "/");
					entrada = new FileInputStream(antigo);
					String[] partes = antigo.split("/");
					System.out.println("digite um nome");
					String name = "/"+sc.next();
					partes[partes.length - 1] = name;
					String temp = String.join("/", partes);
					System.out.println(antigo);
					novo = new FileOutputStream(temp);
					int _byte;
					while ((_byte = entrada.read()) != -1) {
						novo.write(_byte);
					}
				} catch (IOException e) {
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
