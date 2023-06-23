// @author RA21600867
package projetoaula046;
import java.util.Scanner;
public class RegExTest {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean vlRetorno;
        System.out.print("Digite a entrada ou [s] para sair: ");
        String dado = leia.nextLine();
        while (!dado.equals("s") && !dado.equals("S")) {
            vlRetorno = RegEx.validaEntrada(dado);
            if (vlRetorno) {
                System.out.println("Entrada válida.");
            }
            else {
                System.out.println("Entrada inválida.");
            }
            System.out.print("Digite a entrada ou [s] para sair: ");
            dado = leia.nextLine();
        }
    }
}