// @author RA21600867
package projetoaula008;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook meuDiario = new GradeBook();
        String s1, vRetorno;
        int ct;
        Scanner leia = new Scanner(System.in);
        System.out.printf("%s", "Digite o nome do curso: ");
        s1 = leia.nextLine();
        meuDiario.setCourseName(s1);
        vRetorno = s1;
        System.out.printf("%s", "Digite o número de alunos: ");
        ct = leia.nextInt();
        if (ct <= 0) {
            while (ct <= 0) {
                System.err.println("Número de alunos inválido.");
                System.out.print("Digite o número de alunos: ");
                ct = leia.nextInt();
            }
        }
        leia.nextLine();
        meuDiario.setCtAlunos(ct);
        meuDiario.displayData();
        System.out.printf("%s", "Digite o nome do curso: ");
        s1 = leia.nextLine();
        meuDiario.setCourseName(s1);
        System.out.printf("Valor inicial do nome do curso: %s\n", vRetorno);
        meuDiario.displayData();
    }
}