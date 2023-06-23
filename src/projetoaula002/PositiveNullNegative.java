// @author Fernando
package projetoaula002;
import java.util.Scanner;
public class PositiveNullNegative {
    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Type \"0\" to break loop.");
            System.out.print("Type value: ");
            value = sc.nextInt();
            if (value > 0) {
                System.out.println("Value typed: " + value + "\nValue is positive.\nDouble the value: " + value * 2);
            }
            else
                if (value < 0) {
                System.out.println("Value typed: " + value + "\nValue is negative.\nTriple the value: " + value * 3);
            }
                else {
                System.out.println("Value typed: " + value + "\nValue is null.");
            }
        }
        while (value != 0);
    }
}