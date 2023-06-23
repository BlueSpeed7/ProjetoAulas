// @author RA21600867
package projetoaula024;
public class CommissionEmpTest {
    public static void main(String[] args) {
        System.out.printf("Quantidade de funcionários, antes de instanciar: %d\n", CommissionEmp.getCount());
        CommissionEmp employee = new CommissionEmp("Sue", "Jones", "222-22-2222", 10000, .06), employee2 = new CommissionEmp("Pietre", "Carvel", "987-65-4321", 8000, .75);
        System.out.printf("Quantidade de funcionários: %d\n", CommissionEmp.getCount());
        System.out.printf("Quantidade de funcionários: %d\n", CommissionEmp.getCount());
        System.out.println("\nInformações do employee obtidas com os métodos get.");
        employee.mostraDados();
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        System.out.printf("%s:\n%s\n", "Informações do funcionário com o toString()", employee);
        System.out.printf("Valor dos rendimentos do funcionário: %.2f\n", employee.earnings());
        employee2.mostraDados();
        employee2.setFirstName("Paulo");
        employee2.setLastName("Bezerra");
        employee2.setCommissionRate(.23);
        employee2.mostraDados();
        if (employee.earnings() > employee2.earnings()) {
            System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", employee.getFirstName(), employee.getLastName(), employee.earnings());
        }
        else {
            if (employee.earnings() < employee2.earnings()) {
                System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.earnings());
            }
            else {
                System.out.println("Rendimentos iguais.");
            }
        }
    }
}