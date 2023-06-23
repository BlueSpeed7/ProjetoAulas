// @author RA21600867
package projetoaula021;
public class Date {
    private int day, month, year;
    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
        System.out.printf("Date object constructor for date %s\n", this);
    }
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {
            return testMonth;
        }
        else {
            System.out.printf("Invalid month (%d) set to 1.\n", testMonth);
            return 1;
        }
    }
    private int checkDay(int testDay) {
            int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (testDay > 0 && testDay <= daysPerMonth[month]) {
                return testDay;
            }
            if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                return testDay;
            }
            System.out.printf("Invalid day (%d) set to 1.\n", testDay);
            return 1;
    }
    public void setMonth(int theMonth) {
        month = checkMonth(theMonth);
    }
    public void setDay(int theDay) {
        day = checkDay(theDay);
    }
    public void setDate(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}