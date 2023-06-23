// @author RA21600867
package projetoaula003;
import java.util.Scanner;
public class MenorValor {
    public static void main(String[] args) {
        int valor, menor, ct = 0, ctPar = 0, ctImpar = 0, soma = 0, prod = 1;
        float media, pcPar, pcImpar, diferenca;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite \"0\" para sair da repetição.\n");
        System.out.print("\nPrimeiro valor inteiro: ");
        valor = leia.nextInt();
        menor = valor;
        if (valor != 0) {
            while (valor != 0) {
                ct ++;
                soma += valor;
                prod *= valor;
                if (valor < menor) {
                    menor = valor;
                }
                if (valor % 2 == 0) {
                    ctPar ++;
                }
                else {
                    ctImpar ++;
                }
                System.out.println("Quantidade de valores: " + ct);
                System.out.print("Valor inteiro: ");
                valor = leia.nextInt();
            }
            media = (float) soma / ct;
            pcPar = (float) ctPar / ct * 100;
            pcImpar = (float) ctImpar / ct * 100;
            diferenca = pcPar - pcImpar;
            System.out.println("\n\nMenor valor: " + menor);
            System.out.println("Quantidade de valores: " + ct);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
            System.out.println("Média dos valores sem o menor valor: " + (float) (soma - menor) / (ct - 1));
            System.out.println("Produto dos valores: " + prod);
            System.out.println("Quantidade de valores pares: " + ctPar);
            System.out.println("Quantidade de valores ímpares: " + ctImpar);
            System.out.println("Porcentagem de valores pares: " + pcPar);
            System.out.println("Porcentagem de valores ímpares: " + pcImpar);
            System.out.println("Diferença percentual entre valores pares e ímpares: " + diferenca);
        }
        else {
            System.out.println("Nenhum valor fornecido.");
        }
    }
}