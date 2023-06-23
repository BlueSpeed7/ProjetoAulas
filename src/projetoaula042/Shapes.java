// @author RA21600867
package projetoaula042;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class Shapes extends JPanel {
    private Color c;
    private String corS, xS, yS, wS, hS, ctS;
    private int choice, x, y, w, h, ct;
    public Shapes(int userChoice) {
        choice = userChoice;
        corS = JOptionPane.showInputDialog("Cor:\n1 - Azul\n2 - Vermelho");
        xS = JOptionPane.showInputDialog("Valor de x:");
        yS = JOptionPane.showInputDialog("Valor de y:");
        wS = JOptionPane.showInputDialog("Largura:");
        hS = JOptionPane.showInputDialog("Altura:");
        ctS = JOptionPane.showInputDialog("Quantidade de repetições:");
        x = Integer.parseInt(xS);
        y = Integer.parseInt(yS);
        w = Integer.parseInt(wS);
        h = Integer.parseInt(hS);
        ct = Integer.parseInt(ctS);
        if (Integer.parseInt(corS) == 1) {
            c = Color.BLUE;
        }
        else {
            if (Integer.parseInt(corS) == 2) {
                c = Color.RED;
            }
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        switch (choice) {
            case 1:
                for (int i = 0; i < ct; i ++) {
                    g.drawRect(x + (i * 10), y + (i * 10), w + (i * 10), h + (i * 10));
                }
                break;
            case 2:
                for (int i = 0; i < ct; i ++) {
                    g.drawOval(x + (i * 10), y + (i * 10), w + (i * 10), h + (i * 10));
                }
                break;
        }
    }
}