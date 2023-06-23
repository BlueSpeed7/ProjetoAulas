// @author RA21600867
package projetoaula008;
public class GradeBook {
    private String courseName;
    private int ctAlunos;
    public void setCourseName(String s1) {
        courseName = s1;
    }
    public void setCtAlunos(int ct) {
        ctAlunos = ct;
    }
    public void displayData() {
        System.out.printf("Bem-vindo ao diário de %s!\nBom início de semestre!\n", courseName);
        if (ctAlunos > 0) {
            System.out.printf("Quantidade de alunos: %d\n", ctAlunos);
        }
        else {
            System.out.println("Turma sem alunos.");
        }
    }
}