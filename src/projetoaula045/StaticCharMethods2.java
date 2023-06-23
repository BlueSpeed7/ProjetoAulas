// @author RA21600867
package projetoaula045;
import java.util.Scanner;
import java.util.InputMismatchException;
public class StaticCharMethods2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try {
            System.out.print("Please enter a radix: ");
            int radix = leia.nextInt();
            System.out.printf("Please choose one:\n1 -- Convert digit to character\n2 -- Convert character to digit\n");
            int choice = leia.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a digit: ");
                    int digit = leia.nextInt();
                    System.out.printf("Convert digit to character: %s\n", Character.forDigit(digit, radix));
                    break;
                case 2:
                    System.out.print("Enter a character: ");
                    char character = leia.next().charAt(0);
                    System.out.printf("Convert character to digit: %s\n", Character.digit(character, radix));
                    break;
            }
        }
        catch (InputMismatchException exception) {
            exception.printStackTrace();
        }
    }
}