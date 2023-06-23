// @author RA21600867
package projetoaula002;
import java.util.Scanner;
public class MaiorDois {
    public static void main(String[] args) {
        float valor1, valor2;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite valor 1: ");        
        valor1 = leia.nextFloat();
        System.out.print("Digite valor 2: ");
        valor2 = leia.nextFloat();
        if (valor1 > valor2) {
            System.out.println("Maior valor = " + valor1);
        }
        else {
            if (valor2 > valor1) {
                System.out.println("Maior valor = " + valor2);
            }
            else {
                System.out.println("Valores iguais.");
            }
        }
    }
}