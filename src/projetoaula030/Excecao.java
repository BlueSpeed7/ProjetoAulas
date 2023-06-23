// @author RA21600867
package projetoaula030;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Excecao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 1;
        boolean failure = false;
        while (valor != 0) {
            try {
                System.out.print("Digite um valor inteiro: ");
                valor = leia.nextInt();
                System.out.println(valor);
                System.out.print("Digite um valor inteiro: ");
                int valor2 = leia.nextInt();
                System.out.println(valor / valor2);
                int[] valores = {10, 20, 30};
                for (int i = 0; i < valores.length; i ++) {
                    System.out.println(valores[i]);
                }
                if (!failure) {
                    System.exit(0);
                }
                else {
                    System.out.println(valores[3]);
                }
            }
            catch (InputMismatchException excecao) {
                failure = true;
                excecao.printStackTrace();
                leia.next();
                System.err.println("You must enter integers. Please try again.");
            }
            catch (ArithmeticException zero) {
                failure = true;
                zero.printStackTrace();
                System.err.println("Zero is an invalid denominator. Please try again.");
            }
            catch (ArrayIndexOutOfBoundsException posicao) {
                posicao.printStackTrace();
                System.out.println("Posição não existe. Por favor tente de novo.");
            }
            finally {
                System.err.println("Passou no bloco finally do método main.\n");
            }
        }
    }
}