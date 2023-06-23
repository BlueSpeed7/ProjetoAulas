// @author RA21600867
package projetoaula043;
import java.util.Scanner;
public class StringIndexMethods {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in), sc = new Scanner(System.in);
        String letters = "abcdefghijklmabcdefghijklma", palavra1, palavra2, palavra3, frase;
        int ct = 0;
        System.out.printf("\'c\' is located at index %d\n", letters.indexOf('c'));
        System.out.printf("\'a\' is located at index %d\n", letters.indexOf('a', 1));
        System.out.printf("\'$\' is located at index %d\n", letters.indexOf('$'));
        System.out.printf("Last \'c\' is located at index %d\n", letters.lastIndexOf('c'));
        System.out.printf("Last \'a\' is located at index %d\n", letters.lastIndexOf('a', 25));
        System.out.printf("Last \'$\' is located at index %d\n", letters.lastIndexOf('$'));
        System.out.printf("\"def\" is located at index %d\n", letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d\n", letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d\n", letters.indexOf("hello"));
        System.out.printf("Last \"def\" is located at index %d\n", letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d\n", letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d\n", letters.lastIndexOf("hello"));
        System.out.print("Digite uma palavra: ");
        palavra1 = leia.next();
        if (palavra1.indexOf('a') != -1) {
            System.out.printf("\"%s\" contém o caractere \'a\' na posição %d\n", palavra1, palavra1.indexOf('a'));
        }
        else {
            System.out.printf("\"%s\" não contém o caractere \'a\'\n", palavra1);
        }
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        if (frase.indexOf("de") >= 0) {
            System.out.printf("\"%s\" contém a palavra \"de\" na posição %d\n", frase, frase.indexOf("de"));
        }
        else {
            System.out.printf("\"%s\" não contém a palavra \"de\"\n", frase);
        }
        System.out.print("Digite uma palavra: ");
        palavra2 = leia.next();
        if (palavra2.indexOf('a') == -1) {
            System.out.printf("\"%s\" não contém o caractere \'a\'\n", palavra2);
        }
        else {
            if (palavra2.indexOf('a') == palavra2.lastIndexOf('a')) {
                System.out.printf("\"%s\" contém apenas uma letra \'a\' na posição %d\n", palavra2, palavra2.indexOf('a'));
            }
            else {
                System.out.printf("Posição da primeira ocorrência: %d\nPosição da última ocorrência: %d\n", palavra2.indexOf('a'), palavra2.lastIndexOf('a'));
            }
        }
        System.out.print("Digite uma palavra: ");
        palavra3 = leia.next();
        for (int i = 0; i < palavra3.length(); i ++) {
            if (palavra3.charAt(i) == 'a') {
                System.out.printf("Posição: %d\n", palavra3.indexOf('a', i));
                ct ++;
            }
        }
        if (ct > 0) {
            System.out.printf("\'a\' aparece %d vezes\n", ct);
        }
        else {
            System.out.printf("\"%s\" não contém o caractere \'a\'\n", palavra3);
        }
    }
}