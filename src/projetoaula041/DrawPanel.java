// @author RA21600867
package projetoaula041;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class DrawPanel extends JPanel {
    private JLabel lb1, lb2;
    private int ct = 0, x1, x2, y1, y2;
    private boolean draw, draw1 = false, draw2 = false;
    public DrawPanel() {
        setLayout(null);
        lb1 = new JLabel();
        lb1.setBounds(30, 10, 75, 20);
        add(lb1);
        lb2 = new JLabel();
        lb2.setBounds(30, 100, 65, 20);
        add(lb2);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if (ct == 0) {
                    x1 = event.getX();
                    y1 = event.getY();
                    draw1 = true;
                    ct ++;
                }
                else {
                    x2 = event.getX();
                    y2 = event.getY();
                    draw2 = true;
                    ct = 0;
                }
                if (draw1 == true && draw2 == true) {
                    draw = true;
                }
                else {
                    draw = false;
                }
                repaint();
            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawLine(0, getHeight(), getWidth(), 0);
        g.setColor(Color.RED);
        g.drawLine(45, 60, 200, 60);
        g.drawLine(122, 11, 122, 211);
        if (draw) {
            g.setColor(Color.BLUE);
            g.drawLine(x1, y1, x2, y2);
            draw1 = false;
            draw2 = false;
        }
    }
    public void setPositions() {
        lb1.setText(String.format("Largura: %d", getWidth()));
        lb2.setText(String.format("Altura: %d", getHeight()));
    }
}