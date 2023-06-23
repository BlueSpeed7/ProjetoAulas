// @author RA21600867
package projetoaula015;
public class InitArray {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        InitArray.array(vetor1);
        vetor1[5] = 23;
        InitArray.array(vetor1);
        vetor1[7] = 14;
        InitArray.array(vetor1);
        InitArray.index(vetor1);
    }
    public static void array(int array[]) {
        System.out.printf("\n%s%8s\n", "Index", "Value");
        for (int ct = 0; ct <= 9; ct ++) {
            System.out.printf("%5d%8d\n", ct, array[ct]);
        }
    }
    public static void index(int array[]) {
        System.out.printf("\n%s%8s\n", "Index", "Value");
        System.out.printf("%5d%8d\n", 5, array[5]);
    }
}