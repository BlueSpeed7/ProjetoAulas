// @author RA21600867
package projetoaula026;
public abstract class Employee {
    private String firstName, lastName, socialSecurityNumber;
    private double bonus;
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
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
    public void setBonus(double valor) {
        bonus = valor;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %s\n", firstName, lastName, "social security number", socialSecurityNumber);
    }
    public abstract double earnings();
}