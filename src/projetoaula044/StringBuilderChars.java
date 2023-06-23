// @author RA21600867
package projetoaula044;
import java.util.Scanner;
public class StringBuilderChars {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder("hello there");
        System.out.printf("buffer = %s\n", buffer);
        System.out.printf("Posição 0: %s\nPosição 4: %s\n", buffer.charAt(0), buffer.charAt(4));
        char[] charArray = buffer.toString().toCharArray();
        System.out.print("The characters are: ");
        for (int i = 0; i < charArray.length; i ++) {
            System.out.print(charArray[i]);
        }
        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.printf("\nbuffer (setCharAt) = %s", buffer);
        buffer.reverse();
        System.out.printf("\nbuffer (reverse) = %s\n", buffer);
        System.out.print("Digite uma mensagem: ");
        StringBuilder mensagem = new StringBuilder(leia.nextLine());
        charArray = mensagem.toString().toCharArray();
        for (char atual: charArray) {
            System.out.println(atual);
        }
        System.out.println();
        for (int i = 0; i < mensagem.length(); i ++) {
            System.out.println(mensagem.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < mensagem.length(); i ++) {
            System.out.print(mensagem.charAt(i));
            if (mensagem.charAt(i) == ' ') {
                System.out.println();
            }
        }
        System.out.println("\n");
        for (int i = 0; i < mensagem.length(); i ++) {
            System.out.printf("Posição: %d - Caractere: %c\n", i, mensagem.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < mensagem.length(); i ++) {
            for (int space = 0; space < i; space ++) {
                System.out.print(" ");
            }
            System.out.printf("%c\n", mensagem.charAt(i));
        }
        System.out.println();
        int index = 0;
        do {
            try {
                System.out.print("Posição para troca: ");
                index = leia.nextInt();
                mensagem.setCharAt(index, 'z');
                System.out.println(mensagem);
            }
            catch (StringIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }
        }
        while (index < 0 || index >= mensagem.length());
    }
}