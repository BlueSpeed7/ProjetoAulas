// @author RA21600867
package projetoaula002;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        char sexo;
        float altura;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite \"M\" ou \"m\" para masculino.\nDigite \"F\" ou \"f\" para feminino.\nSexo: ");
        sexo = leia.next().charAt(0);
        if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
            System.out.print("Digite a altura: ");
            altura = leia.nextFloat();
            if (sexo == 'M' || sexo == 'm') {
                System.out.println("O peso ideal é " + (72.7 * altura - 58));
            }
            else {
                System.out.println("O peso ideal é " + (62.1 * altura - 44.7));
            }
        }
        else {
                System.out.println("Sexo inválido.");
        }
    }
}