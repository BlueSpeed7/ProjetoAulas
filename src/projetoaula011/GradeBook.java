// @author RA21600867
package projetoaula011;
import java.util.Scanner;
public class GradeBook {
    private String nomeCurso;
    private int nota, total, ctGeral, ctMencaoA, ctMencaoB, ctMencaoC, ctMencaoD, ctMencaoE, ctMencaoF;
    Scanner leia = new Scanner(System.in);
    public GradeBook(String name) {
        nomeCurso = name;
    }
    public void setNomeCurso(String name) {
        nomeCurso = name;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public int getCtGeral() {
        return ctGeral;
    }
    public void displayMessage() {
        System.out.printf("Bem-vindo ao diário de %s!\n", getNomeCurso());
    }
    public void inputGrades() {
        System.out.println("Digite a nota dos alunos, valor inteiro entre 0-100 ou [-1] para finalizar:");
        nota = leia.nextInt();
        while (nota != -1) {
            total += nota;
            ++ ctGeral;
            incrementLetterGradeCounter(nota);
            nota = leia.nextInt();
        }
    }
    private void incrementLetterGradeCounter(int nota) {
        switch (nota / 10) {
            case 10:
                ++ ctMencaoA;
                break;
            case 9:
                ++ ctMencaoA;
                break;
            case 8:
                ++ ctMencaoB;
                break;
            case 7:
                ++ ctMencaoC;
                break;
            case 6:
                ++ ctMencaoD;
                break;
            case 5:
                ++ ctMencaoE;
                break;
            default:
                ++ ctMencaoF;
                break;
        }
    }
    public double calculaMedia() {
        double media;
        if (ctGeral != 0) {
            media = (double) total / ctGeral;
        }
        else {
            media = -1;
        }
        return media;
    }
    public String maiorFrequencia() {
        double maior = ctMencaoA;
        String mencaoMaior = "Menção A";
        if (ctMencaoB > maior) {
            maior = ctMencaoB;
            mencaoMaior = "Menção B";
        }
        if (ctMencaoC > maior) {
            maior = ctMencaoC;
            mencaoMaior = "Menção C";
        }
        if (ctMencaoD > maior) {
            maior = ctMencaoD;
            mencaoMaior = "Menção D";
        }
        if (ctMencaoE > maior) {
            maior = ctMencaoE;
            mencaoMaior = "Menção E";
        }
        if (ctMencaoF > maior) {
            maior = ctMencaoF;
            mencaoMaior = "Menção F";
        }
        return mencaoMaior;
    }
    public double calculaPorcentagemMencao(char mencao) {
        double porc = 0;
        if (mencao == 'a' || mencao == 'A') {
            porc = (double) ctMencaoA / ctGeral * 100;
        }
        else {
            if (mencao == 'b' || mencao == 'B') {
                porc = (double) ctMencaoB / ctGeral * 100;
            }
            else {
                if (mencao == 'c' || mencao == 'C') {
                    porc = (double) ctMencaoC / ctGeral * 100;
                }
                else {
                    if (mencao == 'd' || mencao == 'D') {
                        porc = (double) ctMencaoD / ctGeral * 100;
                    }
                    else {
                        if (mencao == 'e' || mencao == 'E') {
                            porc = (double) ctMencaoE / ctGeral * 100;
                        }
                        else {
                            if (mencao == 'f' || mencao == 'F') {
                                porc = (double) ctMencaoF / ctGeral * 100;
                            }
                        }
                    }
                }
            }
        }
        return porc;
    }
    public void displayGradeReport() {
        System.out.println("Relatório de menções:");
        if (ctGeral != 0) {
            double media = (double) total / ctGeral;
            System.out.printf("Total de %d notas é igual a %d\n", ctGeral, total);
            System.out.printf("Média da turma: %.2f\n", media);
            System.out.printf("%s\n%s %d\n%s %d\n%s %d\n%s %d\n%s %d\n%s %d\n", "Quantidade de alunos em cada menção:", "A: ", ctMencaoA, "B: ", ctMencaoB, "C: ", ctMencaoC, "D: ", ctMencaoD, "E: ", ctMencaoE, "F: ", ctMencaoF);
        }
        else {
            System.out.println("Nenhuma nota foi digitada.");
        }
    }
}