// @author RA21600867
package projetoaula022;
import java.util.EnumSet;
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("- All books:");
        for (Book book: Book.values()) {
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
        }
        System.out.println("\n- Display a range of enum constants:");
        for (Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
        }
        System.out.println("\n- All students:");
        for (Alunos alunos: Alunos.values()) {
            System.out.printf("%-10s%-45s%s\n", alunos, alunos.getNome(), alunos.getRa());
        }
        System.out.println("\n- Display an enum constant:");
        System.out.printf("%-10s\n", Alunos.NUMERO2.getNome());
        System.out.printf("%-10s\n", Alunos.valueOf("NUMERO3").getNome());
        System.out.printf("%-10s\n", Alunos.NUMERO1.getRa());
        System.out.printf("%-10s\n", Alunos.valueOf("NUMERO2").getRa());
        Alunos.valueOf("NUMERO2").setNome("Ana");
        System.out.printf("%-10s\n", Alunos.valueOf("NUMERO2").getNome());
        System.out.printf("%-10s\n", Alunos.NUMERO4.getRa());
    }
}