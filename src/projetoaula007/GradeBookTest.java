// @author RA21600867
package projetoaula007;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook meuDiario = new GradeBook();
        String s1;
        Scanner leia = new Scanner(System.in);
        System.out.printf("%s", "Digite o nome do curso: ");
        s1 = leia.nextLine();
        meuDiario.displayMessage(s1);
        meuDiario.displayMessage("Aula Java");
    }
}