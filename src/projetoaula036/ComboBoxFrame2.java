// @author RA21600867
package projetoaula036;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class ComboBoxFrame2 extends JFrame {
    private JComboBox cbAlunos;
    private JLabel lbAlunos, lbNumeroAluno, lbNome, lbNota, lbResultado;
    private String[] alunos = {"Madness 44", "The Killer", "BadCat", "00Z", "Cross"};
    private int[] numeros = {1, 2, 3, 4, 5}, notas = {10, 9, 8, 0, 7};
    public ComboBoxFrame2() {
        super("Aula de JComboBox");
        setLayout(null);
        cbAlunos = new JComboBox(alunos);
        cbAlunos.setMaximumRowCount(4);
        cbAlunos.setBounds(50, 10, 100, 20);
        add(cbAlunos);
        lbAlunos = new JLabel("Alunos:");
        lbAlunos.setBounds(5, 10, 45, 20);
        add(lbAlunos);
        lbNumeroAluno = new JLabel(String.format("Número do aluno: %02d", numeros[cbAlunos.getSelectedIndex()]));
        lbNumeroAluno.setBounds(5, 30, 150, 20);
        add(lbNumeroAluno);
        lbNome = new JLabel(String.format("Nome do aluno: %s ", alunos[cbAlunos.getSelectedIndex()]));
        lbNome.setBounds(5, 50, 200, 20);
        add(lbNome);
        lbNota = new JLabel(String.format("Nota do aluno: %02d", notas[cbAlunos.getSelectedIndex()]));
        lbNota.setBounds(5, 70, 120, 20);
        add(lbNota);
        lbResultado = new JLabel("Aprovado");
        lbResultado.setBounds(5, 90, 80, 20);
        add(lbResultado);
        System.out.printf("%s\n%s\n%s\n%s\n\n", lbNumeroAluno.getText(), lbNome.getText(), lbNota.getText(), lbResultado.getText());
        cbAlunos.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    if (notas[cbAlunos.getSelectedIndex()] < 5) {
                        lbResultado.setText("Reprovado");
                    }
                    else {
                        lbResultado.setText("Aprovado");
                    }
                    lbNumeroAluno.setText(String.format("Número do aluno: %02d", numeros[cbAlunos.getSelectedIndex()]));
                    lbNome.setText(String.format("Nome do aluno: %s ", alunos[cbAlunos.getSelectedIndex()]));
                    lbNota.setText(String.format("Nota do aluno: %02d", notas[cbAlunos.getSelectedIndex()]));
                    System.out.printf("%s\n%s\n%s\n%s\n\n", lbNumeroAluno.getText(), lbNome.getText(), lbNota.getText(), lbResultado.getText());
                    JOptionPane.showMessageDialog(null, "<html>" + lbNumeroAluno.getText() + "<br>" + lbNome.getText() + "<br>" + lbNota.getText() + "<br>" + lbResultado.getText() + "</html>", "Aluno", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
    }
}