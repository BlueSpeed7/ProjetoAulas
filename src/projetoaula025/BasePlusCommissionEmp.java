// @author RA21600867
package projetoaula025;
public class BasePlusCommissionEmp extends CommissionEmp {
    private double baseSalary;
    public BasePlusCommissionEmp(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0)? 0.0: salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }
    @Override
    public void mostraDados() {
        System.out.printf("%s: %s\n", "Nome", getFirstName());
        System.out.printf("%s: %s\n", "Sobrenome", getLastName());
        System.out.printf("%s: %s\n", "INSS", getSocialSecurityNumber());
        System.out.printf("%s: R$ %.2f\n", "Vendas brutas", getGrossSales());
        System.out.printf("%s: %.1f%%\n", "Taxa de comissão", getCommissionRate());
        System.out.printf("%s: R$ %.2f\n", "Bônus", getBonus());
        System.out.printf("Valor dos rendimentos do funcionário: R$ %.2f\n", earnings());
        System.out.printf("%s: R$ %.2f\n", "Comissão em reais", ((getCommissionRate() / 100) * getGrossSales()));
        System.out.printf("%s: R$ %.2f\n\n", "Salário Base", getBaseSalary());
    }
    @Override
    public String toString() {
        return String.format("%s%s: R$ %.2f\n", super.toString(), "base salary", getBaseSalary());
    }
}