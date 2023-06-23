// @author RA21600867
package projetoaula035;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class RadioButtonFrame extends JFrame {
    private JTextField txTexto;
    private Font ftPlain, ftBold, ftItalic, ftBoldItalic;
    private JRadioButton rbPlain, rbBold, rbItalic, rbBoldItalic;
    private ButtonGroup bgManager;
    public RadioButtonFrame() {
        super("JRadioButton Teste");
        setLayout(new FlowLayout());
        txTexto = new JTextField("Watch the font style change", 25);
        add(txTexto);
        rbPlain = new JRadioButton("Plain", true);
        rbBold = new JRadioButton("Bold");
        rbItalic = new JRadioButton("Italic", false);
        rbBoldItalic = new JRadioButton("Bold/Italic");
        add(rbPlain);
        add(rbBold);
        add(rbItalic);
        add(rbBoldItalic);
        bgManager = new ButtonGroup();
        bgManager.add(rbPlain);
        bgManager.add(rbBold);
        bgManager.add(rbItalic);
        bgManager.add(rbBoldItalic);
        ftPlain = new Font("Serif", Font.PLAIN, 14);
        ftBold = new Font("Serif", Font.BOLD, 14);
        ftItalic = new Font("Serif", Font.ITALIC, 14);
        ftBoldItalic = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        txTexto.setFont(ftPlain);
        rbPlain.addItemListener(new RadioButtonHandler(ftPlain));
        rbBold.addItemListener(new RadioButtonHandler(ftBold));
        rbItalic.addItemListener(new RadioButtonHandler(ftItalic));
        rbBoldItalic.addItemListener(new RadioButtonHandler(ftBoldItalic));
    }
    private class RadioButtonHandler implements ItemListener {
        private Font font;
        public RadioButtonHandler(Font f) {
            font = f;
        }
        @Override
        public void itemStateChanged(ItemEvent event) {
            txTexto.setFont(font);
        }
    }
}