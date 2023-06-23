// @author RA21600867
package projetoaula023;
public class Increment {
    private int total = 0;
    private final int increment, increment2 = 7, increment3 = 6;
    public Increment(int incrementValue) {
        increment = incrementValue;
    }
    public Increment() {
        increment = 3;
    }
    public void addIncrementToTotal() {
        total += increment;
    }
    public void addIncrement2ToTotal() {
        total += increment2;
    }
    public void addIncrement3ToTotal() {
        total += increment3;
    }
    @Override
    public String toString() {
        return String.format("total = %d", total);
    }
}