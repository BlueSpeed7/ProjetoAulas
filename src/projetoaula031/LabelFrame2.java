// @author RA21600867
package projetoaula031;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class LabelFrame2 extends JFrame {
    private JLabel lb1, lb2, lb3;
    public LabelFrame2() {
        super("Aula de JLabel");
        setLayout(new BorderLayout());
        lb1 = new JLabel("UniCEUB", SwingConstants.CENTER);
        lb1.setToolTipText("This is label 1");
        add(lb1, BorderLayout.NORTH);
        Icon bug = new ImageIcon(getClass().getResource("bug1.gif"));
        lb2 = new JLabel(JOptionPane.showInputDialog(null, "Digite o nome do label 2", "Label 2", JOptionPane.INFORMATION_MESSAGE), SwingConstants.CENTER);
        lb2.setToolTipText("This is label 2");
        lb2.setHorizontalTextPosition(SwingConstants.CENTER);
        add(lb2, BorderLayout.CENTER);
        lb3 = new JLabel("Fernando Marinho", bug, SwingConstants.CENTER);
        lb3.setToolTipText("This is label 3");
        lb3.setHorizontalTextPosition(SwingConstants.CENTER);
        lb3.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(lb3, BorderLayout.SOUTH);
    }
}