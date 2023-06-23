// @author RA21600867
package projetoaula034;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class CheckBoxFrame extends JFrame {
    private JTextField txTexto;
    private JCheckBox chBold, chItalic, ch10, ch18;
    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        txTexto = new JTextField("Watch the font style change", 20);
        txTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(txTexto);
        chBold = new JCheckBox("Bold");
        add(chBold);
        chItalic = new JCheckBox("Italic");
        add(chItalic);
        ch10 = new JCheckBox("Size 10");
        add(ch10);
        ch18 = new JCheckBox("Size 18");
        add(ch18);
        CheckBoxHandler handler = new CheckBoxHandler();
        chBold.addItemListener(handler);
        chItalic.addItemListener(handler);
        ch10.addItemListener(handler);
        ch18.addItemListener(handler);
    }
    private class CheckBoxHandler implements ItemListener {
        private int valBold = Font.PLAIN, valItalic = Font.PLAIN, fontSize = 14;
        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getSource() == chBold) {
                valBold = chBold.isSelected()? Font.BOLD: Font.PLAIN;
            }
            if (event.getSource() == chItalic) {
                valItalic = chItalic.isSelected()? Font.ITALIC: Font.PLAIN;
            }
            if (event.getSource() == ch10 || event.getSource() == ch18) {
                if (ch10.isSelected() == true && ch18.isSelected() == true) {
                    fontSize = 14;
                    ch10.setSelected(false);
                    ch18.setSelected(false);
                }
                else {
                    if (ch10.isSelected()) {
                        fontSize = 10;
                    }
                    else {
                        if (ch18.isSelected()) {
                            fontSize = 18;
                        }
                        else {
                            fontSize = 14;
                        }
                    }
                }
            }
            txTexto.setFont(new Font("Serif", valBold + valItalic, fontSize));
        }
    }
}