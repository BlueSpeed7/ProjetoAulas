// @author RA21600867
package projetoaula020;
public class Time2 {
    private int hour, minute, second;
    public Time2() {
        this(0, 0, 0);
    }
    public Time2(int h) {
        this(h, 0, 0);
    }
    public Time2(int h, int m) {
        this(h, m, 0);
    }
    public Time2(int h, int m, int s) {
        setTime(h, m, s);
    }
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        }
        else {
            hour = 0;
        }
    }
    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60)? m: 0);
    }
    public void setSecond(int s) {
        second = ((s >=0 && s < 60)? s: 0);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public String toUniversalString() {
        String universalString = String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        return universalString;
    }
    @Override
    public String toString() {
        int timeHour = 0;
        String mid;
        if (getHour() == 0 || getHour() == 12) {
            timeHour = 12;
        }
        else {
            timeHour %= 12;
        }
        if (getHour() < 12) {
            mid = "AM";
        }
        else {
            mid = "PM";
        }
        return String.format("%d:%02d:%02d %s", timeHour, getMinute(), getSecond(), mid);
    }
    public int horasEmSegundos() {
        return getHour() * 3600 + getMinute() * 60 + getSecond();
    }
    public void comparaHoras(Time2 time, Time2 time2) {
        if (time.getHour() < time2.getHour()) {
            System.out.printf("Horário menor: %s\n", time.toUniversalString());
        }
        else {
            if (time2.getHour() < time.getHour()) {
                System.out.printf("Horário menor: %s\n", time2.toUniversalString());
            }
            else {
                if (time.getMinute() < time2.getMinute()) {
                    System.out.printf("Horário menor: %s\n", time.toUniversalString());
                }
                else {
                    if (time2.getMinute() < time2.getMinute()) {
                        System.out.printf("Horário menor: %s\n", time2.toUniversalString());
                    }
                    else {
                        if (time.getSecond() < time2.getSecond()) {
                            System.out.printf("Horário menor: %s\n", time.toUniversalString());
                        }
                        else {
                            if (time2.getSecond() < time.getSecond()) {
                                System.out.printf("Horário menor: %s\n", time2.toUniversalString());
                            }
                            else {
                                System.out.println("Horários iguais.");
                            }
                        }
                    }
                }
            }
        }
    }
    public void comparaHorasEmSegundos(Time2 time, Time2 time2) {
        if (time.horasEmSegundos() < time2.horasEmSegundos()) {
            System.out.printf("Horário menor: %s\n", time.toUniversalString());
        }
        else {
            if (time2.horasEmSegundos() < time.horasEmSegundos()) {
                System.out.printf("Horário menor: %s\n", time2.toUniversalString());
            }
            else {
                System.out.println("Horários iguais.");
            }
        }
    }
}