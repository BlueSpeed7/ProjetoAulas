// @author RA21600867
package projetoaula042;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest {
    public static void main(String[] args) {
        String opcaoS = JOptionPane.showInputDialog("Opções:\n1 para desenhar retângulo\n2 para desenhar oval");
        try {
            int opcao = Integer.parseInt(opcaoS);
            JFrame application = new JFrame();
            Shapes panel = new Shapes(opcao);
            application.add(panel);
            application.setSize(600, 600);
            application.setResizable(false);
            application.setLocationRelativeTo(null);
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.setVisible(true);
        }
        catch (NumberFormatException exception) {
            exception.printStackTrace();
        }
    }
}