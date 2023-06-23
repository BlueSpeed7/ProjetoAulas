// @author RA21600867
package projetoaula044;
import java.util.Scanner;
public class StringBuilderConstructors {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder buffer1 = new StringBuilder(), buffer2 = new StringBuilder(10), buffer3 = new StringBuilder("hello"), buffer4 = new StringBuilder(25);
        System.out.printf("buffer1 = \"%s\"\n", buffer1.toString());
        System.out.printf("buffer2 = \"%s\"\n", buffer2.toString());
        System.out.printf("buffer3 = \"%s\"\n", buffer3.toString());
        System.out.printf("buffer4 = \"%s\"\n", buffer4.toString());
        System.out.printf("buffer1 capacity: %d\n", buffer1.capacity());
        System.out.printf("buffer2 capacity: %d\n", buffer2.capacity());
        System.out.printf("buffer3 capacity: %d\n", buffer3.capacity());
        System.out.printf("buffer4 capacity: %d\n", buffer4.capacity());
        System.out.print("Digite uma frase: ");
        StringBuilder buffer5 = new StringBuilder(leia.nextLine());
        System.out.printf("buffer5 = \"%s\"\n", buffer5.toString());
        System.out.printf("buffer5 capacity: %d\n", buffer5.capacity());
    }
}