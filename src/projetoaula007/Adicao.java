// @author RA21600867
package projetoaula007;
import java.util.Scanner;
public class Adicao {
    public static void main(String[] args) {
        int valor1, valor2, valor3, soma, subt, mult;
        Scanner leia = new Scanner(System.in);
        System.out.printf("%s", "Primeiro inteiro: ");
        valor1 = leia.nextInt();
        System.out.printf("%s", "Segundo inteiro: ");
        valor2 = leia.nextInt();
        System.out.printf("%s", "Terceiro valor: ");
        valor3 = leia.nextInt();
        soma = valor1 + valor2 + valor3;
        System.out.printf("%s%d\n", "Soma: ", soma);
        subt = valor1 - valor2 - valor3;
        System.out.printf("%s%d\n", "Subtração: ", subt);
        mult = valor1 * valor2 * valor3;
        System.out.printf("%s%d\n", "Multiplicação: ", mult);
    }
}