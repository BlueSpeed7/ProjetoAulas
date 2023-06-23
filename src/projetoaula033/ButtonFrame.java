// @author RA21600867
package projetoaula033;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ButtonFrame extends JFrame {
    private JButton btPlain, btFancy, btIcon;
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        btPlain = new JButton("Plain Button");
        btPlain.setToolTipText("This is plain button.");
        btPlain.setBounds(20, 20, 120, 40);
        add(btPlain);
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif")), bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        btFancy = new JButton("Fancy Button", bug1);
        btFancy.setRolloverIcon(bug2);
        btFancy.setToolTipText("This is fancy button.");
        btFancy.setBounds(150, 15, 120, 50);
        add(btFancy);
        btIcon = new JButton();
        btIcon.setIcon(bug1);
        btIcon.setPressedIcon(bug2);
        btIcon.setToolTipText("This is icon button.");
        btIcon.setBounds(120, 80, 50, 50);
        add(btIcon);
        ButtonHandler handler = new ButtonHandler();
        btPlain.addActionListener(handler);
        btFancy.addActionListener(handler);
        btIcon.addActionListener(handler);
    }
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btPlain) {
                JOptionPane.showMessageDialog(null, "Botão 1 acionado.", "Botão 1", JOptionPane.INFORMATION_MESSAGE);
            }
            if (event.getSource() == btFancy) {
                JOptionPane.showMessageDialog(null, "Botão 2 acionado.", "Botão 2", JOptionPane.INFORMATION_MESSAGE);
            }
            if (event.getSource() == btIcon) {
                JOptionPane.showMessageDialog(null, "Botão 3 acionado.", "Botão 3", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}