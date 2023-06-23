// @author RA21600867
package projetoaula006;
import java.util.Scanner;
public class ConversaoLeia {
    public static void main(String[] args) {
        int fahrenheit, vInicial, vFinal, intervalo, ct = 0, ctPausa = 0;
        float soma = 0, media, prod = 1;
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
                    System.out.println("Fahrenheit - Celsius");
                    for (fahrenheit = vInicial; fahrenheit <= vFinal; fahrenheit += intervalo) {
                        System.out.println(fahrenheit + "º - " + (float) (fahrenheit - 32) / 1.8 + "º");
                        ct ++;
                        ctPausa ++;
                        soma += fahrenheit;
                        if (ctPausa == 10) {
                            System.out.println("Digite uma tecla para continuar.");
                            leia.next();
                            ctPausa = 0;
                            System.out.println("Fahrenheit - Celsius");
                        }
                    }
                    media = (float) soma / ct;
                    System.out.println("Quantidade de repetições: " + ct);
                    System.out.println("Soma dos valores: " + soma);
                    System.out.println("Média dos valores: " + media);
                }
                else {
                    System.out.println("ERRO");
                }
            }
            else {
                if (vInicial > vFinal) {
                    if (intervalo <= vInicial - vFinal) {
                        System.out.println("Ordem decrescente:");
                        System.out.println("Fahrenheit - Celsius");
                        for (fahrenheit = vInicial; fahrenheit >= vFinal; fahrenheit -= intervalo) {
                            System.out.println(fahrenheit + "º - " + (float) (fahrenheit - 32) / 1.8 + "º");
                            ct ++;
                            ctPausa ++;
                            soma += fahrenheit;
                            prod *= fahrenheit;
                            if (ctPausa == 10) {
                                System.out.println("Digite uma tecla para continuar.");
                                leia.next();
                                ctPausa = 0;
                                System.out.println("Fahrenheit - Celsius");
                            }
                        }
                        media = (float) soma / ct;
                        System.out.println("Quantidade de repetições: " + ct);
                        System.out.println("Produto dos valores: " + prod);
                        System.out.println("Média dos valores: " + media);
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