// @author RA21600867
package projetoaula020;
public class Time1 {
    private int hour, minute, second;
    public void setTime(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hour = h;
        }
        else {
            hour = 0;
        }
        minute = ((m >= 0 && m < 60)? m: 0);
        second = ((s >=0 && s < 60)? s: 0);
    }
    public boolean setTime2(int h, int m, int s) {
        boolean teste = ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >=0 && s < 60));
        return teste;
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    @Override
    public String toString() {
        String mid;
        if (hour == 0 || hour == 12) {
            hour = 12;
        }
        else {
            hour %= 12;
        }
        if (hour < 12) {
            mid = "AM";
        }
        else {
            mid = "PM";
        }
        return String.format("%d:%02d:%02d %s", hour, minute, second, mid);
    }
    public int getHour() {
        return hour;
    }
    public int horasEmSegundos() {
        return hour * 3600 + minute * 60 + second;
    }
}