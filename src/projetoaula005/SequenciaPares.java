// @author RA21600867
package projetoaula005;
public class SequenciaPares {
    public static void main(String[] args) {
        int i;
        System.out.println("Números pares");
        for (i = 0; i <= 12; i ++) {
            if (i % 2 == 0 && i != 12)
                System.out.print(i + ", ");
            else
                if (i == 12)
                    System.out.println(i + ".");
        }
    }
}