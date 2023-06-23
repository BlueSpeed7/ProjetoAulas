// @author RA21600867
package projetoaula043;
import java.util.Scanner;
import java.util.IllegalFormatConversionException;
public class StringStartEnd {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra;
        String[] vStrings = {"started", "starting", "ended", "ending"}, vowel = {"a", "e", "i", "o", "u"};
        boolean startVowel = false;
        try {
            for (String string: vStrings) {
                if (string.startsWith("st")) {
                    System.out.printf("\"%s\" starts with \"st\"\n", string);
                }
            }
            System.out.println();
            for (String string: vStrings) {
                if (string.startsWith("art", 2)) {
                    System.out.printf("\"%s\" starts with \"art\" at position 2\n", string);
                }
            }
            System.out.println();
            for (int i = 0; i < vStrings.length; i ++) {
                if (vStrings[i].endsWith("ed")) {
                    System.out.printf("\"%s\" ends with \"ed\"\n", vStrings[i]);
                }
                else {
                    System.out.printf("\"%s\" does not end with \"ed\"\n", vStrings[i]);
                }
            }
            System.out.print("Digite uma palavra: ");
            palavra = leia.next();
            for (String s: vowel) {
                if (palavra.startsWith(s)) {
                    startVowel = true;
                    break;
                }
            }
            if (startVowel) {
                System.out.printf("\"%c\" começa com vogal\n", palavra);
            }
            else {
                System.out.printf("\"%c\" não começa com vogal\n", palavra);
            }
        }
        catch (IllegalFormatConversionException exception) {
            exception.printStackTrace();
            startVowel = false;
            System.out.print("Digite uma palavra: ");
            palavra = leia.next();
            for (String s: vowel) {
                if (palavra.startsWith(s)) {
                    startVowel = true;
                    break;
                }
            }
            if (startVowel) {
                System.out.printf("\"%s\" começa com vogal\n", palavra);
            }
            else {
                System.out.printf("\"%s\" não começa com vogal\n", palavra);
            }
        }
    }
}