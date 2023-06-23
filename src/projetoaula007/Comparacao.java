// @author RA21600867
package projetoaula007;
import java.util.Scanner;
public class Comparacao {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leia = new Scanner(System.in);
        System.out.printf("%s", "Primeiro número: ");
        num1 = leia.nextInt();
        System.out.printf("%s", "Segundo número: ");
        num2 = leia.nextInt();
        if (num1 == num2) {
            System.out.printf("%d é igual a %d\n", num1, num2);
        }
        else {
            if (num1 > num2) {
                System.out.printf("%d é maior que %d\n", num1, num2);
            }
            else {
                System.out.printf("%d é menor que %d\n", num1, num2);
            }
        }
        if (num1 % 2 == 0) {
            System.out.printf("%s\n", "Primeiro número é par.");
        }
        else {
            System.out.printf("%s\n", "Primeiro número é ímpar.");
        }
        if (num2 % 2 == 0) {
            System.out.printf("%s\n", "Segundo número é par.");
        }
        else {
            System.out.printf("%s\n", "Segundo número é ímpar.");
        }
        if (num1 % 3 == 0) {
            System.out.printf("%s\n", "Primeiro número é múltiplo de 3.");
        }
        if (num2 % 3 == 0) {
            System.out.printf("%s\n", "Segundo número é múltiplo de 3.");
        }
    }
}