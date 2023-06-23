// @author RA21600867
package projetoaula014;
public class MethodOverload {
    private String userName;
    public MethodOverload(String name) {
        userName = name;
    }
    public MethodOverload() {
    }
    public void testOverloadedMethods() {
        System.out.printf("Quadrado do int 7 é %d.\n", square(7));
        System.out.printf("Quadrado do double 7,5 é %.2f.\n", square(7.5));
    }
    public int square(int value) {
        System.out.printf("Método square chamado com argumento int: %d\n", value);
        return value * value;
    }
    public double square(double value) {
        double valorRetorno;
        System.out.printf("Método square chamado com argumento double: %.1f\n", value);
        valorRetorno = value * value;
        return valorRetorno;
    }
    public int cube(int value) {
        System.out.printf("Método cube chamado com argumento int: %d\n", value);
        return value * value * value;
    }
    public double cube(double value) {
        System.out.printf("Método cube chamado com argumento double: %.1f\n", value);
        return Math.pow(value, 3);
    }
    public void setUserName(String name) {
        userName = name;
    }
    public String getUserName() {
        return userName;
    }
}