// @author RA21600867
package projetoaula023;
public class IncrementTest {
    public static void main(String[] args) {
        Increment value = new Increment(5), value2 = new Increment(), value3 = new Increment(), value4 = new Increment();
        System.out.printf("Before incrementing: %s\n", value);
        for (int i = 1; i <= 3; i ++) {
            value.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i, value);
        }
        System.out.printf("\nBefore incrementing: %s\n", value2);
        for (int i = 1; i <= 3; i ++) {
            value2.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i, value2);
        }
        System.out.printf("\nBefore incrementing: %s\n", value3);
        for (int i = 1; i <= 3; i ++) {
            value3.addIncrement2ToTotal();
            System.out.printf("After increment2 %d: %s\n", i, value3);
        }
        System.out.printf("\nBefore incrementing: %s\n", value4);
        for (int i = 1; i <= 3; i ++) {
            value4.addIncrement3ToTotal();
            System.out.printf("After increment3 %d: %s\n", i, value4);
        }
    }
}