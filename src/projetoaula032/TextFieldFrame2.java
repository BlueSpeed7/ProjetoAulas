// @author RA21600867
package projetoaula032;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TextFieldFrame2 extends JFrame {
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField tx;
    private JPasswordField pw;
    public TextFieldFrame2(String s) {
        super(s);
        criaJanela();
    }
    public void criaJanela() {
        setLayout(null);
        lb1 = new JLabel("Usuário:");
        lb1.setBounds(10, 10, 80, 20);
        add(lb1);
        tx = new JTextField();
        tx.setBounds(65, 10, 80, 20);
        add(tx);
        lb2 = new JLabel("Senha:");
        lb2.setBounds(15, 35, 80, 20);
        add(lb2);
        pw = new JPasswordField();
        pw.setBounds(65, 35, 80, 20);
        add(pw);
        Icon bug1 = new ImageIcon(getClass().getResource("./imagem1/bug1.gif")), bug2 = new ImageIcon(getClass().getResource("./imagem2/bug2.gif"));
        lb3 = new JLabel(bug1);
        lb3.setBounds(30, 60, 50, 50);
        add(lb3);
        lb4 = new JLabel(bug2);
        lb4.setBounds(90, 60, 50, 50);
        add(lb4);
        TextFieldHandler2 handler = new TextFieldHandler2();
        pw.addActionListener(handler);
    }
    private class TextFieldHandler2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String mensagem = "";
            if (tx.getText().equalsIgnoreCase("Carlos")) {
                if (event.getSource() == pw) {
                    if (event.getActionCommand().equals("123")) {
                        mensagem = String.format("Bem-vindo Carlos.\nAcesso liberado.");
                    }
                    else {
                        if (event.getActionCommand().isEmpty()) {
                            mensagem = String.format("Senha em branco.");
                        }
                        else {
                            mensagem = String.format("Senha incorreta.");
                        }
                    }
                }
            }
            else {
                if (tx.getText().equalsIgnoreCase("Pedro")) {
                    if (event.getSource() == pw) {
                        if (event.getActionCommand().equals("123")) {
                            mensagem = String.format("Bem-vindo Pedro.\nAcesso liberado.");
                        }
                        else {
                            if (event.getActionCommand().isEmpty()) {
                                mensagem = String.format("Senha em branco.");
                            }
                            else {
                                mensagem = String.format("Senha incorreta.");
                            }
                        }
                    }
                }
                else {
                    if (tx.getText().isEmpty()) {
                        mensagem = String.format("Usuário em branco.");
                    }
                    else {
                        mensagem = String.format("Usuário inválido.");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}