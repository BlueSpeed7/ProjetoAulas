// @author RA21600867
package projetoaula024;
public class CommissionEmp extends Object {
    private String firstName, lastName, socialSecurityNumber;
    private double grossSales, commissionRate;
    private static int count = 0;
    public CommissionEmp(String first, String last, String ssn, double sales, double rate) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
        ++ count;
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
        if (sales < 0.0) {
            grossSales = 0.0;
        }
        else {
            grossSales = sales;
        }
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            commissionRate = rate;
        }
        else {
            commissionRate = 0.0;
        }
    }
    public double getCommissionRate() {
        return commissionRate * 100;
    }
    public double earnings() {
        double bonus = 0;
        if (grossSales > 10000) {
            bonus = 900;
        }
        else {
            if (grossSales > 5000) {
                bonus = 500;
            }
        }
        return commissionRate * grossSales + bonus;
    }
    public static int getCount() {
        return count;
    }
    public void mostraDados() {
        System.out.printf("%s: %s\n", "Nome", getFirstName());
        System.out.printf("%s: %s\n", "Sobrenome", getLastName());
        System.out.printf("%s: %s\n", "INSS", getSocialSecurityNumber());
        System.out.printf("%s: %.2f\n", "Vendas brutas", getGrossSales());
        System.out.printf("%s: %.1f%%\n", "Taxa de comissão", getCommissionRate());
        System.out.printf("Valor dos rendimentos do funcionário: %.2f\n\n", earnings());
    }
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n", "commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate);
    }
}