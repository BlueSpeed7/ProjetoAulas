// @author RA21600867
package projetoaula032;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class TextFieldFrame extends JFrame {
    private JLabel lb1;
    private JTextField tx1, tx2, tx3;
    private JPasswordField pw;
    public TextFieldFrame() {
        super("Testing JTextField and JPassword Field");
        criaJanela();
    }
    public TextFieldFrame(String s) {
        super(s);
        criaJanela();
    }
    public void criaJanela() {
        setLayout(null);
        lb1 = new JLabel("UniCEUB");
        lb1.setBounds(5, 5, 50, 20);
        add(lb1);
        tx1 = new JTextField(10);
        tx1.setToolTipText("Texto com dicas do componente");
        tx1.setBounds(120, 10, 85, 20);
        add(tx1);
        tx2 = new JTextField("Enter text here");
        tx2.setBounds(120, 30, 85, 20);
        add(tx2);
        tx3 = new JTextField("Uneditable text field", 21);
        tx3.setEditable(false);
        tx3.setBounds(105, 50, 115, 20);
        add(tx3);
        pw = new JPasswordField("Hidden text");
        pw.setBounds(120, 70, 85, 20);
        add(pw);
        TextFieldHandler handler = new TextFieldHandler();
        tx1.addActionListener(handler);
        tx2.addActionListener(handler);
        tx3.addActionListener(handler);
        pw.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String mensagem = "";
            if (event.getSource() == tx1) {
                mensagem = String.format("Texto no campo 1: %s", event.getActionCommand());
            }
            if (event.getSource() == tx2) {
                mensagem = String.format("Texto no campo 2: %s", event.getActionCommand());
            }
            if (event.getSource() == tx3) {
                mensagem = String.format("Texto no campo 3: %s", event.getActionCommand());
            }
            if (event.getSource() == pw) {
                mensagem = String.format("Texto da senha: %s", new String(pw.getPassword()));
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}