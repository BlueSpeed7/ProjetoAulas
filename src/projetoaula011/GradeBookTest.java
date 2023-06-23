// @author RA21600867
package projetoaula011;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        GradeBook diario1 = new GradeBook("Programação Java"), diario2 = new GradeBook("Programação C");
        diario1.displayMessage();
        diario1.inputGrades();
        diario1.displayGradeReport();
        System.out.printf("Nome do curso: %s\n", diario1.getNomeCurso());
        System.out.printf("Quantidade de alunos: %d\n\n", diario1.getCtGeral());
        diario2.displayMessage();
        diario2.inputGrades();
        diario2.displayGradeReport();
        if (diario1.getCtGeral() > diario2.getCtGeral()) {
            System.out.println("\nA turma 1 tem mais alunos.");
        }
        else {
            if (diario2.getCtGeral() > diario1.getCtGeral()) {
                System.out.println("\nA turma 2 tem mais alunos.");
            }
            else {
                System.out.println("\nTurmas iguais, mesma quantidade de alunos.");
            }
        }
        double media1 = diario1.calculaMedia();
        double media2 = diario2.calculaMedia();
        if (media1 == -1) {
            System.out.printf("Impossível calcular, não tem aluno.\n");
        }
        else {
            System.out.printf("Média da turma 1: %.2f\n", media1);
        }
        if (media2 == -1) {
            System.out.printf("Impossível calcular, não tem aluno.\n");
        }
        else {
            System.out.printf("Média da turma 2: %.2f\n", media2);
        }
        if (media1 > media2) {
            System.out.printf("A turma 1 tem a melhor média.\n");
        }
        else {
            if (media2 > media1) {
                System.out.printf("A turma 2 tem a melhor média.\n");
            }
            else {
                System.out.printf("As turmas tem a mesma média.\n");
            }
        }
        System.out.printf("Porcentagem da menção A: %.2f\n", diario1.calculaPorcentagemMencao('a'));
        System.out.printf("Porcentagem da menção B: %.2f\n", diario2.calculaPorcentagemMencao('B'));
        System.out.print("Digite uma menção: ");
        char mencao1 = leia.next().charAt(0);
        System.out.printf("Porcentagem da menção %c: %.2f\n", Character.toUpperCase(mencao1), diario1.calculaPorcentagemMencao(mencao1));
        System.out.print("Digite uma menção: ");
        char mencao2 = leia.next().charAt(0);
        System.out.printf("Porcentagem da menção %c: %.2f\n", Character.toUpperCase(mencao2), diario1.calculaPorcentagemMencao(mencao2));
    }
}