// @author RA21600867
package projetoaula044;
public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Happy ", s2 = "Birthday", s3;
        System.out.printf("s1 = %s\ns2 = %s\n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s\n", s1.concat(s2));
        System.out.printf("s1 depois da concatenação = %s\n", s1);
        System.out.printf("s2 depois da concatenação = %s\n", s2);
        s3 = s1.concat(s2);
        System.out.printf("s3 depois da concatenação = %s\n", s3);
        s3 = s1 + s2;
        System.out.printf("s3 depois da concatenação com o operador +: %s\n", s3);
        s1 += s2;
        System.out.printf("s1 depois da concatenação com o operador +=: %s\n", s1);
    }
}