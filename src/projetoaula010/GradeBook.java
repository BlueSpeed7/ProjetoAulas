// @author RA21600867
package projetoaula010;
import java.util.Scanner;
public class GradeBook {
    private final String courseName;
    private double media;
    Scanner leia = new Scanner(System.in);
    public GradeBook(String s1) {
        courseName = s1;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getMediaTurma() {
        return media;
    }
    public void displayMessage() {
        System.out.printf("Bem-vindo ao diário de %s!\n\n", getCourseName());
    }
    public void determineClassAverage() {
        int ct = 0, ctAlunos;
        double soma = 0, nota;
        System.out.print("Digite o número de alunos: ");
        ctAlunos = leia.nextInt();
        if (ctAlunos <= 0) {
            while (ctAlunos <= 0) {
                System.err.println("Número de alunos inválido.");
                System.out.print("Digite o número de alunos: ");
                ctAlunos = leia.nextInt();
            }
        }
        while (ct < ctAlunos) {
            System.out.print("Digite a nota: ");
            nota = leia.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                ct ++;
            }
            else {
                System.err.println("Nota inválida.");
            }
        }
        media = (double) soma / ctAlunos;
        System.out.printf("\nSoma das notas: %.3f\n", soma);
        System.out.printf("Média das notas: %.2f\n\n", getMediaTurma());
    }
}