// @author RA21600867
package projetoaula044;
import java.util.Scanner;
public class StringMiscellaneous {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String s1 = "hello", s2 = "GOODBYE", s3 = "   spaces   ", s4, s5, s6, word1, word2;
        System.out.printf("No início:\ns1 = %s\ns2 = %s\ns3 = %s\n", s1, s2, s3);
        System.out.printf("Replace \'l\' with \'L\' in s1: %s\n", s1.replace('l', 'L'));
        System.out.printf("s1.toUpperCase() = %s\n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s\n", s2.toLowerCase());
        System.out.printf("s3 after trim = \"%s\"\n", s3.trim());
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");
        for (int i = 0; i < charArray.length; i ++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
        System.out.printf("No final:\ns1 = %s\ns2 = %s\ns3 = %s\n", s1, s2, s3);
        System.out.print("Digite uma palavra: ");
        s4 = leia.next();
        System.out.printf("Original: \"%s\"\nMinúscula: \"%s\"\n", s4, s4.toLowerCase());
        System.out.print("Digite uma palavra: ");
        word1 = leia.next();
        System.out.printf("Original: \"%s\"\nMaiúscula: \"%s\"\n", word1, word1.toUpperCase());
        System.out.print("Digite uma palavra: ");
        word2 = leia.next();
        System.out.printf("Original: \"%s\"\nNo final: \"%s\"\n", word2, word2.substring(0, 1).toUpperCase().concat(word2.substring(1).toLowerCase()));
        System.out.print("Digite uma palavra: ");
        s5 = leia.next();
        s6 = s5.toUpperCase();
        System.out.printf("s5 = %s\n", s5);
        System.out.printf("s6 = %s\n", s6);
        s6 = s2.replace("OO", "ABC");
        System.out.printf("s2 = %s\n", s2);
        System.out.printf("s6 = %s\n", s6);
        s6 = s2.replace("O", "XY");
        System.out.printf("s2 = %s\n", s2);
        System.out.printf("s6 = %s\n", s6);
    }
}