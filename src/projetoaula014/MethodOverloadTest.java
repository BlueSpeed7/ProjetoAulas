// @author RA21600867
package projetoaula014;
import java.util.Scanner;
public class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload objetoTeste = new MethodOverload();
        MethodOverload objetoTeste2 = new MethodOverload("Carla");
        Scanner leia = new Scanner(System.in);
        objetoTeste.testOverloadedMethods();
        System.out.printf("Resultado do cálculo: %d\n", objetoTeste.square(8));
        System.out.printf("Resultado do cálculo: %.1f\n", objetoTeste.square(3.5));
        System.out.printf("Resultado do cálculo: %d\n", objetoTeste.square((objetoTeste.square(3))));
        System.out.print("Digite um valor inteiro: ");
        int valor = leia.nextInt();
        System.out.printf("Quadrado de um valor lido: %d\n", objetoTeste.square(valor));
        System.out.print("Digite um valor real: ");
        double valor2 = leia.nextDouble();
        System.out.printf("Quadrado de um valor lido: %.1f\n", objetoTeste.square(valor2));
        System.out.printf("Resultado do cálculo: %d\n", objetoTeste.cube(5));
        System.out.printf("Resultado do cálculo: %.1f\n", objetoTeste.cube(3.1));
        System.out.printf("Resultado do cálculo: %d\n", objetoTeste.square(objetoTeste.cube(2)));
        objetoTeste.setUserName("Paulo");
        System.out.printf("Nome: %s\n", objetoTeste.getUserName());
        System.out.printf("%s, o resultado do cálculo é %d.\n", objetoTeste.getUserName(), objetoTeste.cube(2));
        System.out.printf("Nome: %s\n", objetoTeste2.getUserName());
        System.out.printf("%s, o resultado do cálculo é %.1f.\n", objetoTeste2.getUserName(), objetoTeste2.cube(4.4));
    }
}