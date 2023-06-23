// @author RA21600867
package projetoaula015;
public class InitArray2 {
    public static void main(String[] args) {
        int[] numero = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37, 44, 17};
        InitArray2.array(numero);
        numero[5] += 10;
        InitArray2.array(numero);
        numero[2] = numero[0] + numero[1];
        InitArray2.array(numero);
    }
    public static void array(int array[]) {
        System.out.printf("\n%s%8s\n", "Index", "Value");
        for (int ct = 0; ct < array.length; ct ++) {
            System.out.printf("%5d%8d\n", ct, array[ct]);
        }
    }
}