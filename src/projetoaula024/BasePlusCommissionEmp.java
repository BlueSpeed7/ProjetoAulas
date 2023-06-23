// @author RA21600867
package projetoaula024;
public class BasePlusCommissionEmp extends Object {
    private String firstName, lastName, socialSecurityNumber;
    private double grossSales, commissionRate, baseSalary, bonus;
    private static String nomeEmpresa;
    public BasePlusCommissionEmp(String first, String last, String ssn, double sales, double rate, double salary) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
        setBaseSalary(salary);
    }
    public void setFirstName(String first) {
        firstName = first;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public void setGrossSales(double sales) {
        grossSales = (sales < 0.0)? 0.0: sales;
        bonus = 0;
        if (grossSales > 10000) {
            bonus = 1700;
        }
        else {
            if (grossSales > 5000) {
                bonus = 900;
            }
        }
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getBonus() {
        return bonus;
    }
    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0)? rate: 0.0;
    }
    public double getCommissionRate() {
        return commissionRate * 100;
    }
    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0)? 0.0: salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return baseSalary + bonus + (commissionRate * grossSales);
    }
    public double earnings2() {
        return commissionRate * grossSales;
    }
    public static void setNomeEmpresa(String empresa) {
        nomeEmpresa = empresa;
    }
    public static String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void mostraDados() {
        System.out.printf("Empresa: %s\n", getNomeEmpresa());
        System.out.printf("%s: %s\n", "Nome", getFirstName());
        System.out.printf("%s: %s\n", "Sobrenome", getLastName());
        System.out.printf("%s: %s\n", "INSS", getSocialSecurityNumber());
        System.out.printf("%s: %.2f\n", "Vendas brutas", getGrossSales());
        System.out.printf("%s: %.1f%%\n", "Taxa de comissão", getCommissionRate());
        System.out.printf("%s: %.2f\n", "Salário Base", getBaseSalary());
        System.out.printf("%s: %.2f\n", "Valor dos rendimentos do funcionário", earnings());
        System.out.printf("%s: %.2f\n", "Comissão em reais", ((getCommissionRate() / 100) * getGrossSales()));
        System.out.printf("%s: %.2f\n\n", "Bônus", getBonus());
    }
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.3f\n%s: %.2f\n%s: %.2f\n%s: %.2f\n", "commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary, "earnings", earnings(), "bonus", getBonus());
    }
}