// @author RA21600867
package projetoaula040;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Painter {
    public static void main(String[] args) {
        JFrame application = new JFrame("A simple paint program");
        PaintPanel objetoPP = new PaintPanel();
        application.add(objetoPP, BorderLayout.CENTER);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setSize(400, 200);
        application.setResizable(false);
        application.setLocationRelativeTo(null);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}