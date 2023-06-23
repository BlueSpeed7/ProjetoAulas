// @author RA21600867
package projetoaula033;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
public class ButtonFrame2 extends JFrame {
    private JLabel title, name;
    private JButton btSave, btCancel, btExit;
    private JTextField txField;
    public ButtonFrame2() {
        super("Aula de JButton");
        setLayout(null);
        title = new JLabel("Cadastro");
        title.setToolTipText("Título");
        title.setBounds(110, 10, 60, 20);
        add(title);
        name = new JLabel("Nome:");
        name.setToolTipText("Nome");
        name.setBounds(49, 60, 40, 20);
        add(name);
        txField = new JTextField();
        txField.setToolTipText("Data");
        txField.setBounds(90, 61, 100, 20);
        add(txField);
        btSave = new JButton("Gravar");
        btSave.setToolTipText("Save the data.");
        btSave.setBounds(10, 90, 80, 30);
        add(btSave);
        btCancel = new JButton("Cancelar");
        btCancel.setToolTipText("Erase the data.");
        btCancel.setBounds(95, 90, 90, 30);
        add(btCancel);
        btExit = new JButton("Sair");
        btExit.setToolTipText("Exit the application.");
        btExit.setBounds(190, 90, 80, 30);
        add(btExit);
        ButtonHandler2 handler = new ButtonHandler2();
        btSave.addActionListener(handler);
        btCancel.addActionListener(handler);
        btExit.addActionListener(handler);
    }
    private class ButtonHandler2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btSave) {
                JOptionPane.showMessageDialog(null, String.format("Você clicou %s", event.getActionCommand()));
                if (!txField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, String.format("Dados gravados com sucesso.\nTexto: %s", txField.getText()));
                    txField.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, String.format("Campo obrigatório, digite seu nome."));
                }
            }
            if (event.getSource() == btCancel) {
                JOptionPane.showMessageDialog(null, String.format("Você clicou %s", event.getActionCommand()));
                JOptionPane.showMessageDialog(null, String.format("Dados não foram gravados."));
                txField.setText("");
            }
            if (event.getSource() == btExit) {
                JOptionPane.showMessageDialog(null, String.format("Você clicou %s.", event.getActionCommand()));
                System.exit(0);
            }
        }
    }
}