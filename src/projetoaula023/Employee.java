// @author RA21600867
package projetoaula023;
public class Employee {
    private final String firstName, lastName;
    private static String nomeEmpresa, telefone1, telefone2;
    private static int count = 0;
    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        ++ count;
        System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public static int getCount() {
        return count;
    }
    public static void setNomeEmpresa(String empresa) {
        nomeEmpresa = empresa;
    }
    public static String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public static void setTelefone1(String numero) {
        telefone1 = numero;
    }
    public static String getTelefone1() {
        return telefone1;
    }
    public static void setTelefone2(String numero) {
        telefone2 = numero;
    }
    public static String getTelefone2() {
        return telefone2;
    }
    public void mostraDados() {
        System.out.printf("\nEmpresa: %s\n", getNomeEmpresa());
        System.out.printf("Telefone 1: %s\n", getTelefone1());
        System.out.printf("Telefone 2: %s\n", getTelefone2());
        System.out.printf("Employee: %s %s\n", firstName, lastName);
    }
}