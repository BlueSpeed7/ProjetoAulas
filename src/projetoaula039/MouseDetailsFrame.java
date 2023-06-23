// @author RA21600867
package projetoaula039;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class MouseDetailsFrame extends JFrame {
    private String details;
    private JPanel pnMouse;
    private JLabel lbStatusBar, lbNorth;
    private int ct = 0;
    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");
        setLayout(new BorderLayout());
        pnMouse = new JPanel();
        pnMouse.setBackground(Color.RED);
        add(pnMouse, BorderLayout.CENTER);
        lbStatusBar = new JLabel("Click the mouse");
        add(lbStatusBar, BorderLayout.SOUTH);
        lbNorth = new JLabel(String.format("<html>Coordenadas de click the mouse<br>Contagem total: %d</html>", ct));
        add(lbNorth, BorderLayout.NORTH);
        MouseClickHandler handler = new MouseClickHandler();
        pnMouse.addMouseListener(handler);
        pnMouse.addMouseMotionListener(handler);
    }
    private class MouseClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent event) {
            details = String.format("Clicked %d time(s)", event.getClickCount());
            ct ++;
            lbNorth.setText(String.format("<html>Coordenadas de click the mouse [%d, %d]<br>Contagem total: %d</html>", event.getX(), event.getY(), ct));
            if (event.isMetaDown()) {
                details += " with right mouse button";
            }
            else {
                if (event.isAltDown()) {
                    details += " with center mouse button";
                }
                else {
                    details += " with left mouse button";
                }
            }
            lbStatusBar.setText(details);
        }
        @Override
        public void mouseEntered(MouseEvent event) {
            pnMouse.setBackground(Color.GREEN);
            lbNorth.setText(String.format("<html>Coordenadas de click the mouse<br>Contagem total: %d</html>", ct));
        }
        @Override
        public void mouseExited(MouseEvent event) {
            pnMouse.setBackground(Color.BLUE);
            ct = 0;
            lbNorth.setText(String.format("<html>Coordenadas de click the mouse<br>Contagem total: %d</html>", ct));
            lbStatusBar.setText("Click the mouse");
        }
        @Override
        public void mouseDragged(MouseEvent event) {
            lbNorth.setText(String.format("Arrastando o mouse [%d, %d]", event.getX(), event.getY()));
            lbStatusBar.setText("Click the mouse");
        }
    }
}