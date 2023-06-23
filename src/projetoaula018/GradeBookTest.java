// @author RA21600867
package projetoaula018;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}}, notas2 = new int[5][2];
        GradeBook turmaJava = new GradeBook("Introdução à Programação Java", gradesArray);
        GradeBook turmaC = new GradeBook("Introdução à Linguagem C", notas2);
        Scanner leia = new Scanner(System.in);
        turmaJava.setNomeProfessor("Paulo");
        turmaJava.displayMessage();
        turmaJava.processGrades();
        System.out.println();
        for (int aluno = 0; aluno < notas2.length; aluno ++) {
            for (int nota = 0; nota < notas2[aluno].length; nota ++) {
                System.out.printf("Digite a nota da prova %d do aluno %d: ", nota + 1, aluno + 1);
                notas2[aluno][nota] = leia.nextInt();
                if (notas2[aluno][nota] < 0 || notas2[aluno][nota] > 100) {
                    while (notas2[aluno][nota] < 0 || notas2[aluno][nota] > 100) {
                        System.out.println("Nota inválida.");
                        System.out.printf("Digite a nota da prova %d do aluno %d: ", nota + 1, aluno + 1);
                        notas2[aluno][nota] = leia.nextInt();
                    }
                }
            }
        }
        turmaC.setNomeProfessor("Carlos");
        turmaC.displayMessage();
        turmaC.processGrades();
        System.out.printf("Menor nota na turma %s é %d\n", turmaJava.getCourseName(), turmaJava.getMinimum());
        System.out.printf("Menor nota na turma %s é %d\n", turmaC.getCourseName(), turmaC.getMinimum());
        if (turmaJava.getMaximum() > turmaC.getMaximum()) {
            System.out.printf("A turma com a maior nota é %s.\nProfessor: %s\n", turmaJava.getCourseName(), turmaJava.getNomeProfessor());
        }
        else {
            if (turmaC.getMaximum() > turmaJava.getMaximum()) {
                System.out.printf("A turma com a maior nota é %s.\nProfessor: %s\n", turmaC.getCourseName(), turmaC.getNomeProfessor());
            }
            else {
                System.out.printf("Notas iguais.\n");
            }
        }
        System.out.println();
        turmaJava.mostraAtributos();
        System.out.println();
        turmaC.mostraAtributos();
        System.out.println();
        System.out.printf("Média da turma %s: %.2f\n", turmaJava.getCourseName(), turmaJava.mediaTurma());
        System.out.printf("Média da turma %s: %.2f\n", turmaC.getCourseName(), turmaC.mediaTurma());
        System.out.printf("Aluno da turma %s com mais pontos: %d\n", turmaJava.getCourseName(), turmaJava.alunoMaisPontos());
        System.out.printf("Aluno da turma %s com mais pontos: %d\n", turmaC.getCourseName(), turmaC.alunoMaisPontos());
    }
}