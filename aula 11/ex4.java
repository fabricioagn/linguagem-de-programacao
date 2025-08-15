
class HelloWorld {

public static void main(String[] args) {

String nome = null;


try {


System.out.println("Tamanho do nome: " + nome.length());

} catch (NullPointerException e) {

System.out.println("Erro: Tentativa de acessar a quantidade do nome. Referencia nula.");

} finally {

System.out.println("Fim codigo");

}

}

}
