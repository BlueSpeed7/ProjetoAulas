// @author RA21600867
package projetoaula016;
import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] qtAlunos = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1}, notas2 = new int[15], quantidade = new int[11];
        double[] notas = new double[15];
        System.out.println("Distribuição das notas:\n");
        qtAlunos[0] = 3;
        qtAlunos[2] = 7;
        qtAlunos[4] = 5;
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            System.out.printf("%2d:", nota);
            for (int stars = 0; stars < qtAlunos[nota]; stars ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nConteúdo do vetor na horizontal:\n");
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            if (nota < 10) {
                System.out.printf("%5d", qtAlunos[nota]);
            }
            else {
                System.out.printf("%5d\n", qtAlunos[nota]);
            }
        }
        System.out.println("\nConteúdo do vetor na vertical:\n");
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            System.out.printf("%3d - %d\n", nota, qtAlunos[nota]);
        }
        System.out.println();
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            System.out.printf("Quantidade de alunos que tiveram nota %d: ", nota);
            qtAlunos[nota] = leia.nextInt();
            if (qtAlunos[nota] < 0) {
                while (qtAlunos[nota] < 0) {
                    System.err.println("Quantidade negativa.");
                    System.out.printf("Quantidade de alunos que tiveram nota %d: ", nota);
                    qtAlunos[nota] = leia.nextInt();
                }
            }
        }
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            System.out.printf("%2d:", nota);
            for (int stars = 0; stars < qtAlunos[nota]; stars ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nConteúdo do vetor na horizontal:\n");
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            if (nota < 10) {
                System.out.printf("%5d", qtAlunos[nota]);
            }
            else {
                System.out.printf("%5d\n", qtAlunos[nota]);
            }
        }
        System.out.println("\nConteúdo do vetor na vertical:\n");
        for (int nota = 0; nota < qtAlunos.length; nota ++) {
            System.out.printf("%3d - %d\n", nota, qtAlunos[nota]);
        }
        System.out.println();
        for (int nota = 0; nota < notas.length; nota ++) {
            System.out.printf("Nota do aluno número %d: ", nota + 1);
            notas[nota] = leia.nextDouble();
            if (notas[nota] < 0 || notas[nota] > 10) {
                while (notas[nota] < 0 || notas[nota] > 10) {
                    System.err.println("Nota inválida.");
                    System.out.printf("Nota do aluno número %d: ", nota + 1);
                    notas[nota] = leia.nextDouble();
                }
            }
        }
        System.out.println("\nConteúdo do vetor na horizontal:\n");
        for (int nota = 0; nota < notas.length; nota ++) {
            if (nota < 14) {
                System.out.printf("%5.1f", notas[nota]);
            }
            else {
                System.out.printf("%5.1f\n", notas[nota]);
            }
        }
        System.out.println("\nConteúdo do vetor na vertical:\n");
        for (int nota = 0; nota < notas.length; nota ++) {
            System.out.printf("%3d - %.1f\n", nota, notas[nota]);
        }
        System.out.println();
        for (int nota = 0; nota < notas2.length; nota ++) {
            System.out.printf("Nota do aluno número %d: ", nota + 1);
            notas2[nota] = leia.nextInt();
            if (notas2[nota] < 0 || notas2[nota] > 10) {
                while (notas2[nota] < 0 || notas2[nota] > 10) {
                    System.err.println("Nota inválida.");
                    System.out.printf("Nota do aluno número %d: ", nota + 1);
                    notas2[nota] = leia.nextInt();
                }
            }
        }
        for (int nota = 0; nota < notas2.length; nota ++) {
            quantidade[notas2[nota]] ++;
        }
        System.out.println("\nConteúdo do vetor na horizontal:\n");
        for (int nota = 0; nota < quantidade.length; nota ++) {
            if (nota < 10) {
                System.out.printf("%5d", quantidade[nota]);
            }
            else {
                System.out.printf("%5d\n", quantidade[nota]);
            }
        }
        System.out.println("\nConteúdo do vetor na vertical:\n");
        for (int nota = 0; nota < quantidade.length; nota ++) {
            System.out.printf("%3d - %d\n", nota, quantidade[nota]);
        }
    }
}