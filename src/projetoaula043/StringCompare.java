// @author RA21600867
package projetoaula043;
import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in), sc = new Scanner(System.in);
        String s1 = new String("hello"), s2 = "goodbye", s3 = "Happy Birthday", s4 = "happy birthday";
        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4);
        if (s1.equals("hello")) {
            System.out.println("s1 equals \"hello\"");
        }
        else {
            System.out.println("s1 does not equal \"hello\"");
        }
        if (s1 == "hello") {
            System.out.println("s1 is the same object as \"hello\"");
        }
        else {
            System.out.println("s1 is not the same object as \"hello\"");
        }
        if (s3.equalsIgnoreCase(s4)) {
            System.out.printf("%s equals %s with case ignored\n", s3, s4);
        }
        else {
            System.out.println("s3 does not equal s4");
        }
        System.out.printf("\ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("\ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("\ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("\ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("\ns4.compareTo(s3) is %d\n\n", s4.compareTo(s3));
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match");
        }
        else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        }
        else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
        System.out.print("Digite uma palavra: ");
        String word1 = leia.next();
        if (word1.equals(s2)) {
            System.out.println("Palavra é igual a s2");
        }
        else {
            System.out.println("Palavra não é igual a s2");
        }
        if (word1.compareTo(s2) == 0) {
            System.out.println("word1.compareTo(s2) is 0");
        }
        else {
            System.out.printf("word1.compareTo(s2) is %d\n", word1.compareTo(s2));
        }
        if (word1 == s2) {
            System.out.println("Palavra é o mesmo objeto que s2");
        }
        else {
            System.out.println("Palavra não é o mesmo objeto que s2");
        }
        System.out.print("Digite uma palavra: ");
        String word2 = leia.next();
        if (word1.equals(word2)) {
            System.out.println("Palavras iguais");
        }
        else {
            System.out.println("Palavras diferentes");
        }
        if (word1.compareTo(word2) == 0) {
            System.out.println("word1.compareTo(word2) is 0");
        }
        else {
            System.out.printf("word1.compareTo(word2) is %d\n", word1.compareTo(word2));
        }
        System.out.print("Digite uma palavra: ");
        String word3 = leia.next();
        if (word3.contains("a")) {
            System.out.println("Contém o caractere \'a\'");
        }
        else {
            System.out.println("Não contém o caractere \'a\'");
        }
        boolean found = false;
        for (int i = 0; i < word3.length(); i ++) {
            if (word3.charAt(i) == 'a') {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Contém o caractere \'a\'");
        }
        else {
            System.out.println("Não contém o caractere \'a\'");
        }
        found = false;
        int ct = 0;
        for (int i = 0; i < word3.length(); i ++) {
            if (word3.charAt(i) == 'a') {
                ct ++;
            }
        }
        if (ct > 0) {
            System.out.printf("Contém o caractere \'a\' %d vezes\n", ct);
        }
        else {
            System.out.println("Não contém o caractere \'a\'");
        }
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        if (frase.contains("de")) {
            System.out.println("Contém a palavra \"de\"");
        }
        else {
            System.out.println("Não contém a palavra \"de\"");
        }
        for (int i = 0; i < frase.length(); i ++) {
            if (frase.regionMatches(i, "de", 0, 2)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Contém a palavra \"de\"");
        }
        else {
            System.out.println("Não contém a palavra \"de\"");
        }
        ct = 0;
        for (int i = 0; i < frase.length() - 1; i ++) {
            if (frase.substring(i, i + 2).equals("de")) {
                ct ++;
            }
        }
        if (ct > 0) {
            System.out.printf("Contém a palavra \"de\" %d vezes\n", ct);
        }
        else {
            System.out.println("Não contém a palavra \"de\"");
        }
    }
}