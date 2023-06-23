// @author RA21600867
package projetoaula032;
import javax.swing.JFrame;
public class TextFieldTest {
    public static void main(String[] args) {
        TextFieldFrame objeto = new TextFieldFrame("Meu título");
        objeto.setSize(350, 150);
        objeto.setLocationRelativeTo(null);
        objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objeto.setVisible(true);
    }
}