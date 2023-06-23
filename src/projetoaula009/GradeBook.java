// @author RA21600867
package projetoaula009;
public class GradeBook {
    private String courseName, nomeInstrutor;
    public GradeBook(String s1) {
        courseName = s1;
    }
    public GradeBook(String s1, String s2) {
        courseName = s1;
        nomeInstrutor = s2;
    }
    public void setCourseName(String s1) {
        courseName = s1;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setNomeInstrutor(String s1) {
        nomeInstrutor = s1;
    }
    public String getNomeInstrutor() {
        return nomeInstrutor;
    }
    public void displayMessage() {
        System.out.printf("O nome do curso é: %s\nEste curso é ministrado por: %s\n", getCourseName(), getNomeInstrutor());
    }
}