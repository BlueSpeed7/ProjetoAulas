// @author RA21600867
package projetoaula045;
import java.util.Scanner;
public class TokenTest {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in), sc = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String sentence = leia.nextLine();
        while (!sentence.isEmpty()) {
            boolean valid = true;
            String[] vNomes = sentence.split(" ");
            System.out.printf("Number of elements: %d\nThe vNomes are:\n", vNomes.length);
            for (int i = 0; i < vNomes.length; i ++) {
                System.out.printf("- %s\n", vNomes[i]);
                if (Character.isLowerCase(vNomes[i].charAt(0))) {
                    valid = false;
                    break;
                }
                else {
                    for (int c = 1; c < vNomes[i].length(); c ++) {
                        if (!Character.isLowerCase(vNomes[i].charAt(c))) {
                            valid = false;
                            break;
                        }
                    }
                }
            }
            if (valid) {
                System.out.println("Padrão correto.");
            }
            else {
                System.out.println("Padrão incorreto.");
            }
            System.out.print("Nome completo: ");
            sentence = leia.nextLine();
        }
        System.out.print("Digite o nome de 3 cores: ");
        String cores = sc.nextLine();
        String[] vCores = cores.split(", ");
        for (int i = 0; i < vCores.length; i ++) {
            System.out.println(vCores[i]);
        }
    }
}