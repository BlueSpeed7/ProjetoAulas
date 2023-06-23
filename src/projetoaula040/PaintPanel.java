// @author RA21600867
package projetoaula040;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
public class PaintPanel extends JPanel {
    private Color c;
    private int ctPonto = 0, red, green, blue;
    private Point[] points = new Point[10000];
    public PaintPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                if (event.isMetaDown()) {
                    red ++;
                    if (red >= 256) {
                        red = 0;
                    }
                }
                else {
                    if (event.isAltDown()) {
                        green ++;
                        if (green >= 256) {
                            green = 0;
                        }
                    }
                    else {
                        blue ++;
                        if (blue >= 256) {
                            blue = 0;
                        }
                    }
                }
                c = new Color(red, green, blue);
                if (ctPonto < points.length) {
                    points[ctPonto] = event.getPoint();
                    ctPonto ++;
                    repaint();
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent event) {
                ctPonto = 0;
                repaint();
            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        for (int i = 0; i < ctPonto; i ++) {
            g.fillOval(points[i].x, points[i].y, 7, 7);
        }
        mostraVetor();
    }
    public void mostraVetor() {
        System.out.println("Pontos do drag:");
        for (int i = 0; i < ctPonto; i ++) {
            System.out.printf("%d - %d - %d\n", i, points[i].x, points[i].y);
        }
        System.out.println("--------------");
    }
}