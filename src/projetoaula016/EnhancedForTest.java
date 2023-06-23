// @author RA21600867
package projetoaula016;
public class EnhancedForTest {
    public static void main(String[] args) {
        int[] vetorInteiro = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0, index = 0;
        for (int numero: vetorInteiro) {
            total += numero;
        }
        System.out.printf("Total dos valores do vetor: %d\n", total);
        System.out.println("\nConteúdo armazenado no vetor:\n");
        for (int numero = 0; numero < vetorInteiro.length; numero ++) {
            System.out.printf("%5d\n", vetorInteiro[numero]);
        }
        System.out.println("\nConteúdo armazenado no vetor:\n");
        for (int numero: vetorInteiro) {
            System.out.printf("%5d\n", numero);
        }
        System.out.println("\nConteúdo armazenado no vetor:\n");
        for (int numero = 0; numero < vetorInteiro.length; numero ++) {
            System.out.printf("%3d - %d\n", index, vetorInteiro[numero]);
            index ++;
        }
        index = 0;
        System.out.printf("\n%s%8s\n", "Index", "Value");
        for (int numero: vetorInteiro) {
            System.out.printf("%5d%8d\n", index, numero);
            index ++;
        }
        double media = (double) total / vetorInteiro.length;
        System.out.printf("\nMédia dos valores armazenados no vetor: %.1f\n", media);
    }
}