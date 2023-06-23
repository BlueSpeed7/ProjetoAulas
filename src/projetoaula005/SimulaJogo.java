// @author RA21600867
package projetoaula005;
import java.util.Scanner;
import java.util.Random;
public class SimulaJogo {
    public static void main(String[] args) {
        int palpite, nrSorteado, tentativa = 0;
        Scanner leia = new Scanner(System.in);
        Random nrAleatorio = new Random();
        nrSorteado = -5 + nrAleatorio.nextInt(11);
        do {
            tentativa ++;
            System.out.println("Tentativa: " + tentativa);
            System.out.println("Advinhe um número entre -5 e 5.");
            palpite = leia.nextInt();
            if (palpite >= -5 && palpite <= 5) {
                if (palpite == nrSorteado) {
                    System.out.println("Você acertou.");
                }
                else {
                    if (palpite > nrSorteado) {
                        System.out.println("Você errou, tente um número menor.");
                    }
                    else {
                        System.out.println("Você errou, tente um número maior.");
                    }
                }
            }
            else {
                System.out.println("ERRO");
            }
        }
        while (palpite != nrSorteado);
        System.out.println("Número de tentativas: " + tentativa);
        if (tentativa < 4) {
            System.out.println("Bom resultado.");
        }
        else {
            System.out.println("Você precisa melhorar.");
        }
    }
}