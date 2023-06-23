// @author RA21600867
package projetoaula025;
import java.util.Scanner;
public class EmpTest {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CommissionEmp fComissao = new CommissionEmp("Carla", "Souza", "123-456", 8000, .08);
        BasePlusCommissionEmp fSalCom = new  BasePlusCommissionEmp("João", "Araújo", "111-222", 12000, .096, 1600);
        System.out.print("Digite o valor do bônus: ");
        double valor = leia.nextDouble();
        if (valor < 0) {
            while (valor < 0) {
                System.err.println("Valor inválido.");
                System.out.print("Digite o valor do bônus: ");
                valor = leia.nextDouble();
            }
        }
        fComissao.setBonus(valor);
        fSalCom.setBonus(valor);
        System.out.println(fComissao);
        fComissao.mostraDados();
        fComissao.setSocialSecurityNumber("999-888");
        fComissao.mostraDados();
        System.out.println(fSalCom);
        fSalCom.mostraDados();
        fSalCom.setSocialSecurityNumber("123-123");
        fSalCom.mostraDados();
        fComissao.setBonus(600);
        fSalCom.setBonus(700);
        System.out.println(fComissao);
        fComissao.mostraDados();
        System.out.println(fSalCom);
        fSalCom.mostraDados();
        comparaRendimentos(fComissao, fSalCom);
        fSalCom.setBonus(0);
        fComissao.setGrossSales(75000);
        comparaRendimentos(fComissao, fSalCom);
        fComissao.setBonus(100);
        fComissao.setCommissionRate(.034);
        fComissao.setGrossSales(500);
        fSalCom.setBonus(100);
        fSalCom.setCommissionRate(.034);
        fSalCom.setGrossSales(500);
        fSalCom.setBaseSalary(0);
        System.out.println("\n" + fComissao);
        fComissao.mostraDados();
        System.out.println(fSalCom);
        fSalCom.mostraDados();
        comparaRendimentos(fComissao, fSalCom);
    }
    public static void comparaRendimentos(CommissionEmp e1, CommissionEmp e2) {
        if (e1.earnings() > e2.earnings()) {
            System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", e1.getFirstName(), e1.getLastName(), e1.earnings());
        }
        else {
            if (e1.earnings() < e2.earnings()) {
                System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", e2.getFirstName(), e2.getLastName(), e2.earnings());
            }
            else {
                System.out.println("Rendimentos iguais.");
            }
        }
    }
}