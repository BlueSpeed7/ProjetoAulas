// @author RA21600867
package projetoaula001;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        float nota1, nota2, peso1, peso2, media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Peso da primeira nota: ");
        peso1 = leia.nextFloat();
        System.out.print("Peso da segunda nota: ");
        peso2 = leia.nextFloat();
        System.out.print("Primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.print("\n\n");
        media = (float) (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
        if (media >= 5) {
            System.out.println("Média: " + media + "\nPrimeira nota: " + nota1 + "\nSegunda nota: " + nota2 + "\nAluno aprovado.");
        }
        else {
            System.out.println("Média: " + media + "\nPrimeira nota: " + nota1 + "\nSegunda nota = " + nota2 + "\nAluno reprovado.");
        }
    }
}