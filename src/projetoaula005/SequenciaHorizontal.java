// @author RA21600867
package projetoaula005;
public class SequenciaHorizontal {
    public static void main(String[] args) {
        int i;
        System.out.println("Números naturais - horizontal");
        for (i = 0; i <= 10; i ++) {
            if (i < 10 && i != 6) {
                System.out.print(i + ", ");
            }
            else {
                if (i == 6) {
                    System.out.print("\n" + i + ", ");
                }
                else
                    System.out.println(i + ".");
            }
        }
    }
}