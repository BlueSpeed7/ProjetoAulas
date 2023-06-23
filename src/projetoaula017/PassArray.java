// @author RA21600867
package projetoaula017;
public class PassArray {
    public static void main(String[] args) {
        int[] vInteiros = {1, 2, 3, 4, 5};
        System.out.println("Valores originais do vetor:");
        for (int value: vInteiros) {
            System.out.printf("%d\n", value);
        }
        PassArray.mostraVetor(vInteiros);
        PassArray.modifyArray(vInteiros);
        System.out.println("\nValores modificados do vetor:");
        for (int value: vInteiros) {
            System.out.printf("%d\n", value);
        }
        PassArray.mostraVetor(vInteiros);
        System.out.printf("\nValor do elemento antes de chamar o método modifyElement: %d\n", vInteiros[3]);
        PassArray.modifyElement(vInteiros[3]);
        System.out.printf("\nValor do elemento depois de chamar o método modifyElement: %d\n", vInteiros[3]);
        System.out.printf("\nSoma dos valores do vetor: %d\n", somaVetor(vInteiros));
        System.out.printf("\nMenor valor do vetor: %d\n", minVetor(vInteiros));
        System.out.printf("\nMaior valor do vetor: %d\n", maxVetor(vInteiros));
        System.out.printf("\nMédia dos valores do vetor: %.2f\n", mediaVetor(vInteiros));
    }
    public static void modifyArray(int[] array) {
        for (int ct = 0; ct < array.length; ct ++) {
            array[ct] *= 2;
        }
    }
    private static void modifyElement(int element) {
        element *= 2;
        System.out.printf("\nValor do elemento dentro do método modifyElement: %d\n", element);
    }
    public static void mostraVetor(int[] array) {
        System.out.printf("\nValores do vetor:\n");
        for (int ct = 0; ct < array.length; ct ++) {
            System.out.printf("%d\n", array[ct]);
        }
    }
    public static int somaVetor(int[] array) {
        int soma = 0;
        for (int value: array) {
            soma += value;
        }
        return soma;
    }
    public static int minVetor(int[] array) {
        int min = array[0];
        for (int value: array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public static int maxVetor(int[] array) {
        int max = array[0];
        for (int value: array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static double mediaVetor(int[] array) {
        int soma = 0;
        for (int value: array) {
            soma += value;
        }
        return (double) soma / array.length;
    }
}