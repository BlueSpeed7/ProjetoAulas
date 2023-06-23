// @author RA21600867
package projetoaula009;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook diario1 = new GradeBook("Linguagem Java");
        GradeBook diario2 = new GradeBook("Estrutura de Dados");
        GradeBook diario3 = new GradeBook("Banco de Dados", "Professor");
        String s1;
        Scanner leia = new Scanner(System.in);
        System.out.printf("Diário 1, o nome do curso é: %s\n", diario1.getCourseName());
        System.out.printf("Diário 2, o nome do curso é: %s\n", diario2.getCourseName());
        System.out.printf("Diário 3, o nome do curso é: %s\nEste curso é ministrado por: %s\n", diario3.getCourseName(), diario3.getNomeInstrutor());
        System.out.printf("%s", "Digite o nome do curso do diário 1: ");
        s1 = leia.nextLine();
        diario1.setCourseName(s1);
        System.out.printf("%s", "Digite o nome do curso do diário 2: ");
        s1 = leia.nextLine();
        diario2.setCourseName(s1);
        System.out.printf("%s", "Digite o nome do instrutor do curso 1: ");
        s1 = leia.nextLine();
        diario1.setNomeInstrutor(s1);
        System.out.printf("%s", "Digite o nome do instrutor do curso 2: ");
        s1 = leia.nextLine();
        diario2.setNomeInstrutor(s1);
        System.out.printf("%s", "Digite o nome do instrutor do curso 3: ");
        s1 = leia.nextLine();
        diario3.setNomeInstrutor(s1);
        diario1.displayMessage();
        diario2.displayMessage();
        diario3.displayMessage();
    }
}