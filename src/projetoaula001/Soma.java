// @author RA21600867
package projetoaula001;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        int valor1, valor2, valor3, soma, subt, mult;
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeiro inteiro: ");
        valor1 = leia.nextInt();
        System.out.print("Segundo inteiro: ");
        valor2 = leia.nextInt();
        soma = valor1 + valor2;
        System.out.println("Soma = " + soma);
        subt = valor1 - valor2;
        System.out.println("Subtração = " + subt);
        mult = valor1 * valor2;
        System.out.println("Multiplicação = " + mult);
        System.out.print("Terceiro valor = ");
        valor3 = leia.nextInt();
        soma = valor1 + valor2 + valor3;
        System.out.println("Soma dos três valores = " + soma);
    }
}