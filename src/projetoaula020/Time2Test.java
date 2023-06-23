// @author RA21600867
package projetoaula020;
import java.util.Scanner;
public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(27, 74, 99);
        Time2 t6 = new Time2(t4);
        Time2 t7 = new Time2(17);
        Time2 t8 = new Time2();
        int h, m, s;
        Scanner leia = new Scanner(System.in);
        System.out.println("t1: default arguments");
        System.out.printf("%s\n", t1.toUniversalString());
        System.out.printf("%s\n", t1.toString());
        System.out.println("t2: specified hour, default minute and second");
        System.out.printf("%s\n", t2.toUniversalString());
        System.out.printf("%s\n", t2.toString());
        System.out.println("t3: specified hour and minute, default second");
        System.out.printf("%s\n", t3.toUniversalString());
        System.out.printf("%s\n", t3.toString());
        System.out.println("t4: specified hour, minute and second");
        System.out.printf("%s\n", t4.toUniversalString());
        System.out.printf("%s\n", t4.toString());
        System.out.println("t5: invalid hour, minute and second");
        System.out.printf("%s\n", t5.toUniversalString());
        System.out.printf("%s\n", t5.toString());
        System.out.println("t6: Time2 object t4 specified");
        System.out.printf("%s\n", t6.toUniversalString());
        System.out.printf("%s\n", t6.toString());
        System.out.println("t7: user custom arguments");
        System.out.printf("%s\n", t7.toUniversalString());
        System.out.printf("%s\n", t7.toString());
        t7.setTime(19, 3, 11);
        System.out.printf("%s\n", t7.toUniversalString());
        System.out.printf("%s\n", t7.toString());
        t7.setMinute(30);
        System.out.printf("%s\n", t7.toUniversalString());
        System.out.printf("%s\n", t7.toString());
        System.out.print("Digite as horas: ");
        h = leia.nextInt();
        if (h < 0 || h > 24) {
            while (h < 0 || h > 24) {
            System.err.println("Horas inválidas.");
            System.out.print("Digite as horas: ");
            h = leia.nextInt();
            }
        }
        System.out.print("Digite os minutos: ");
        m = leia.nextInt();
        if (m < 0 || m > 59) {
            while (m < 0 || m > 59) {
            System.err.println("Minutos inválidos.");
            System.out.print("Digite os minutos: ");
            m = leia.nextInt();
            }
        }
        System.out.print("Digite os segundos: ");
        s = leia.nextInt();
        if (s < 0 || s > 59) {
            while (s < 0 || s > 59) {
            System.err.println("Segundos inválidos.");
            System.out.print("Digite os segundos: ");
            s = leia.nextInt();
            }
        }
        t8.setTime(h, m, s);
        System.out.printf("%s\n", t8.toUniversalString());
        System.out.printf("%s\n", t8.toString());
        System.out.printf("Horas em segundos: %d\n", t7.horasEmSegundos());
        System.out.printf("Horas em segundos: %d\n", t8.horasEmSegundos());
        if (t6.horasEmSegundos() < t7.horasEmSegundos()) {
            System.out.printf("Horário menor: %s\n", t6.toUniversalString());
        }
        else {
            if (t6.horasEmSegundos() > t7.horasEmSegundos()) {
            System.out.printf("Horário menor: %s\n", t7.toUniversalString());
            }
            else {
                System.out.println("Horários iguais.");
            }
        }
        t6.comparaHorasEmSegundos(t6, t8);
        System.out.print("Digite as horas: ");
        h = leia.nextInt();
        if (h < 0 || h > 24) {
            while (h < 0 || h > 24) {
            System.err.println("Horas inválidas.");
            System.out.print("Digite as horas: ");
            h = leia.nextInt();
            }
        }
        System.out.print("Digite os minutos: ");
        m = leia.nextInt();
        if (m < 0 || m > 59) {
            while (m < 0 || m > 59) {
            System.err.println("Minutos inválidos.");
            System.out.print("Digite os minutos: ");
            m = leia.nextInt();
            }
        }
        System.out.print("Digite os segundos: ");
        s = leia.nextInt();
        if (s < 0 || s > 59) {
            while (s < 0 || s > 59) {
            System.err.println("Segundos inválidos.");
            System.out.print("Digite os segundos: ");
            s = leia.nextInt();
            }
        }
        t8.setTime(h, m, s);
        t7.comparaHoras(t7, t8);
    }
}