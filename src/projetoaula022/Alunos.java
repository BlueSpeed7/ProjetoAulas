// @author RA21600867
package projetoaula022;
public enum Alunos {
    NUMERO1("Paulo", "33333"), NUMERO2("Maria", "77677"), NUMERO3("Carlos Alberto", "12345"), NUMERO4("Carla", "22233");
    private String nome, ra;
    Alunos(String aluno, String registro) {
        nome = aluno;
        ra = registro;
    }
    public String getNome() {
        return nome;
    }
    public String getRa() {
        return ra;
    }
    public void setNome(String aluno) {
        nome = aluno;
    }
}