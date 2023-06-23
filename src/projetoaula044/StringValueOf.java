// @author RA21600867
package projetoaula044;
import java.util.Scanner;
public class StringValueOf {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        Object objectRef = "hello";
        System.out.printf("char array = %s\n", String.valueOf(charArray));
        System.out.printf("part of char array = %s\n", String.valueOf(charArray, 3, 3));
        System.out.printf("boolean = %s\n", String.valueOf(booleanValue));
        System.out.printf("char = %s\n", String.valueOf(characterValue));
        System.out.printf("int = %s\n", String.valueOf(integerValue));
        System.out.printf("long = %s\n", String.valueOf(longValue));
        System.out.printf("float = %s\n", String.valueOf(floatValue));
        System.out.printf("double = %s\n", String.valueOf(doubleValue));
        System.out.printf("Object = %s\n", String.valueOf(objectRef));
        System.out.print("Digite uma palavra: ");
        palavra = leia.next();
        charArray = new char[palavra.length() - 1];
        palavra.getChars(1, palavra.length(), charArray, 0);
        System.out.printf("Original: \"%s\"\nNo final: \"%s\"\n", palavra, String.valueOf(palavra.charAt(0)).toUpperCase().concat(String.valueOf(charArray).toLowerCase()));
    }
}