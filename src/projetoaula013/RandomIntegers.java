// @author RA21600867
package projetoaula013;
import java.util.Random;
public class RandomIntegers {
    public static void main(String[] args) {
        Random objetoR = new Random();
        int face, ct;
        for (ct = 1; ct <= 20; ct ++) {
            face = 1 + objetoR.nextInt(6);
            System.out.printf("%5d", face);
            if (ct % 4 == 0) {
                System.out.println();
            }
        }
        face = 10 + objetoR.nextInt(11);
        System.out.printf("\n%5d\n\n", face);
        for (ct = 1; ct <= 30; ct ++) {
            face = -2 + objetoR.nextInt(6);
            System.out.printf("%5d", face);
            if (ct % 10 == 0) {
                System.out.println();
            }
        }
        RandomIntegers.megaSena();
        RandomIntegers.caraOuCoroa();
    }
    public static void megaSena() {
        Random objetoR = new Random();
        int face, ct;
        System.out.println();
        for (ct = 1; ct <= 6; ct ++) {
            face = 1 + objetoR.nextInt(60);
            System.out.printf("%5d", face);
            if (ct % 6 == 0) {
                System.out.println();
            }
        }
    }
    public static void caraOuCoroa() {
        Random objetoR = new Random();
        int face;
        face = objetoR.nextInt(2);
        if (face == 0) {
            System.out.printf("\n%7s\n", "Cara");
        }
        else {
            System.out.printf("\n%8s\n", "Coroa");
        }
    }
}