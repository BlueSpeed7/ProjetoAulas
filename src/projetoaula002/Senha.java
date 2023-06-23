// @author Fernando
package projetoaula002;
import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = leia.nextLine();
        if ("123".equals(senha)) {
            System.out.println("Acesso liberado.");
        }
        else {
            System.out.println("Senha inválida.");
        }
    }
}