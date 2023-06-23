// @author RA21600867
package projetoaula018;
public class GradeBook {
    private String nomeCurso, nomeProfessor;
    private String[] nomes;
    private int[][] mNotas;
    private int ctAlunos;
    public GradeBook(String name, int[][] gradesArray) {
        nomeCurso = name;
        mNotas = gradesArray;
        ctAlunos = mNotas.length;
        nomes = new String[ctAlunos];
    }
    public void setCourseName(String name) {
        nomeCurso = name;
    }
    public String getCourseName() {
        return nomeCurso;
    }
    public void setNomeProfessor(String name) {
        nomeProfessor = name;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\nTeacher: %s\n", getCourseName(), getNomeProfessor());
    }
    public void processGrades() {
        outputGrades();
        System.out.printf("\n%s %d\n%s %d\n\n", "Lowest grade in the grade book is", getMinimum(), "Highest grade in the grade book is", getMaximum());
        outputBarChart();
    }
    public void mostraAtributos() {
        System.out.printf("Turma: %s\n", getCourseName());
        System.out.printf("Professor: %s\n", getNomeProfessor());
        outputGrades();
    }
    public int getMinimum() {
        int lowGrade = mNotas[0][0];
        for (int[] studentGrades: mNotas) {
            for (int grade: studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
    public int getMaximum() {
        int highGrade = mNotas[0][0];
        for (int studentGrades = 0; studentGrades < mNotas.length; studentGrades ++) {
            for (int grade = 0; grade < mNotas[studentGrades].length; grade ++) {
                if (mNotas[studentGrades][grade] > highGrade) {
                    highGrade = mNotas[studentGrades][grade];
                }
            }
        }
        return highGrade;
    }
    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade: setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }
    public double mediaTurma() {
        int soma = 0;
        for (int[] aluno: mNotas) {
            for (int nota: aluno) {
                soma += nota;
            }
        }
        return (double) soma / (mNotas.length * mNotas[0].length);
    }
    public int alunoMaisPontos() {
        int numeroAluno = 0, maiorSoma = mNotas[0][0];
        for (int aluno = 0; aluno < mNotas.length; aluno ++) {
            int soma = 0;
            for (int nota = 0; nota < mNotas[aluno].length; nota ++) {
                soma += mNotas[aluno][nota];
            }
            if (soma > maiorSoma) {
                maiorSoma = soma;
                numeroAluno = aluno;
            }
        }
        return numeroAluno + 1;
    }
    public void outputBarChart() {
        System.out.println("Distribuição de todas as notas da turma:");
        int[] frequency = new int[11];
        for (int[] studentGrades: mNotas) {
            for (int grade: studentGrades) {
                ++ frequency[grade / 10];
            }
        }
        for (int count = 0; count <frequency.length; count ++) {
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int stars = 0; stars < frequency[count]; stars ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void outputGrades() {
        System.out.println("As notas são:\n");
        System.out.print("            ");
        for (int test = 0; test < mNotas[0].length; test ++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");
        for (int student = 0; student < mNotas.length; student ++) {
            System.out.printf("Student %2d", student + 1);
            for (int test: mNotas[student]) {
                System.out.printf("%8d", test);
            }
            double average = getAverage(mNotas[student]);
            System.out.printf("%9.2f\n", average);
        }
    }
}