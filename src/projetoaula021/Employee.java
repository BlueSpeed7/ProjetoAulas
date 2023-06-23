// @author RA21600867
package projetoaula021;
public class Employee {
    private String firstName, lastName; Date birthDate, hireDate;
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }
    public boolean comparaDatas() {
        boolean compara;
        if (birthDate.getYear() < hireDate.getYear()) {
            compara = true;
        }
        else {
            if (birthDate.getYear() == hireDate.getYear()) {
                if (birthDate.getMonth() < hireDate.getMonth()) {
                    compara = true;
                }
                else {
                    if (birthDate.getMonth() == hireDate.getMonth()) {
                        compara = birthDate.getDay() < hireDate.getDay();
                    }
                    else {
                        compara = false;
                    }
                }
            }
            else {
                compara = false;
            }
        }
        return compara;
    }
    @Override
    public String toString() {
        return String.format("%s, %s\nHired: %s\nBirthday: %s\n", lastName, firstName, hireDate, birthDate);
    }
}