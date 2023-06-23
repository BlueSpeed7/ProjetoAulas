// @author RA21600867
package projetoaula043;
import java.lang.String;
import javax.swing.JOptionPane;
public class StringConstructors {
    public static void main(String[] args) {
        int index = 0, ct;
        do {
            try {
                char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
                String s = new String("Hello"), s1 = "", s2 = s, s3 = new String(charArray), s4 = new String(charArray, 6, 3);
                String indexS = JOptionPane.showInputDialog("Posição inicial:");
                if (indexS == null) {
                    System.exit(0);
                }
                String ctS = JOptionPane.showInputDialog("Quantidade:");
                if (ctS == null) {
                    System.exit(0);
                }
                index = Integer.parseInt(indexS);
                ct = Integer.parseInt(ctS);
                String s5 = new String(charArray, index, ct);
                System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\ns5 = %s\n", s1, s2, s3, s4, s5);
            }
            catch (StringIndexOutOfBoundsException | NumberFormatException exception) {
                exception.printStackTrace();
            }
        }
        while (index != -1);
    }
}