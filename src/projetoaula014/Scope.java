// @author RA21600867
package projetoaula014;
public class Scope {
    private int x = 1;
    public void begin() {
        int x = 5;
        System.out.printf("Variável local x do método begin é %d.\n", x);
        useLocalVariable();
        useField();
        useLocalVariable();
        useField();
        System.out.printf("Variável local x do método begin é %d.\n", x);
    }
    public void useLocalVariable() {
        int x = 25;
        System.out.printf("Variável local x no início do método useLocalVariable é %d.\n", x);
        ++ x;
        System.out.printf("Variável local x no final do método useLocalVariable é %d.\n", x);
    }
    public void useLocalVariable2(int x) {
        System.out.printf("Variável local x no início do método useLocalVariable é %d.\n", x);
        ++ x;
        System.out.printf("Variável local x no final do método useLocalVariable é %d.\n", x);
    }
    public void useField() {
        System.out.printf("O campo x no início do método useField é %d.\n", x);
        x *= 10;
        System.out.printf("O campo x no final do método useField é %d.\n", x);
    }
    public void setField(int field) {
        x = field;
    }
    public int getField() {
        return x;
    }
    public Scope(int field) {
        x = field;
    }
    public Scope() {
    }
}