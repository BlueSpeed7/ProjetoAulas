// @author RA21600867
package projetoaula029;
public class SalariedEmp extends Employee {
    private double weeklySalary;
    public SalariedEmp(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = (salary < 0.0)? 0.0: salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}