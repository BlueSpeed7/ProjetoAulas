// @author RA21600867
package projetoaula006;
import java.util.Scanner;
public class Conversao {
    public static void main(String[] args) {
        int fahrenheit, ctPausa = 0;
        Scanner leia = new Scanner(System.in);
        System.out.println("Fahrenheit - Celsius");
        for (fahrenheit = 50; fahrenheit <= 80; fahrenheit ++) {
            System.out.println(fahrenheit + "º - " + (float) (fahrenheit - 32) / 1.8 + "º");
            ctPausa ++;
            if (ctPausa == 10) {
                System.out.println("Digite uma tecla para continuar.");
                leia.next();
                ctPausa = 0;
                System.out.println("Fahrenheit - Celsius");
            }
        }
    }
}