// @author RA21600867
package projetoaula045;
import java.util.IllegalFormatConversionException;
public class OtherCharMethods {
    public static void main(String[] args) {
        Character c1 = new Character('A'), c2 = 'a';
        try {
            System.out.printf("c1 = %c\nc2 = %c\n", c1.charValue(), c2.toString());
            if (c1.equals(c2)) {
                System.out.println("c1 and c2 are equal");
            }
            else {
                System.out.println("c1 and c2 are not equal");
            }
        }
        catch (IllegalFormatConversionException exception) {
            exception.printStackTrace();
            System.gc();
            System.out.printf("\nc1 = %s\nc2 = %s\n", c1, c2);
            if (c1.equals(c2)) {
                System.out.println("c1 and c2 are equal");
            }
            else {
                System.out.println("c1 and c2 are not equal");
            }
        }
    }
}