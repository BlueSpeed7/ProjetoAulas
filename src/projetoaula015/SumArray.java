// @author RA21600867
package projetoaula015;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valor = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0, ctPar = 0, maior = valor[0], menor = valor[0], somaPosicaoPar = 0;
        double media;
        for (int ct = 0; ct < valor.length; ct ++) {
            total += valor[ct];
            if (valor[ct] % 2 == 0) {
                ctPar ++;
            }
            if (valor[ct] > maior) {
                maior = valor[ct];
            }
            if (valor[ct] < menor) {
                menor = valor[ct];
            }
        }
        System.out.printf("Soma de todos os valores do vetor: %d\n", total);
        media = (double) total / valor.length;
        System.out.printf("Média de todos os valores do vetor: %.1f\n", media);
        System.out.printf("Quantidade de pares: %d\n", ctPar);
        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);
        valor[1] = 33;
        System.out.print("Digite um valor inteiro: ");
        valor[3] = leia.nextInt();
        for (int ct = 0; ct < valor.length; ct ++) {
            if (ct < 9) {
                System.out.printf("%5d", valor[ct]);
            }
            else {
                System.out.printf("%5d\n", valor[ct]);
            }
        }
        for (int ct = 0; ct < valor.length; ct += 2) {
            somaPosicaoPar += valor[ct];
        }
        System.out.printf("Soma dos valores nas posições pares: %d\n", somaPosicaoPar);
    }
}