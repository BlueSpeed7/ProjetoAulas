// @author RA21600867
package projetoaula041;
import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        DrawPanel panel = new DrawPanel();
        application.add(panel);
        application.setSize(250, 250);
        application.setResizable(false);
        application.setLocationRelativeTo(null);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
        panel.setPositions();
        System.out.printf("Largura: %d\nAltura: %d\n", panel.getWidth(), panel.getHeight());
    }
}