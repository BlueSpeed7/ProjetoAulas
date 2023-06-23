// @author RA21600867
package projetoaula045;
import java.util.Scanner;
public class StringBuilderAppend {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last buffer"), buffer = new StringBuilder();
        try {
            buffer.append(charArray, 0, 10);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.gc();
            System.out.printf("Length: %d\n", buffer.length());
            buffer.append(objectRef);
            buffer.append("\n");
            buffer.append(string);
            buffer.append("\n");
            buffer.append(charArray);
            buffer.append("\n");
            buffer.append(charArray, 0, 3);
            buffer.append("\n");
            buffer.append(booleanValue);
            buffer.append("\n");
            buffer.append(characterValue);
            buffer.append("\n");
            buffer.append(integerValue);
            buffer.append("\n");
            buffer.append(longValue);
            buffer.append("\n");
            buffer.append(floatValue);
            buffer.append("\n");
            buffer.append(doubleValue);
            buffer.append("\n");
            buffer.append(lastBuffer);
            System.out.printf("buffer contains:\n%s\nLength: %d\n", buffer, buffer.length());
            System.out.print("Digite uma palavra: ");
            StringBuilder palavra = new StringBuilder(leia.next());
            palavra.append("\nFim");
            System.out.printf("%s\n", palavra);
        }
    }
}