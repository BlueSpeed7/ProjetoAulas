// @author RA21600867
package projetoaula003;
import java.util.Scanner;
public class MediaTurma {
    public static void main(String[] args) {
        int aluno, ct = 0, ctAprov = 0, ctReprov = 0;
        float nota, soma = 0, media, pcAprov, pcReprov, diferenca;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o número do aluno: ");
        aluno = leia.nextInt();
        System.out.print("Digite \"-1\" para sair da repetição.\n");
        System.out.print("\nNota do aluno " + aluno + ": ");
        nota = leia.nextFloat();
        while (nota != -1) {
            ct ++;
            soma += nota;
            if (nota >= 5) {
                ctAprov ++;
            }
            else {
                ctReprov ++;
            }
            System.out.print("Digite o número do aluno: ");
            aluno = leia.nextInt();
            System.out.print("Nota do aluno " + aluno + ": ");
            nota = leia.nextFloat();
        }
        if (ct != 0) {
            media = (float) soma / ct;
            pcAprov = (float) ctAprov / ct * 100;
            pcReprov = (float) ctReprov / ct * 100;
            diferenca = pcAprov - pcReprov;
            System.out.println("\n\nQuantidade de alunos: " + ct);
            System.out.println("Média da turma: " + media);
            if (media >= 5) {
                System.out.println("Turma boa.");
            }
            else {
                if (diferenca > 0) {
                System.out.println("Turma regular.");
                }
                else {
                    System.out.println("Turma ruim.");
                }
            }
            System.out.println("Quantidade alunos aprovados: " + ctAprov);
            System.out.println("Quantidade de alunos reprovados: " + ctReprov);
            System.out.println("Porcentagem de alunos aprovados: " + pcAprov);
            System.out.println("Porcentagem de alunos reprovados: " + pcReprov);
            System.out.println("Diferença percentual entre os alunos aprovados e os alunos reprovados: " + diferenca);
        }
        else {
            System.out.println("Nenhuma nota foi fornecida.");
        }
    }
}