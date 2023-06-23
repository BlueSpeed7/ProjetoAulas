// @author RA21600867
package projetoaula013;
import java.util.Scanner;
import java.util.Random;
public class RollDie {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random nrAleatorio = new Random();
        String resposta, maiorFrequencia;
        int face, roll, exe = 0, majorFrequency;
        float porc1, porc2, porc3;
        do {
            exe ++;
            int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0, frequency5 = 0, frequency6 = 0;
            for (roll = 1; roll <= 6000; roll ++) {
                face = 1 + nrAleatorio.nextInt(6);
                if (face == 1) {
                    ++ frequency1;
                }
                else {
                    if (face == 2) {
                        ++ frequency2;
                    }
                    else {
                        if (face == 3) {
                            ++ frequency3;
                        }
                        else {
                            if (face == 4) {
                                ++ frequency4;
                            }
                            else {
                                if (face == 5) {
                                    ++ frequency5;
                                }
                                else {
                                    ++ frequency6;
                                }
                            }
                        }
                    }
                }
            }
            majorFrequency = Math.max(frequency6, (Math.max(frequency5, Math.max(frequency4, Math.max(frequency3, Math.max(frequency2, frequency1))))));
            if (majorFrequency == frequency1) {
                maiorFrequencia = "1";
            }
            else {
                if (majorFrequency == frequency2) {
                    maiorFrequencia = "2";
                }
                else {
                    if (majorFrequency == frequency3) {
                        maiorFrequencia = "3";
                    }
                    else {
                        if (majorFrequency == frequency4) {
                            maiorFrequencia = "4";
                        }
                        else {
                            if (majorFrequency == frequency5) {
                                maiorFrequencia = "5";
                            }
                            else {
                                maiorFrequencia = "6";
                            }
                        }
                    }
                }
            }
            porc1 = (float) frequency1 / roll * 100;
            porc2 = (float) frequency2 / roll * 100;
            porc3 = (float) frequency3 / roll * 100;
            System.out.printf("Execução %d\n", exe);
            System.out.println("Face\tFrequência\tPorcentagem");
            System.out.printf("1\t%d\t\t%.2f%%\n2\t%d\t\t%.2f%%\n3\t%d\t\t%.2f%%\n4\t%d\t\t%.2f%%\n5\t%d\t\t%.2f%%\n6\t%d\t\t%.2f%%\n", frequency1, porc1, frequency2, porc2, frequency3, porc3, frequency4, RollDie.calculaPorcentagem(frequency4), frequency5, RollDie.calculaPorcentagem(frequency5), frequency6, RollDie.calculaPorcentagem(frequency6));
            System.out.printf("O lado do dado que foi sorteado mais vezes é: %s\n", maiorFrequencia);
            System.out.println("Deseja executar o programa novamente? (y/n)");
            resposta = leia.next();
            if (!"Y".equals(resposta) && !"y".equals(resposta) && !"N".equals(resposta) && !"n".equals(resposta)) {
                while (!"Y".equals(resposta) && !"y".equals(resposta) && !"N".equals(resposta) && !"n".equals(resposta)) {
                    System.err.println("Comando inválido.");
                    System.out.println("Deseja executar o programa novamente? (y/n)");
                    resposta = leia.next();
                }
            }
        }
        while ("Y".equals(resposta) || "y".equals(resposta));
        System.out.printf("Número de execuções: %d\n", exe);
    }
    public static float calculaPorcentagem(int frequency) {
        int roll = 6000;
        return (float) frequency / roll * 100;
    }
}