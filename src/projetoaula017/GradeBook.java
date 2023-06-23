// @author RA21600867
package projetoaula017;
public class GradeBook {
    private String nomeCurso, nomeProfessor;
    private int[] notas;
    public GradeBook(String name, int[] notasAlunos) {
        nomeCurso = name;
        notas = notasAlunos;
    }
    public GradeBook(String name, String s1, int[] notasAlunos) {
        nomeCurso = name;
        nomeProfessor = s1;
        notas = notasAlunos;
    }
    public void setCourseName(String name) {
        nomeCurso = name;
    }
    public String getCourseName() {
        return nomeCurso;
    }
    public void setNomeProfessor(String s1) {
        nomeProfessor = s1;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\nTeacher: %s\n", getCourseName(), getNomeProfessor());
    }
    public void processGrades() {
        outputGrades();
        System.out.printf("Class average is %.2f\n", getAverage());
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n", getMinimum(), getMaximum());
        outputBarChart();
    }
    public int getMinimum() {
        int lowGrade = notas[0];
        for (int grade: notas) {
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }
    public int getMaximum() {
        int highGrade = notas[0];
        for (int grade: notas) {
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }
    public int alunoMaior() {
        int alunoMaior = 0;
        int highGrade = notas[0];
        for (int i = 0; i < notas.length; i ++) {
            if (notas[i] > highGrade) {
                highGrade = notas[i];
                alunoMaior = i;
            }
        }
        return alunoMaior + 1;
    }
    public double getAverage() {
        int total = 0;
        for (int grade: notas) {
            total += grade;
        }
        return (double) total / notas.length;
    }
    public int ctAlunosAprovados() {
        int ctAlunosAprovados = 0;
        for (int grade: notas) {
            if (grade >= 50) {
                ctAlunosAprovados ++;
            }
        }
        return ctAlunosAprovados;
    }
    public void outputBarChart() {
        System.out.println("Grade distribution:");
        int[] frequency = new int[11];
        for (int grade: notas) {
            ++ frequency[grade / 10];
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
        System.out.print("\nThe grades are:\n");
        for (int student = 0; student < notas.length; student ++) {
            System.out.printf("Student %2d: %3d\n", student + 1, notas[student]);
        }
        System.out.println();
    }
    public int ctAlunos() {
        int ct = notas.length;
        return ct;
    }
}