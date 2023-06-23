// @author RA21600867
package projetoaula027;
public class PagamentoTeste {
    public static void main(String[] args) {
        SalariedEmp sEmployee = new SalariedEmp("John", "Smith", "111-11-1111", 800.00), sEmployee2 = new SalariedEmp("Troy", "Baker", "555-55-5555", 420.00);
        HourlyEmp hEmployee = new HourlyEmp("Karen", "Price", "222-22-2222", 16.75, 40), hEmployee2 = new HourlyEmp("Trish", "Wright", "666-66-6666", 12.25, 30);
        CommissionEmp cEmployee = new CommissionEmp("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmp bpcEmployee = new BasePlusCommissionEmp("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        System.out.println("Dados dos empregados processados individualmente:");
        System.out.printf("%s\n%s: R$ %,.2f\n\n", sEmployee, "earned", sEmployee.earnings());
        System.out.printf("%s\n%s: R$ %,.2f\n\n", hEmployee, "earned", hEmployee.earnings());
        System.out.printf("%s\n%s: R$ %,.2f\n\n", cEmployee, "earned", cEmployee.earnings());
        System.out.printf("%s\n%s: R$ %,.2f\n\n", bpcEmployee, "earned", bpcEmployee.earnings());
        sEmployee.setSexo('m');
        sEmployee2.setSexo('m');
        hEmployee.setSexo('f');
        hEmployee2.setSexo('f');
        cEmployee.setSexo('f');
        bpcEmployee.setSexo('m');
        Employee[] employees = {sEmployee, sEmployee2, hEmployee, hEmployee2, cEmployee, bpcEmployee};
        for (int i = 0; i < employees.length; i ++) {
            System.out.printf("Employee %d is a %s\n", (i + 1), employees[i].getClass());
        }
        System.out.print("\nDados dos empregados processados polimorficamente:");
        for (int i = 0; i < employees.length; i ++) {
            System.out.println("\n" + employees[i]);
        }
        System.out.print("\nDados dos empregados processados polimorficamente:");
        for (Employee emp: employees) {
            System.out.println("\n" + emp);
        }
        System.out.print("\nRendimentos dos empregados processados polimorficamente:");
        for (int i = 0; i < employees.length; i ++) {
            System.out.printf("\n%s\n%s: R$ %,.2f\n", employees[i], "earned", employees[i].earnings());
        }
        System.out.print("\nRendimentos dos empregados processados polimorficamente:");
        for (Employee emp: employees) {
            System.out.printf("\n%s\n%s: R$ %,.2f\n", emp, "earned", emp.earnings());
        }
        System.out.println("\nComissão em reais dos empregados processados polimorficamente:");
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i] instanceof CommissionEmp) {
                System.out.printf("%s %s: R$ %,.2f\n", employees[i].getFirstName(), employees[i].getLastName(), (((CommissionEmp) employees[i]).getCommissionRate() * ((CommissionEmp) employees[i]).getGrossSales()));
            }
        }
        System.out.println("\nComissão em reais dos empregados processados polimorficamente:");
        for (Employee emp: employees) {
            if (emp instanceof CommissionEmp) {
                System.out.printf("%s %s: R$ %,.2f\n", emp.getFirstName(), emp.getLastName(), (((CommissionEmp) emp).getCommissionRate() * ((CommissionEmp) emp).getGrossSales()));
            }
        }
        for (int i = 0; i < employees.length; i ++) {
            System.out.printf("\n%s %s", employees[i].getFirstName(), employees[i].getLastName());
        }
        System.out.println();
        for (Employee emp: employees) {
            System.out.printf("\n%s %s", emp.getFirstName(), emp.getLastName());
        }
        System.out.println();
        for (int i = 0; i < employees.length; i ++) {
            System.out.printf("\n%s %s: R$ %,.2f", employees[i].getFirstName(), "earned", employees[i].earnings());
        }
        System.out.println();
        for (Employee emp: employees) {
            System.out.printf("\n%s %s: R$ %,.2f", emp.getFirstName(), "earned", emp.earnings());
        }
        System.out.println();
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i].getSexo() == 'm') {
                System.out.printf("\nO %s %s: R$ %,.2f", employees[i].getFirstName(), "ganhou", employees[i].earnings());
            }
            if (employees[i].getSexo() == 'f') {
                System.out.printf("\nA %s %s: R$ %,.2f", employees[i].getFirstName(), "ganhou", employees[i].earnings());
            }
        }
        System.out.println();
        for (Employee emp: employees) {
            if (emp.getSexo() == 'm') {
                System.out.printf("\nO %s %s: R$ %,.2f", emp.getFirstName(), "ganhou", emp.earnings());
            }
            if (emp.getSexo() == 'f') {
                System.out.printf("\nA %s %s: R$ %,.2f", emp.getFirstName(), "ganhou ", emp.earnings());
            }
        }
        System.out.println();
        for (Employee emp: employees) {
            System.out.print("\n" + emp.getFirstName());
            if (emp instanceof SalariedEmp) {
                System.out.print(" " + emp.getLastName());
            }
        }
        System.out.println();
        for (Employee emp: employees) {
            if (emp instanceof SalariedEmp) {
                System.out.printf("\n%s %s", emp.getFirstName(), emp.getLastName());
            }
            else {
                System.out.printf("\n%s", emp.getFirstName());
            }
        }
        System.out.println();
        for (Employee emp: employees) {
            if (emp instanceof HourlyEmp) {
                System.out.printf("\n%s\n%s: %.2f", emp.getFirstName(), "hours worked", ((HourlyEmp) emp).getHours());
            }
            else {
                System.out.printf("\n" + emp.getFirstName());
            }
        }
        System.out.println();
        for (Employee emp: employees) {
            if (emp instanceof CommissionEmp) {
                ((CommissionEmp) emp).setCommissionRate(((CommissionEmp) emp).getCommissionRate() + .03);
                System.out.println("\n" + emp);
            }
        }
        for (Employee emp: employees) {
            if (emp instanceof BasePlusCommissionEmp) {
                ((BasePlusCommissionEmp) emp).setBaseSalary(((BasePlusCommissionEmp) emp).getBaseSalary() * 1.10);
                System.out.println("\n" + emp);
            }
        }
        for (Employee emp: employees) {
            if (emp instanceof CommissionEmp) {
                if (((CommissionEmp) emp).getGrossSales() <= 1000) {
                    ((CommissionEmp) emp).setCommissionRate(((CommissionEmp) emp).getCommissionRate() + .02);
                }
                else {
                    ((CommissionEmp) emp).setCommissionRate(((CommissionEmp) emp).getCommissionRate() + .035);
                }
                System.out.println("\n" + emp);
            }
        }
    }
}