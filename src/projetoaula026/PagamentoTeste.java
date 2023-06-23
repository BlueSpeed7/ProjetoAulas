// @author RA21600867
package projetoaula026;
import java.util.Scanner;
public class PagamentoTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        SalariedEmp fSalario1 = new SalariedEmp("千葉", "敦子", "2233-4455", 2000);
        System.out.println(fSalario1 + "\n");
        HourlyEmp fHorista1 = new HourlyEmp("Dexter", "Morgan", "1921-3670", 6000, 50), fHorista2 = new HourlyEmp("Max", "Payne", "4411-9875", 300, 20);
        System.out.println(fHorista1 + "\n");
        System.out.println(fHorista2 + "\n");
        Employee[] funcionarios = {fSalario1, fHorista1, fHorista2};
        int ct = 0;
        for (Employee func: funcionarios) {
            System.out.printf("Posição %d\n", ++ ct);
            System.out.println(func + "\n");
        }
        for (int i = 0; i < funcionarios.length; i ++) {
            System.out.printf("Nome: %s\n", funcionarios[i].getFirstName());
        }
        System.out.println();
        for (Employee func: funcionarios) {
            System.out.printf("Nome: %s\n", func.getFirstName());
            if (func instanceof SalariedEmp) {
                System.out.printf("Sobrenome: %s\n", func.getLastName());
            }
        }
        System.out.println();
        for (Employee func: funcionarios) {
            System.out.printf("Nome completo: %s %s\n", func.getFirstName(), func.getLastName());
            if (func instanceof HourlyEmp) {
                System.out.printf("Horas trabalhadas: %.2f\n", ((HourlyEmp) func).getHours());
            }
        }
        System.out.print("\nDigite o valor do bônus: ");
        double valor = leia.nextDouble();
        if (valor < 0) {
            while (valor < 0) {
                System.err.println("Valor inválido.");
                System.out.print("Digite o valor do bônus: ");
                valor = leia.nextDouble();
            }
        }
        fSalario1.setBonus(valor);
        fHorista1.setBonus(valor);
        fHorista2.setBonus(valor);
        for (Employee func: funcionarios) {
            System.out.println("\n" + func);
        }
        System.out.print("\nDigite o valor do bônus: ");
        valor = leia.nextDouble();
        if (valor < 0) {
            while (valor < 0) {
                System.err.println("Valor inválido.");
                System.out.print("Digite o valor do bônus: ");
                valor = leia.nextDouble();
            }
        }
        for (Employee func: funcionarios) {
            func.setBonus(valor);
        }
        for (Employee func: funcionarios) {
            System.out.println("\n" + func);
        }
    }
}