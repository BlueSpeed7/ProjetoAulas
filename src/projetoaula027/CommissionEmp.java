// @author RA21600867
package projetoaula027;
public class CommissionEmp extends Employee {
    private double grossSales, commissionRate;
    public CommissionEmp(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
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
        return commissionRate;
    }
    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }
    @Override
    public String toString() {
        return String.format("%s: %s%s: R$ %.2f\n%s: %.2f\n%s: R$ %,.2f", "commission employee", super.toString(), "gross sales", grossSales, "commission rate", commissionRate, "earnings", earnings());
    }
}