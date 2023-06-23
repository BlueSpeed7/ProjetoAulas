// @author RA21600867
package projetoaula034;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
public class CheckBoxFrame2 extends JFrame {
    private JLabel title;
    private JCheckBox ch1, ch2, ch3;
    private JButton btBuy, btCancel;
    public CheckBoxFrame2() {
        super("Bilheteria");
        setLayout(new FlowLayout());
        title = new JLabel("Compra de Ingressos");
        add(title);
        ch1 = new JCheckBox("Brasil x África do Sul - R$ 200,00");
        add(ch1);
        ch2 = new JCheckBox("Brasil x Iraque - R$ 180,00");
        add(ch2);
        ch3 = new JCheckBox("Brasil x Dinamarca - R$ 220,00");
        add(ch3);
        btBuy = new JButton("Comprar");
        add(btBuy);
        btCancel = new JButton("Cancelar");
        add(btCancel);
        CheckBoxHandler2 handler = new CheckBoxHandler2();
        btBuy.addActionListener(handler);
        btCancel.addActionListener(handler);
        ch1.addItemListener(handler);
        ch2.addItemListener(handler);
        ch3.addItemListener(handler);
    }
    private class CheckBoxHandler2 implements ActionListener, ItemListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String s = "";
            double total = 0;
            if (event.getSource() == btBuy) {
                if (ch1.isSelected()) {
                    s += ch1.getText() + "\n";
                    total += 200;
                }
                if (ch2.isSelected()) {
                    s += ch2.getText() + "\n";
                    total += 180;
                }
                if (ch3.isSelected()) {
                    s += ch3.getText() + "\n";
                    total += 220;
                }
                if (total == 0) {
                    JOptionPane.showMessageDialog(btBuy, "Escolha pelo menos 1 jogo.");
                }
                else {
                    JOptionPane.showMessageDialog(btBuy, String.format("%sTotal: R$ %,.2f", s, total));
                    ch1.setSelected(false);
                    ch2.setSelected(false);
                    ch3.setSelected(false);
                }
            }
            else {
                if (event.getSource() == btCancel) {
                    JOptionPane.showMessageDialog(btCancel, "Compra cancelada.");
                    ch1.setSelected(false);
                    ch2.setSelected(false);
                    ch3.setSelected(false);
                }
            }
        }
        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getSource() == ch1) {
                if (ch1.isSelected()) {
                    System.out.println("Você selecionou jogo 1.");
                }
            }
            if (event.getSource() == ch2) {
                if (ch2.isSelected()) {
                    System.out.println("Você selecionou jogo 2.");
                }
            }
            if (event.getSource() == ch3) {
                if (ch3.isSelected()) {
                    System.out.println("Você selecionou jogo 3.");
                }
            }
        }
    }
}