// @author RA21600867
package projetoaula046;
public class RegEx {
    public static boolean validaEntrada(String entrada) {
        boolean b = entrada.matches("\\S");
        return b;
    }
}