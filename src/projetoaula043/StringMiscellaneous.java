// @author RA21600867
package projetoaula043;
import java.util.Scanner;
public class StringMiscellaneous {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String s1 = "hello there", frase;
        char[] charArray = new char[11];
        int ctPalavras = 1;
        System.out.printf("s1: %s", s1);
        System.out.printf("\nLength of s1: %d", s1.length());
        System.out.print("\nThe string reversed is: ");
        for (int count = s1.length() - 1; count >= 0; count --) {
            if (count > 0) {
                System.out.printf("%c", s1.charAt(count));
            }
            else {
                if (count == 0) {
                    System.out.printf("%c\n", s1.charAt(count));
                }
            }
        }
        System.out.println("Usando o enhanced for:");
        for (char character: s1.toCharArray()) {
            System.out.printf("%c\n", character);
        }
        s1.getChars(0, s1.length(), charArray, 0);
        System.out.print("The character array is: ");
        for (int i = 0; i < charArray.length; i ++) {
            System.out.print(charArray[i]);
        }
        System.out.println("\nCada palavra em uma linha:");
        for (int i = 0; i < s1.length(); i ++) {
            System.out.print(s1.charAt(i) == ' '? "\n": s1.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < s1.length(); i ++) {
            for (int space = 0; space < i; space ++) {
                System.out.print(" ");
            }
            System.out.printf("%c\n", s1.charAt(i));
        }
        System.out.print("Digite uma frase: ");
        frase = leia.nextLine();
        System.out.printf("Tamanho da frase: %d\n", frase.length());
        System.out.printf("Conteúdo da posição 2: %c\n", frase.charAt(2));
        for (int i = 0; i < frase.length(); i ++) {
            if (frase.charAt(i) == ' ') {
                ctPalavras ++;
            }
            System.out.print(frase.charAt(i));
        }
        System.out.printf("\nQuantidade de palavras: %d\n", ctPalavras);
    }
}