// @author RA21600867
package projetoaula017;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        String nomeProfessor;
        int[] notas1 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87}, notas2 = new int[4];
        int nota;
        GradeBook diario1 = new GradeBook("Java", "Carlos", notas1);
        GradeBook diario2 = new GradeBook("Linguagem C", notas2);
        Scanner leia = new Scanner(System.in);
        diario1.displayMessage();
        System.out.printf("Quantidade de alunos: %d\n", diario1.ctAlunos());
        diario1.processGrades();
        System.out.printf("\nNúmero do aluno com a maior nota: %d\n", diario1.alunoMaior());
        System.out.printf("Quantidade de alunos aprovados: %d\n", diario1.ctAlunosAprovados());
        System.out.print("\nDigite o nome do professor do curso 2: ");
        nomeProfessor = leia.next();
        diario2.setNomeProfessor(nomeProfessor);
        for (int aluno = 0; aluno < notas2.length; aluno ++) {
            System.out.printf("Digite a nota do aluno %d: ", aluno + 1);
            nota = leia.nextInt();
            if (nota < 0 || nota > 100) {
                while (nota < 0 || nota > 100) {
                    System.err.println("Nota inválida.");
                    System.out.printf("Digite a nota do aluno %d: ", aluno + 1);
                    nota = leia.nextInt();
                }
            }
            else {
                notas2[aluno] = nota;
            }
        }
        System.out.println();
        diario2.displayMessage();
        System.out.printf("Quantidade de alunos: %d\n", diario2.ctAlunos());
        diario2.processGrades();
        System.out.printf("\nNúmero do aluno com a maior nota: %d\n", diario2.alunoMaior());
        System.out.printf("Quantidade de alunos aprovados: %d\n", diario2.ctAlunosAprovados());
        if (diario1.getAverage() > diario2.getAverage()) {
            System.out.printf("\nA turma com a maior média é %s.\n", diario1.getCourseName());
        }
        else {
            if (diario2.getAverage() > diario1.getAverage()) {
                System.out.printf("\nA turma com a maior média é %s.\n", diario2.getCourseName());
            }
            else {
                System.out.print("\nMédias iguais.\n");
            }
        }
        if (diario1.getMaximum() > diario2.getMaximum()) {
            System.out.printf("A turma com a maior nota é %s.\n", diario1.getCourseName());
        }
        else {
            if (diario2.getMaximum() > diario1.getMaximum()) {
                System.out.printf("A turma com a maior nota é %s.\n", diario2.getCourseName());
            }
            else {
                System.out.printf("Notas iguais.\n");
            }
        }
    }
}