// @author RA21600867
package projetoaula035;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class RadioButtonFrame2 extends JFrame {
    private Calendar cal = Calendar.getInstance();
    private int day = cal.get(Calendar.DATE), month = cal.get(Calendar.MONTH) + 1, year = cal.get(Calendar.YEAR), dow = cal.get(Calendar.DAY_OF_WEEK), dom = cal.get(Calendar.DAY_OF_MONTH), doy = cal.get(Calendar.DAY_OF_YEAR);
    private JLabel anoNascimento, sexo;
    private JTextField nascimento;
    private JRadioButton male, female;
    private JButton btSave, btClear;
    private ButtonGroup bg;
    public RadioButtonFrame2() {
        super("Aula de JRadioButton");
        setLayout(null);
        anoNascimento = new JLabel("Ano de Nascimento:");
        anoNascimento.setBounds(5, 20, 120, 20);
        add(anoNascimento);
        sexo = new JLabel("Sexo:");
        sexo.setBounds(4, 40, 35, 20);
        add(sexo);
        nascimento = new JTextField();
        nascimento.setBounds(121, 19, 80, 20);
        add(nascimento);
        male = new JRadioButton("Masculino");
        male.setBounds(37, 40, 85, 20);
        add(male);
        female = new JRadioButton("Feminino");
        female.setBounds(120, 40, 80, 20);
        add(female);
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        btSave = new JButton("Gravar");
        btSave.setBounds(35, 80, 80, 20);
        add(btSave);
        btClear = new JButton("Limpar");
        btClear.setBounds(130, 80, 80, 20);
        add(btClear);
        ButtonHandler handler = new ButtonHandler();
        btSave.addActionListener(handler);
        btClear.addActionListener(handler);
        System.out.printf("Current date: %s\nDay: %s\nMonth: %s\nYear: %s\nDay of Week: %s\nDay of Month: %s\nDay of Year: %s\n", cal.getTime(), day, month, year, dow, dom, doy);
    }
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btSave) {
                String nasc = nascimento.getText(), sex;
                if (nascimento.getText().equals("")) {
                    JOptionPane.showMessageDialog(btSave, "Campo obrigatório, digite o ano de nascimento.");
                }
                else {
                    try {
                        int ano = Integer.parseInt(nasc), idade = cal.get(Calendar.YEAR) - ano;
                        if (male.isSelected()) {
                            sex = "masculino";
                            JOptionPane.showMessageDialog(btSave, String.format("Pessoa do sexo %s com %s anos.", sex, idade));
                        }
                        else {
                            if (female.isSelected()) {
                                sex = "feminino";
                                JOptionPane.showMessageDialog(btSave, String.format("Pessoa do sexo %s com %s anos.", sex, idade));
                            }
                            else {
                                JOptionPane.showMessageDialog(btSave, "Sexo obrigatório, selecione uma das opções.");
                            }
                        }
                    }
                    catch (NumberFormatException exception) {
                        JOptionPane.showMessageDialog(btSave, exception);
                    }
                }
            }
            else {
                if (event.getSource() == btClear) {
                    nascimento.setText("");
                    bg.clearSelection();
                }
            }
        }
    }
}