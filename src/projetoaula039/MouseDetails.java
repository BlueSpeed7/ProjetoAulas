// @author RA21600867
package projetoaula039;
import javax.swing.JFrame;
public class MouseDetails {
    public static void main(String[] args) {
        MouseDetailsFrame objeto = new MouseDetailsFrame();
        objeto.setSize(400, 150);
        objeto.setResizable(false);
        objeto.setLocationRelativeTo(null);
        objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objeto.setVisible(true);
    }
}