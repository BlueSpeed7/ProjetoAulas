// @author RA21600867
package projetoaula016;
import java.util.Random;
public class RollDie {
    public static void main(String[] args) {
        Random objetoR = new Random();
        int[] frequency = new int[7], coinFrequency = new int[2];
        int minorFrequency = 6000, majorFrequency = 0, minorFace = 0, majorFace = 0, roll, face;
        RollDie.mostraVetor(frequency);
        for (roll = 1; roll <= 6000; roll ++) {
            ++ frequency[1 + objetoR.nextInt(6)];
        }
        System.out.printf("\n%s%13s\n", "Face", "Frequency");
        for (face = 1; face < frequency.length; face ++) {
            System.out.printf("%4d%13d\n", face, frequency[face]);
            if (frequency[face] < minorFrequency) {
                minorFrequency = frequency[face];
                minorFace = face;
            }
        }
        System.out.printf("\nMenor frequência: %d\n\n", minorFace);
        RollDie.mostraVetor(frequency);
        for (roll = 1; roll <= 1000; roll ++) {
            ++ coinFrequency[objetoR.nextInt(2)];
        }
        System.out.printf("\n%s%10s\n", "Face", "Frequency");
        for (face = 0; face < coinFrequency.length; face ++) {
            System.out.printf("%4d%10d\n", face, coinFrequency[face]);
            if (coinFrequency[face] > majorFrequency) {
                majorFrequency = coinFrequency[face];
                majorFace = face;
            }
        }
        if (majorFace == 0) {
            System.out.print("\nMaior frequência: Cara\n");
        }
        else {
            System.out.print("\nMaior frequência: Coroa\n");
        }
    }
    public static void mostraVetor(int frequency[]) {
        System.out.printf("%s%13s\n", "Face", "Frequency");
        for (int face = 1; face < frequency.length; face ++) {
            System.out.printf("%4d%13d\n", face, frequency[face]);
        }
    }
}