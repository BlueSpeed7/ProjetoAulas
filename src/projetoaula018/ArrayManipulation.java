// @author RA21600867
package projetoaula018;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayManipulation {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        String[] nomes = {"Ana", "Paulo", "Carlos"};
        Scanner leia = new Scanner(System.in);
        Arrays.sort(doubleArray);
        System.out.print("Mostra o conteúdo do vetor doubleArray: ");
        for (double value: doubleArray) {
            System.out.printf("%.1f ", value);
        }
        int[] filledIntArray = new int[10], vInteiro = {1, 2, 3, 4, 5, 6}, vInteiroCopia = new int[vInteiro.length], numeros = new int[15];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        System.arraycopy(vInteiro, 0, vInteiroCopia, 0, vInteiro.length);
        displayArray(vInteiro, "vInteiro");
        displayArray(vInteiroCopia, "vInteiroCopia");
        boolean b = Arrays.equals(vInteiro, vInteiroCopia);
        System.out.printf("\nvInteiro %s filledIntArray", (b? "==": "!="));
        int location = Arrays.binarySearch(vInteiro, 5);
        if (location >= 0) {
            System.out.printf("\nEncontrou o valor 5 na posição %d do vInteiro", location);
        }
        else {
            System.out.printf("\nValor não encontrado no vInteiro.");
        }
        location = Arrays.binarySearch(vInteiro, 8763);
        if (location >= 0) {
            System.out.printf("\nEncontrou o valor 8763 na posição %d do vInteiro", location);
        }
        else {
            System.out.printf("\nValor não encontrado no vInteiro.");
        }
        displayArray(numeros, "Vetor números - valores na criação");
        Arrays.fill(numeros, 11);
        displayArray(numeros, "Vetor números - com o valor 11");
        numeros[2] = 15;
        numeros[5] = 7;
        displayArray(numeros, "Vetor números - com alterações");
        Arrays.fill(numeros, 10, 13, 8);
        displayArray(numeros, "Vetor número - com alterações 2");
        Arrays.sort(numeros);
        displayArray(numeros, "Vetor números - classificado");
        System.out.print("\nDigite um valor a ser pesquisado no vetor números: ");
        int pesquisa = leia.nextInt();
        location = Arrays.binarySearch(numeros, pesquisa);
        if (location >= 0) {
            System.out.printf("Encontrou o valor %d na posição %d do vetor números.\n", pesquisa, location);
        }
        else {
            System.out.printf("Valor %d não encontrado no vetor números.\n", pesquisa);
        }
        System.out.printf("Valor boolean de b: %b\n", b);
        boolean teste = Arrays.equals(vInteiro, numeros);
        System.out.printf("vInteiro %s números\n", (teste? "==": "!="));
        Arrays.sort(nomes);
        System.out.print("Digite um nome a ser pesquisado no vetor nomes: ");
        String pesquisa2 = leia.next();
        location = Arrays.binarySearch(nomes, pesquisa2);
        if (location >= 0) {
            System.out.printf("Encontrou o nome %s na posição %d do vetor nomes.\n", pesquisa2, location);
        }
        else {
            System.out.printf("Nome %s não encontrado no vetor nomes.\n", pesquisa2);
        }
    }
    public static void displayArray(int[] array, String description) {
        System.out.printf("\n%s: ", description);
        for (int i = 0; i < array.length; i ++) {
            System.out.printf("%d ", array[i]);
        }
    }
}