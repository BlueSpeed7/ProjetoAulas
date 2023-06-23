// @author RA21600867
package projetoaula021;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949), hire = new Date(3, 12, 1988), birth2 = new Date(4, 4, 1995), hire2 = new Date(99, 99, 9999), birth3 = new Date(1, 1, 1), hire3 = new Date(2, 20, 2017); Employee employee1 = new Employee("Bob", "Blue", birth, hire), employee2 = new Employee("Marinho", "Fernando", birth2, hire2), employee3 = new Employee("Machine", "Chaos", birth3, hire3);
        int month, day, year;
        Scanner leia = new Scanner(System.in);
        System.out.println(employee1);
        birth.setMonth(10);
        System.out.println(employee1);
        hire.setMonth(33);
        System.out.println(employee1);
        birth.setDay(23);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.print("Digite o mês da data de nascimento do empregado 3: ");
        month = leia.nextInt();
        if (month < 1 || month > 12) {
            while (month < 1 || month > 12) {
                System.err.println("Mês inválido.");
                System.out.print("Digite o mês da data de nascimento do empregado 3: ");
                month = leia.nextInt();
            }
        }
        System.out.print("Digite o dia da data de nascimento do empregado 3: ");
        day = leia.nextInt();
        if (day < 1 || day > 31) {
            while (day < 1 || day > 31) {
                System.err.println("Dia inválido.");
                System.out.print("Digite o dia da data de nascimento do empregado 3: ");
                day = leia.nextInt();
            }
        }
        System.out.print("Digite o ano da data de nascimento do empregado 3: ");
        year = leia.nextInt();
        if (year < 1 || year > 9999) {
            while (year < 1 || year > 9999) {
                System.err.println("Ano inválido.");
                System.out.print("Digite o ano da data de nascimento do empregado 3: ");
                year = leia.nextInt();
            }
        }
        birth3.setDate(month, day, year);
        System.out.println(employee3);
        employee3.setLastName("Souza");
        System.out.println(employee3);
        birth.setDate(3, 15, 1500);
        birth2.setDate(2, 29, 2016);
        birth3.setDate(9, 44, 9999);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        if (employee1.comparaDatas() == false) {
            System.err.printf("Data de nascimento do %s após a data de contratação.\n", employee1.getName());
        }
        if (employee2.comparaDatas() == false) {
            System.err.printf("Data de nascimento do %s após a data de contratação.\n", employee2.getName());
        }
        if (employee3.comparaDatas() == false) {
            System.err.printf("Data de nascimento do %s após a data de contratação.\n", employee3.getName());
        }
    }
}