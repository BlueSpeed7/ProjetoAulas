// @author RA21600867
package projetoaula011;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        int year;
        String coin = "R$";
        double amount, principal, rate, rendAcumulado, rendimentoAnual;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor inicial do investimento: ");
        principal = leia.nextDouble();
        System.out.print("Digite o valor da taxa anual: ");
        rate = leia.nextDouble();
        amount = principal;
        System.out.printf("%s%50s\t%s %22s\n", "Ano", "Valor depositado", "Rendimento anual", "Rendimento Acumulado");
        for (year = 1; year <= 10; year ++) {
            rendimentoAnual = amount * rate;
            amount += rendimentoAnual;
            rendAcumulado = amount - principal;
            System.out.printf("%3d%36s %,.2f\t%s %,.2f\t%5s %,.2f\n", year, coin, amount, coin, rendimentoAnual, coin, rendAcumulado);
        }
    }
}