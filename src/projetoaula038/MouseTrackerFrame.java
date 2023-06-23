// @author RA21600867
package projetoaula038;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;
public class MouseTrackerFrame extends JFrame {
    private JPanel pnMouse;
    private JLabel lbStatusBar, lbNorth, lbWest, lbEast;
    private String linha1, linha2, linha3;
    private Random sorteio = new Random();
    private Color cor;
    private int posX, posY, ct = 0, r = 0, g = 0, b = 0;
    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");
        setLayout(new BorderLayout());
        pnMouse = new JPanel();
        pnMouse.setBackground(Color.WHITE);
        add(pnMouse, BorderLayout.CENTER);
        lbStatusBar = new JLabel("Mouse outside JPanel");
        add(lbStatusBar, BorderLayout.SOUTH);
        lbNorth = new JLabel("JLabel na região North");
        add(lbNorth, BorderLayout.NORTH);
        lbWest = new JLabel("<html>W<br>e<br>s<br>t</html>");
        add(lbWest, BorderLayout.WEST);
        lbEast = new JLabel("East");
        add(lbEast, BorderLayout.EAST);
        MouseHandler handler = new MouseHandler();
        pnMouse.addMouseListener(handler);
        pnMouse.addMouseMotionListener(handler);
    }
    public void startGame() {
        posX = sorteio.nextInt(pnMouse.getWidth());
        posY = sorteio.nextInt(pnMouse.getHeight());
    }
    private class MouseHandler implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent event) {
            ct ++;
            lbStatusBar.setText(String.format("Clicked at [%d, %d]", event.getX(), event.getY()));
            if (event.getX() < posX) {
                linha2 = "Mova para a direita.";
            }
            else {
                if (event.getX() > posX) {
                    linha2 = "Mova para a esquerda.";
                }
                else {
                    linha2 = "Acertou a coluna.";
                }
            }
            if (event.getY() < posY) {
                linha3 = String.format("Mova para baixo. Tentativa: %d", ct);
            }
            else {
                if (event.getY() > posY) {
                    linha3 = String.format("Mova para cima. Tentativa: %d", ct);
                }
                else {
                    linha3 = String.format("Acertou a linha. Tentativa: %d", ct);
                }
            }
            if (event.getX() == posX && event.getY() == posY) {
                ct = 0;
            }
            lbNorth.setText(String.format("<html>%s<br>%s<br>%s</html>", linha1, linha2, linha3));
        }
        @Override
        public void mousePressed(MouseEvent event) {
            lbStatusBar.setText(String.format("Pressed at [%d, %d]", event.getX(), event.getY()));
        }
        @Override
        public void mouseReleased(MouseEvent event) {
            lbStatusBar.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));
        }
        @Override
        public void mouseEntered(MouseEvent event) {
            lbStatusBar.setText(String.format("Mouse entered at [%d, %d]", event.getX(), event.getY()));
            linha1 = "Cursor do mouse dentro do JPanel.";
            lbNorth.setText(String.format(linha1));
            pnMouse.setBackground(Color.GREEN);
        }
        @Override
        public void mouseExited(MouseEvent event) {
            lbStatusBar.setText("Mouse outside JPanel");
            linha1 = "Cursor do mouse fora do JPanel.";
            lbNorth.setText(String.format(linha1));
            pnMouse.setBackground(Color.WHITE);
        }
        @Override
        public void mouseDragged(MouseEvent event) {
            lbStatusBar.setText(String.format("Dragged at [%d, %d]", event.getX(), event.getY()));
        }
        @Override
        public void mouseMoved(MouseEvent event) {
            lbStatusBar.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));
            r += 3;
            g += 2;
            b ++;
            if (r >= 256) {
                r = 0;
            }
            if (g >= 256) {
                g = 0;
            }
            if (b >= 256) {
                b = 0;
            }
            cor = new Color(r, g, b);
            pnMouse.setBackground(cor);
        }
    }
}