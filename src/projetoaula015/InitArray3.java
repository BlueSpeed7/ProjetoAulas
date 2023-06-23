// @author RA21600867
package projetoaula015;
import java.util.Random;
public class InitArray3 {
    public static void main(String[] args) {
        Random objetoRandom = new Random();
        final int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i ++) {
            array[i] = 2 + 2 * i;
        }
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            if (i < 9) {
                System.out.printf("%5d%8d\n", i, array[i]);
            }
            else {
                System.out.printf("%5d%8d\n\n", i, array[i]);
            }
        }
        array = new int[15];
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            array[i] = 1 + 2 * i;
        }
        for (int i = 0; i < array.length; i ++) {
            if (i < 14) {
                System.out.printf("%5d%8d\n", i, array[i]);
            }
            else {
                System.out.printf("%5d%8d\n\n", i, array[i]);
            }
        }
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            array[i] = 3 * i;
        }
        for (int i = 0; i < array.length; i ++) {
            if (i < 14) {
                System.out.printf("%5d%8d\n", i, array[i]);
            }
            else {
                System.out.printf("%5d%8d\n\n", i, array[i]);
            }
        }
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            array[i] = 3 + 3 * i;
        }
        for (int i = 0; i < array.length; i ++) {
            if (i < 14) {
                System.out.printf("%5d%8d\n", i, array[i]);
            }
            else {
                System.out.printf("%5d%8d\n\n", i, array[i]);
            }
        }
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            array[i] = 3 + 6 * i;
        }
        for (int i = 0; i < array.length; i ++) {
            if (i < 14) {
                System.out.printf("%5d%8d\n", i, array[i]);
            }
            else {
                System.out.printf("%5d%8d\n\n", i, array[i]);
            }
        }
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i < array.length; i ++) {
            array[i] = -3 + objetoRandom.nextInt(7);
        }
        for (int i = 0; i < array.length; i ++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}