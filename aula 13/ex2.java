import java.io.File;


public class ex2 {


	public static void main(String[] args) {
		File pasta = new File("C:/Documents and Settings/Fatec/Meus documentos/aula 13/pasta_temp");
		if(pasta.isDirectory()){
			String[] arquivos = pasta.list();
			for(String arquivo: arquivos){
				System.out.println(arquivo);
			}
		}

	}

}
