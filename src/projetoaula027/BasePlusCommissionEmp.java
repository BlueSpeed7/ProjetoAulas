// @author RA21600867
package projetoaula027;
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
    public String toString() {
        return String.format("%s %s\n%s: R$ %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}