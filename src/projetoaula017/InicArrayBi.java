// @author RA21600867
package projetoaula017;
import java.util.Scanner;
public class InicArrayBi {
    public static void main(String[] args) {
        String maiorMatriz;
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2}, {7}, {4, 5, 6}};
        int[][] matriz3 = new int[2][4];
        mostraArray(matriz1, "1");
        System.out.println();
        mostraArray(matriz2, "2");
        System.out.println();
        mostraArray(matriz3, "3");
        System.out.println();
        leMatriz(matriz3);
        System.out.println();
        mostraArray(matriz3, "3");
        System.out.println();
        matriz3[0][1] = 44;
        mostraArray(matriz3, "3");
        System.out.printf("\nMaior valor da matriz 1: %d\n", maiorMatriz(matriz1));
        int maiorValor = maiorMatriz(matriz1);
        maiorMatriz = "1";
        System.out.printf("Maior valor da matriz 2: %d\n", maiorMatriz(matriz2));
        if (maiorMatriz(matriz2) > maiorValor) {
            maiorValor = maiorMatriz(matriz2);
            maiorMatriz = "2";
        }
        System.out.printf("Maior valor da matriz 3: %d\n", maiorMatriz(matriz3));
        if (maiorMatriz(matriz3) > maiorValor) {
            maiorValor = maiorMatriz(matriz3);
            maiorMatriz = "3";
        }
        System.out.printf("Maior matriz: %s\nMaior valor das três matrizes: %d\n", maiorMatriz, maiorValor);
        System.out.println();
        somaLinha(matriz1, "1");
        System.out.println();
        somaLinha(matriz2, "2");
        System.out.println();
        somaLinha(matriz3, "3");
        System.out.println();
        System.out.printf("Soma dos valores da matriz 1: %d\n", somaMatriz(matriz1));
        System.out.printf("Soma dos valores da matriz 2: %d\n", somaMatriz(matriz2));
        System.out.printf("Soma dos valores da matriz 3: %d\n", somaMatriz(matriz3));
    }
    public static void mostraArray(int[][] matriz, String nomeMatriz){
        System.out.printf("Valores na matriz %s por linha.\n", nomeMatriz);
        for (int row = 0; row < matriz.length; row ++) {
            for (int column = 0; column < matriz[row].length; column ++) {
                System.out.printf("%d ", matriz[row][column]);
            }
            System.out.println();
        }
    }
    public static void leMatriz(int[][] matriz) {
        Scanner leia = new Scanner(System.in);
        for (int row = 0; row < matriz.length; row ++) {
            for (int column = 0; column < matriz[row].length; column ++) {
                System.out.printf("Digite o valor da linha %d, coluna %d: ", row + 1, column + 1);
                int valor = leia.nextInt();
                matriz[row][column] = valor;
            }
        }
    }
    public static int maiorMatriz(int[][] matriz) {
        int maiorValor = matriz[0][0];
        for (int row = 0; row < matriz.length; row ++) {
            for (int column = 0; column < matriz[row].length; column ++) {
                if (matriz[row][column] > maiorValor) {
                    maiorValor = matriz[row][column];
                }
            }
        }
        return maiorValor;
    }
    public static int somaMatriz(int[][] matriz) {
        int soma = 0;
        for (int row = 0; row < matriz.length; row ++) {
            for (int column = 0; column < matriz[row].length; column ++) {
                soma += matriz[row][column];
            }
        }
        return soma;
    }
    public static void somaLinha(int[][] matriz, String nomeMatriz) {
        int somaLinha;
        for (int row = 0; row < matriz.length; row ++) {
            somaLinha = 0;
            for (int column = 0; column < matriz[row].length; column ++) {
                somaLinha += matriz[row][column];
            }
            System.out.printf("Matriz: %s\nLinha: %d\nSoma por linha: %d\n", nomeMatriz, row + 1, somaLinha);
        }
    }
}