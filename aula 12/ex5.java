import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        
        String resultado = inverterString(entrada);
        System.out.println("String invertida: " + resultado);
    }

    public static String inverterString(String s) {
        String filtrada = filtrarAlfabeticos(s, 0);
        return inverterRecursivo(filtrada);
    }

    private static String filtrarAlfabeticos(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        
        char c = s.charAt(index);
        String restante = filtrarAlfabeticos(s, index + 1);
        
        if (Character.isLetter(c)) {
            return c + restante;
        } else {
            return restante;
        }
    }

    private static String inverterRecursivo(String s) {
        if (s.isEmpty()) {
            return "";
        } else {
            return s.charAt(s.length() - 1) + inverterRecursivo(s.substring(0, s.length() - 1));
        }
    }
}