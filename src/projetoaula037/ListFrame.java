// @author RA21600867
package projetoaula037;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
public class ListFrame extends JFrame {
    private JLabel lb1, lbMsg, lbPosicao;
    private JList ltColor;
    private final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    public ListFrame() {
        super("JList Testando");
        setLayout(new FlowLayout());
        lb1 = new JLabel("JLabel com JList");
        add(lb1);
        ltColor = new JList(colorNames);
        ltColor.setVisibleRowCount(5);
        ltColor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(ltColor));
        lbMsg = new JLabel("Cor escolhida:");
        add(lbMsg);
        lbPosicao = new JLabel("Posição da cor escolhida:");
        add(lbPosicao);
        ltColor.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(colors[ltColor.getSelectedIndex()]);
                lbMsg.setText(String.format("Cor escolhida: %s", ltColor.getSelectedValue()));
                lbPosicao.setText(String.format("Posição da cor escolhida: %d", ltColor.getSelectedIndex() + 1));
                if (colors[ltColor.getSelectedIndex()] == Color.BLACK) {
                    lb1.setForeground(Color.RED);
                    lbMsg.setForeground(Color.RED);
                    lbPosicao.setForeground(Color.RED);
                }
                else {
                    if (colors[ltColor.getSelectedIndex()] == Color.DARK_GRAY) {
                        lb1.setForeground(Color.YELLOW);
                        lbMsg.setForeground(Color.YELLOW);
                        lbPosicao.setForeground(Color.YELLOW);
                    }
                    else {
                        lb1.setForeground(Color.BLACK);
                        lbMsg.setForeground(Color.BLACK);
                        lbPosicao.setForeground(Color.BLACK);
                    }
                }
                
            }
        });
    }
}