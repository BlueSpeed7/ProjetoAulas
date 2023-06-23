// @author RA21600867
package projetoaula002;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        int valor;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor inteiro: ");
        valor = leia.nextInt();
        if (valor % 2 == 0) {
            System.out.println("Valor = " + valor + ", o valor é par. O dobro do valor é " + valor * 2);
        }
        else {
            System.out.println("Valor = " + valor + ", o valor é ímpar. O triplo do valor é " + valor * 3);
        }
        if (valor % 5 == 0) {
            System.out.println("O valor é múltiplo de cinco.");
        }
        else {
            System.out.println("O valor não é múltiplo de cinco.");
        }
    }    
}