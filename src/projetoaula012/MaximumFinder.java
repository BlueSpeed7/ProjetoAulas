// @author RA21600867
package projetoaula012;
import java.util.Scanner;
public class MaximumFinder {
    public void determineMaximum() {
        double n1, n2, n3, result;
        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com três valores reais separados por espaço: ");
        n1 = leia.nextDouble();
        n2 = leia.nextDouble();
        n3 = leia.nextDouble();
        result = maximum(n1, n2, n3);
        System.out.println("Maior valor: " + result);
    }
    public void determineMaximum2() {
        double n1, n2, n3, result;
        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com três valores reais separados por espaço: ");
        n1 = leia.nextDouble();
        n2 = leia.nextDouble();
        n3 = leia.nextDouble();
        result = maximum2(n1, n2, n3);
        System.out.println("Maior valor: " + result);
    }
    public void determineMaximum3() {
        double n1, n2, n3, result;
        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com três valores reais separados por espaço: ");
        n1 = leia.nextDouble();
        n2 = leia.nextDouble();
        n3 = leia.nextDouble();
        result = maximum3(n1, n2, n3);
        System.out.println("Maior valor: " + result);
    }
    public double maximum(double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }
    public double maximum2(double x, double y, double z) {
        double maximumValue = Math.max(Math.max(x, y), z);
        return maximumValue;
    }
    public double maximum3(double x, double y, double z) {
        return Math.max(Math.max(x, y), z);
    }
}