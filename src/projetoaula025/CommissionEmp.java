// @author RA21600867
package projetoaula025;
public class CommissionEmp {
    private String firstName, lastName, socialSecurityNumber;
    private double grossSales, commissionRate, bonus;
    public CommissionEmp(String first, String last, String ssn, double sales, double rate) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
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
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0)? rate: 0.0;
    }
    public double getCommissionRate() {
        return commissionRate * 100;
    }
    public void setBonus(double valor) {
        bonus = valor;
    }
    public double getBonus() {
        return bonus;
    }
    public double earnings() {
        return commissionRate * grossSales + bonus;
    }
    public void mostraDados() {
        System.out.printf("%s: %s\n", "Nome", getFirstName());
        System.out.printf("%s: %s\n", "Sobrenome", getLastName());
        System.out.printf("%s: %s\n", "INSS", getSocialSecurityNumber());
        System.out.printf("%s: R$ %.2f\n", "Vendas brutas", getGrossSales());
        System.out.printf("%s: %.1f%%\n", "Taxa de comissão", getCommissionRate());
        System.out.printf("%s: R$ %.2f\n", "Bônus", getBonus());
        System.out.printf("Valor dos rendimentos do funcionário: R$ %.2f\n", earnings());
        System.out.printf("%s: R$ %.2f\n\n", "Comissão em reais", ((getCommissionRate() / 100) * getGrossSales()));
    }
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: R$ %.2f\n%s: %.2f\n%s: R$ %.2f\n", "commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate, "bonus", bonus);
    }
}