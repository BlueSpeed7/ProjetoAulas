// @author RA21600867
package projetoaula005;
import java.util.Scanner;
public class SequenciaLeia {
    public static void main(String[] args) {
        int i, ct = 0, ctPar = 0, ctImpar = 0, intervalo, vInicial, vFinal;
        float soma = 0, media, prod = 1, pcPar, pcImpar;
        Scanner leia = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        vInicial = leia.nextInt();
        System.out.print("Valor final: ");
        vFinal = leia.nextInt();
        System.out.print("Intervalo: ");
        intervalo = leia.nextInt();
        if (intervalo != 0) {
            if (vInicial < vFinal) {
                if (intervalo <= vFinal - vInicial) {
                    System.out.println("Ordem crescente:");
                    for (i = vInicial; i <= vFinal; i += intervalo) {
                        System.out.println(i);
                        ct ++;
                        soma += i;
                        if (i % 2 == 0) {
                            ctPar ++;
                        }
                        else {
                            ctImpar ++;
                        }
                    }
                    media = (float) soma / ct;
                    pcPar = (float) ctPar / ct * 100;
                    pcImpar = (float) ctImpar / ct * 100;
                    System.out.println("Números gerados: " + ct);
                    System.out.println("Números pares gerados: " + ctPar);
                    System.out.println("Números ímpares gerados: " + ctImpar);
                    System.out.println("Média dos números gerados: " + media);
                    System.out.println("Soma dos números gerados: " + soma);
                    System.out.println("Porcentagem de números pares: " + pcPar);
                    System.out.println("Porcentagem de números ímpares: " + pcImpar);
                    }
                else {
                    System.out.println("ERRO");
                }
            }
            else {
                if (vInicial > vFinal) {
                    if (intervalo <= vInicial - vFinal) {
                        System.out.println("Ordem decrescente:");
                        for (i = vInicial; i >= vFinal; i -= intervalo) {
                            System.out.println(i);
                            ct ++;
                            soma += i;
                            prod *= i;
                            if (i % 2 == 0) {
                                ctPar ++;
                            }
                            else {
                                ctImpar ++;
                            }
                        }
                        media = (float) soma / ct;
                        pcPar = (float) ctPar / ct * 100;
                        pcImpar = (float) ctImpar / ct * 100;
                        System.out.println("Números gerados: " + ct);
                        System.out.println("Números pares gerados: " + ctPar);
                        System.out.println("Números ímpares gerados: " + ctImpar);
                        System.out.println("Média dos números gerados: " + media);
                        System.out.println("Produto dos números gerados: " + prod);
                        System.out.println("Porcentagem de números pares: " + pcPar);
                        System.out.println("Porcentagem de números ímpares: " + pcImpar);
                        }
                    else {
                        System.out.println("ERRO");
                    }
                }
                else {
                    System.out.println("ERRO");
                }
            }
        }
        else {
            System.out.println("ERRO");
        }
    }
}