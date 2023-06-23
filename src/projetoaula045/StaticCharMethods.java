// @author RA21600867
package projetoaula045;
import java.util.Scanner;
public class StaticCharMethods {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in), sc = new Scanner(System.in);
        char c;
        do {
            System.out.print("Digite um caractere e pressione <enter>: ");
            c = leia.next().charAt(0);
            if (c == 's' || c == 'S') {
                break;
            }
            System.out.printf("É definido no Unicode: %b\n", Character.isDefined(c));
            System.out.printf("É dígito: %b\n", Character.isDigit(c));
            System.out.printf("É 1º caractere de identificador Java: %b\n", Character.isJavaIdentifierStart(c));
            System.out.printf("É parte de identificador Java: %b\n", Character.isJavaIdentifierPart(c));
            System.out.printf("É letra: %b\n", Character.isLetter(c));
            System.out.printf("É letra ou dígito: %b\n", Character.isLetterOrDigit(c));
            System.out.printf("É letra minúscula: %b\n", Character.isLowerCase(c));
            System.out.printf("É letra maiúscula: %b\n", Character.isUpperCase(c));
            System.out.printf("Converta para letra maiúscula: %c\n", Character.toUpperCase(c));
            System.out.printf("Converta para letra minúscula: %c\n", Character.toLowerCase(c));
        }
        while (true);
        System.out.print("Digite uma palavra: ");
        String palavra = leia.next();
        for (int i = 0; i < palavra.length(); i ++) {
            c = palavra.charAt(i);
            if (i == 1) {
                c = Character.toUpperCase(c);
            }
            else {
                if (i == 2) {
                    c = Character.toLowerCase(c);
                }
            }
            System.out.print(c);
        }
        System.out.println();
        boolean valid = true;
        System.out.print("Digite uma palavra: ");
        palavra = leia.next();
        c = palavra.charAt(0);
        if (Character.isJavaIdentifierStart(c)) {
            for (int i = 1; i < palavra.length(); i ++) {
                c = palavra.charAt(i);
                if (!Character.isJavaIdentifierPart(c)) {
                    valid = false;
                    break;
                }
            }
        }
        else {
            valid = false;
        }
        if (valid) {
            System.out.println("Identificador Java válido.");
        }
        else {
            System.out.println("Identificador Java inválido.");
        }
        System.out.print("Digite um nome completo: ");
        String nome = sc.nextLine();
        int ctWord = 0, ctChar = 0;
        valid = true;
        if (nome.length() != 0 && nome.charAt(0) != ' ') {
            ctWord = 1;
            for (int i = 0; i < nome.length(); i ++) {
                ctChar ++;
                c = nome.charAt(i);
                if (c == ' ') {
                    ctWord ++;
                }
            }
        }
        if (nome.length() != 0 && nome.charAt(0) != ' ') {
            for (int i = 0; i < nome.length(); i ++) {
                c = nome.charAt(i);
                if (Character.isLetter(c) || c == ' ') {
                    valid = true;
                }
                else {
                    valid = false;
                    break;
                }
            }
        }
        char anterior;
        if (nome.length() != 0 && nome.charAt(0) != ' ') {
            c = nome.charAt(0);
            if (!Character.isUpperCase(c)) {
                valid = false;
            }
            else {
                for (int i = 1; i < nome.length(); i ++) {
                    c = nome.charAt(i);
                    anterior = nome.charAt(i - 1);
                    if (anterior != ' ') {
                        if (Character.isLowerCase(c) || c == ' ') {
                        }
                        else {
                            valid = false;
                            break;
                        }
                    }
                    else {
                        if (Character.isUpperCase(c)) {
                        }
                        else {
                            if (nome.indexOf("da") == i || nome.indexOf("das") == i || nome.indexOf("de") == i || nome.indexOf("di") == i || nome.indexOf("do") == i || nome.indexOf("dos") == i) {
                            }
                            else {
                                valid = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        else {
            valid = false;
        }
        System.out.printf("Quantidade de palavras: %d\nQuantidade de caracteres: %d\n", ctWord, ctChar);
        if (valid) {
            System.out.println("Nome válido.");
        }
        else {
            System.out.println("Nome inválido.");
        }
    }
}