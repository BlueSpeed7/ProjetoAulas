// @author RA21600867
package projetoaula019;
import java.util.Arrays;
public class VarArgsTest {
    public static double average(double ... numbers) {
            double total = 0.0;
            for (int d = 0; d < numbers.length; d ++) {
                total += numbers[d];
            }
            return (double) total / numbers.length;
        }
    public static double maiorValor(double ... numbers) {
        double maior = numbers[0];
        for (double valor: numbers) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }
    public static void mostraValores(double ... numbers) {
        System.out.println("Valores:");
        for (int d = 0; d < numbers.length; d ++) {
            System.out.printf("%.1f\n", numbers[d]);
        }
    }
    public static void mostrarNomes(String ... nomes) {
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem alfabética:");
        for (String s: nomes) {
            System.out.printf("%s\n", s);
        }
    }
    public static void main(String[] args) {
        double d1 = 10.0, d2 = 20.0, d3 = 30.0, d4 = 40.0;
        String s1 = "Carlos", s2 = "Paulo", s3 = "Ana", s4 = "Fernando", s5 = "Sarah", s6 = "William", s7 = "Lucas", s8 = "Trump", s9 = "Mary", s10 = "Joseph";
        System.out.println("Valores usados nos testes:");
        System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4);
        System.out.printf("Média de d1 e d2 é %.1f\n", average(d1, d2));
        System.out.printf("Média de d1, d2 e d3 é %.1f\n", average(d1, d2, d3));
        System.out.printf("Média de d1, d2, d3 e d4 é %.1f\n", average(d1, d2, d3, d4));
        System.out.printf("Média de d1: %.1f\n", average(d1));
        System.out.printf("Maior valor de d1, d2, d3 e d4: %.1f\n", maiorValor(d1, d2, d3, d4));
        mostraValores(d1, d2, d3, d4);
        mostrarNomes(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
    }
}