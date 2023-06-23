// @author RA21600867
package projetoaula030;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.print("Digite o numerador inteiro: ");
                int numerator = leia.nextInt();
                System.out.print("Digite o denominador inteiro: ");
                int denominator = leia.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("\nResultado: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            }
            catch (ArithmeticException zero) {
                zero.printStackTrace();
                System.err.println("Zero is an invalid denominator. Please try again.\n");
            }
            catch (InputMismatchException excecao) {
                excecao.printStackTrace();
                leia.next();
                System.err.println("You must enter integers. Please try again.\n");
            }
        }
        while (continueLoop);
    }
}