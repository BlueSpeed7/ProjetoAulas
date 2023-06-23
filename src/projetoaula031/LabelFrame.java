// @author RA21600867
package projetoaula031;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class LabelFrame extends JFrame {
    private JLabel lb1, lb2, lb3;
    public LabelFrame() {
        super("Testing JLabel");
        criaJanela();
    }
    public LabelFrame(String s) {
        super(s);
        criaJanela();
    }
    public void criaJanela() {
        setLayout(null);
        lb1 = new JLabel("Label with text");
        lb1.setToolTipText("This is label 1");
        lb1.setBounds(60, 10, 120, 20);
        add(lb1);
        Icon bug = new ImageIcon(getClass().getResource("bug1.gif"));
        lb2 = new JLabel("Label with text and icon", bug, SwingConstants.RIGHT);
        lb2.setToolTipText("This is label 2");
        lb2.setBounds(10, 30, 180, 50);
        add(lb2);
        lb3 = new JLabel();
        lb3.setText("Label with icon and text at left");
        lb3.setIcon(bug);
        lb3.setHorizontalTextPosition(SwingConstants.LEFT);
        lb3.setVerticalTextPosition(SwingConstants.CENTER);
        lb3.setToolTipText("This is label 3");
        lb3.setBounds(20, 80, 250, 50);
        add(lb3);
    }
}