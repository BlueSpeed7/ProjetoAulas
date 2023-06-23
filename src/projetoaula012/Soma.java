// @author RA21600867
package projetoaula012;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, i, total = 0;
        System.out.print("Digite o primeiro número da multiplicação: ");
        n1 = leia.nextInt();
        System.out.print("Digite o segundo número da multiplicação: ");
        n2 = leia.nextInt();
        for (i = 0; i < n2; i ++) {
            total += n1;
        }
        System.out.println("Resultado: " + total);
    }
}