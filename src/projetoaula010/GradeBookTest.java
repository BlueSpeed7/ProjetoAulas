// @author RA21600867
package projetoaula010;
public class GradeBookTest {
    public static void main(String[] args) {
        double maiorMedia;
        String melhorTurma;
        GradeBook diarioTurma1 = new GradeBook("Introdução à Linguagem Java");
        GradeBook diarioTurma2 = new GradeBook("Introdução à Linguagem C");
        GradeBook diarioTurma3 = new GradeBook("Introdução à Cálculo");
        diarioTurma1.displayMessage();
        diarioTurma1.determineClassAverage();
        maiorMedia = diarioTurma1.getMediaTurma();
        melhorTurma = diarioTurma1.getCourseName();
        diarioTurma2.displayMessage();
        diarioTurma2.determineClassAverage();
        if (diarioTurma2.getMediaTurma() > maiorMedia) {
            maiorMedia = diarioTurma2.getMediaTurma();
            melhorTurma = diarioTurma2.getCourseName();
        }
        diarioTurma3.displayMessage();
        diarioTurma3.determineClassAverage();
        if (diarioTurma3.getMediaTurma() > maiorMedia) {
            maiorMedia = diarioTurma3.getMediaTurma();
            melhorTurma = diarioTurma3.getCourseName();
        }
        if (diarioTurma1.getMediaTurma() == diarioTurma2.getMediaTurma() && diarioTurma2.getMediaTurma() == diarioTurma3.getMediaTurma()) {
            System.out.print("\nTurmas com a mesma média.\n\n");
        }
        else {
            System.out.printf("Melhor turma: %s\nMédia: %.2f\n\n", melhorTurma, maiorMedia);
        }
    }
}