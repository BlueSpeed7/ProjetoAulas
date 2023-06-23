// @author RA21600867
package projetoaula026;
public class HourlyEmp extends Employee {
    private double wage, hours;
    public HourlyEmp(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public void setWage(double hourlyWage) {
        wage = (hourlyWage < 0.0)? 0.0: hourlyWage;
    }
    public double getWage() {
        return wage;
    }
    public void setHours(double hoursWorked) {
        hours = (hoursWorked >= 0.0 && hoursWorked <= 168.0)? hoursWorked: 0.0;
    }
    public double getHours() {
        return hours;
    }
    @Override
    public double earnings() {
        return getHours() <= 40? getWage() * getHours() + getBonus(): 40 * getWage() + (getHours() - 40) * getWage() * 1.45 + getBonus();
    }
    @Override
    public String toString() {
        return String.format("%s: %s%s: R$ %,.2f\n%s: %.2f\n%s: R$ %,.2f\n%s: R$ %,.2f", "Empregado horista", super.toString(), "hourly wage", getWage(), "hours worked", getHours(), "earnings", earnings(), "bonus", getBonus());
    }
}