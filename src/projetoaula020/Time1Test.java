// @author RA21600867
package projetoaula020;
public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        Time1 time2 = new Time1();
        System.out.printf("O horário universal é: %s\n", time.toUniversalString());
        System.out.printf("O horário padrão é: %s\n\n", time.toString());
        time.setTime(13, 27, 6);
        System.out.printf("Horário universal depois do setTime é: %s\n", time.toUniversalString());
        System.out.printf("Horário padrão depois do setTime é: %s\n\n", time.toString());
        time.horasEmSegundos();
        time.setTime(99, 99, 99);
        System.out.println("After attempting invalid settings:");
        System.out.printf("Universal time: %s\n", time.toUniversalString());
        System.out.printf("Standard time: %s\n\n", time.toString());
        time2.setTime(10, 30, 44);
        System.out.printf("O horário universal é: %s\n", time2.toUniversalString());
        System.out.printf("O horário padrão é: %s\n\n", time2.toString());
        System.out.printf("São %d horas.\n", time.getHour());
        System.out.printf("São %d horas.\n\n", time2.getHour());
        System.out.printf("Horas em segundos: %d\n", time.horasEmSegundos());
        System.out.printf("Horas em segundos: %d\n", time2.horasEmSegundos());
        System.out.printf("Valor: %b\n", time.setTime2(10, 20, 30));
        System.out.printf("Valor: %b\n", time2.setTime2(40, 20, 30));
    }
}