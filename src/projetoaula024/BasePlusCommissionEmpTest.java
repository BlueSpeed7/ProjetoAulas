// @author RA21600867
package projetoaula024;
public class BasePlusCommissionEmpTest {
    public static void main(String[] args) {
        BasePlusCommissionEmp.setNomeEmpresa("Skynet");
        BasePlusCommissionEmp employee = new BasePlusCommissionEmp("Bob", "Lewis", "333-33-3333", 5000, .04, 300), employee2 = new BasePlusCommissionEmp("Fernando", "Marinho", "00-000-0000", 360, .03, 100);
        employee.mostraDados();
        employee2.mostraDados();
        employee.setGrossSales(15000);
        System.out.printf("%s:\n%s\n", "Informações do funcionário com employee", employee);
        System.out.printf("%s:\n%s\n", "Informações do funcionário com toString()", employee.toString());
        employee2.setGrossSales(6000);
        employee2.mostraDados();
        employee2.setCommissionRate(.247);
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
        if (employee.earnings2() > employee2.earnings2()) {
            System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", employee.getFirstName(), employee.getLastName(), employee.earnings());
        }
        else {
            if (employee.earnings2() < employee2.earnings2()) {
                System.out.printf("O funcionário com o maior valor dos rendimentos é: %s %s\nValor dos rendimentos: %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.earnings());
            }
            else {
                System.out.println("Rendimentos iguais.");
            }
        }
        System.out.printf("\n%s:\n%s\n", "Informações do funcionário com employee", employee);
        System.out.printf("%s:\n%s\n", "Informações do funcionário 2 com employee2", employee2);
        employee.setBaseSalary(50);
        employee.setCommissionRate(.05);
        employee.setGrossSales(1000);
        employee2.setBaseSalary(50);
        employee2.setCommissionRate(.05);
        employee2.setGrossSales(1000);
        employee.mostraDados();
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