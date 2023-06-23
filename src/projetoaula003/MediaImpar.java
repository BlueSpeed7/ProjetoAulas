// @author RA21600867
package projetoaula003;
import java.util.Scanner;
public class MediaImpar {
    public static void main(String[] args) {
        int ctPar = 0, ctGeral = 0, numero, somaPar = 0, somaGeral = 0, somaImpar = 0;
        float media, pcPar;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite \"0\" para sair da repetição.\n");
        System.out.print("\nNúmero inteiro: ");
        numero = leia.nextInt();
        if (numero != 0) {
            while (numero != 0) {
                ctGeral ++;
                somaGeral += numero;
                if (numero % 2 == 0) {
                    ctPar ++;
                    somaPar += numero;
                }
                else {
                    somaImpar += numero;
                }
                System.out.print("Número inteiro: ");
                numero = leia.nextInt();
            }
            if (ctPar != 0) {
                media = (float) somaPar / ctPar;
                System.out.println("\n\nMédia dos números pares: " + media);
                System.out.println("Quantidade de números pares: " + ctPar);
                System.out.println("Soma dos números pares: " + somaPar);
                pcPar = (float) ctPar / ctGeral * 100;
                System.out.println("Porcentagem de números pares: " + pcPar);
            }
            else {
                System.out.println("\n\nNenhum número par foi fornecido.");
            }
            media = (float) somaGeral / ctGeral;
            System.out.println("Quantidade de números: " + ctGeral);
            System.out.println("Soma dos números: " + somaGeral);
            System.out.println("Média dos números: " + media);
            System.out.println("Quantidade de números ímpares: " + (ctGeral - ctPar));
            System.out.println("Soma dos números ímpares: " + somaImpar);
            System.out.println("Porcentagem de números ímpares: " + (float) (ctGeral - ctPar) / ctGeral * 100);
        }
        else {
            System.out.println("Nenhum número foi fornecido.");
        }
    }
}