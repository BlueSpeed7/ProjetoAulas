// @author RA21600867
package projetoaula023;
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Quantidade de empregados, antes de instanciar: %d\n", Employee.getCount());
        Employee e1 = new Employee("Susan", "Baker"), e2 = new Employee("Bob", "Blue"), e3 = new Employee("Max", "Payne");
        Employee.setNomeEmpresa("Abstergo Industries");
        Employee.setTelefone1("9090-5647");
        Employee.setTelefone2("4418-9465");
        System.out.printf("\nEmpresa: %s\n", Employee.getNomeEmpresa());
        System.out.println("Employees after instantiation:");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
        System.out.printf("Employee 3: %s %s\n", e3.getFirstName(), e3.getLastName());
        System.out.printf("Quantidade de funcionários: %d\n", Employee.getCount());
        Employee.setNomeEmpresa("Aperture Science");
        e1.mostraDados();
        e2.mostraDados();
        e3.mostraDados();
        e1 = null;
        e2 = null;
        e3 = null;
    }
}