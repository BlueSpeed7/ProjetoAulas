// @author RA21600867
package projetoaula037;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
public class ListFrame2 extends JFrame {
    private JList lt;
    private JScrollPane sp;
    private JLabel lb1, lb2, lb3, lb4, lb5;
    private JButton bt;
    private final String[] alunos = {"Amanda", "Madness 44", "Fernando", "Gabriel", "Matheus", "Rebecca", "00Z"};
    private final int[] numeros = {1, 2, 3, 4, 5, 6, 7};
    private final double[] notas = {10, 0, 9, 3, 5, 4.4, 0};
    public ListFrame2() {
        super("Aula de JList");
        setLayout(null);
        lt = new JList(alunos);
        lt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sp = new JScrollPane(lt);
        sp.setBounds(15, 10, 95, 57);
        add(sp);
        lb1 = new JLabel("---Boletim do Aluno---");
        lb1.setBounds(15, 65, 120, 20);
        add(lb1);
        lb2 = new JLabel("Nome:");
        lb2.setBounds(15, 80, 180, 20);
        add(lb2);
        lb3 = new JLabel("Número:");
        lb3.setBounds(15, 95, 80, 20);
        add(lb3);
        lb4 = new JLabel("Nota:");
        lb4.setBounds(15, 110, 70, 20);
        add(lb4);
        lb5 = new JLabel();
        lb5.setBounds(15, 125, 70, 20);
        add(lb5);
        bt = new JButton("Imprimir");
        bt.setBounds(75, 145, 90, 30);
        add(bt);
        ListHandler handler = new ListHandler();
        lt.addListSelectionListener(handler);
        bt.addActionListener(handler);
    }
    private class ListHandler implements ListSelectionListener, ActionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            lb2.setText(String.format("Nome: %s", alunos[lt.getSelectedIndex()]));
            lb3.setText(String.format("Número: %02d", numeros[lt.getSelectedIndex()]));
            lb4.setText(String.format("Nota: %.1f", notas[lt.getSelectedIndex()]));
            if (notas[lt.getSelectedIndex()] >= 5) {
                lb5.setText("Aprovado");
                getContentPane().setBackground(Color.BLUE);
                lb1.setForeground(Color.WHITE);
                lb2.setForeground(Color.WHITE);
                lb3.setForeground(Color.WHITE);
                lb4.setForeground(Color.WHITE);
                lb5.setForeground(Color.WHITE);
            }
            else {
                if (notas[lt.getSelectedIndex()] > 0 && notas[lt.getSelectedIndex()] < 5) {
                    lb5.setText("Reprovado");
                    getContentPane().setBackground(Color.RED);
                    lb1.setForeground(Color.BLACK);
                    lb2.setForeground(Color.BLACK);
                    lb3.setForeground(Color.BLACK);
                    lb4.setForeground(Color.BLACK);
                    lb5.setForeground(Color.BLACK);
                }
                else {
                    lb5.setText("Reprovado");
                    getContentPane().setBackground(Color.BLACK);
                    lb1.setForeground(Color.YELLOW);
                    lb2.setForeground(Color.YELLOW);
                    lb3.setForeground(Color.YELLOW);
                    lb4.setForeground(Color.YELLOW);
                    lb5.setForeground(Color.YELLOW);
                }
            }
        }
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("<html>" + lb2.getText() + "<br>" + lb3.getText() + "<br>" + lb4.getText() + "<br>" + lb5.getText() + "</html>"));
        }
    }
}