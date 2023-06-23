// @author RA21600867
package projetoaula038;
import javax.swing.JFrame;
public class MouseTracker {
    public static void main(String[] args) {
        MouseTrackerFrame objeto = new MouseTrackerFrame();
        objeto.setSize(350, 400);
        objeto.setResizable(false);
        objeto.setLocationRelativeTo(null);
        objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objeto.setVisible(true);
        objeto.startGame();
    }
}