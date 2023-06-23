// @author RA21600867
package projetoaula043;
import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        try {
            System.out.printf("Substring from index 27 to end is \"%s\"\n", letters.substring(27));
            System.out.printf("Substring from index 3 to index before 6 is \"%s\"\n", letters.substring(3, 6));
        }
        catch (StringIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.printf("Substring from index 20 to end is \"%s\"\n", letters.substring(20));
            System.out.printf("Substring from index 3 to index before 6 is \"%s\"\n", letters.substring(3, 6));
            String nomePessoa = "Carlos Pereira";
            System.out.println(nomePessoa.substring(0, 6));
            Scanner leia = new Scanner(System.in), sc = new Scanner(System.in);
            System.out.print("Digite um nome completo: ");
            String nomeCompleto = leia.nextLine();
            int space = 0;
            for (int i = 0; i < nomeCompleto.length(); i ++) {
                if (nomeCompleto.charAt(i) == ' ') {
                    space = i;
                    break;
                }
            }
            if (space > 0) {
                System.out.printf("Primeiro nome: %s\n", nomeCompleto.substring(0, space));
            }
            else {
                System.out.printf("Primeiro nome: %s\n", nomeCompleto);
            }
            System.out.print("Digite um nome completo: ");
            nomeCompleto = sc.nextLine();
            space = nomeCompleto.indexOf(' ');
            if (space > 0) {
                System.out.printf("Primeiro nome: %s\n", nomeCompleto.substring(0, space));
            }
            else {
                System.out.printf("Primeiro nome: %s\n", nomeCompleto);
            }
        }
    }
}