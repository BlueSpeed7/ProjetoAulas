// @author RA21600867
package projetoaula036;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class ComboBoxFrame extends JFrame {
    private JComboBox cbImages;
    private JLabel lbIcone, lbIndice;
    private String[] names = {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private Icon[] icons = {new ImageIcon(getClass().getResource(names[0])), new ImageIcon(getClass().getResource(names[1])), new ImageIcon(getClass().getResource(names[2])), new ImageIcon(getClass().getResource(names[3]))};
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());
        cbImages = new JComboBox(names);
        cbImages.setMaximumRowCount(3);
        add(cbImages);
        lbIcone = new JLabel(icons[0]);
        add(lbIcone);
        lbIndice = new JLabel(String.format("Índice %d", (cbImages.getSelectedIndex() + 1)));
        add(lbIndice);
        cbImages.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    lbIcone.setIcon(icons[cbImages.getSelectedIndex()]);
                    lbIndice.setText(String.format("Índice %d", (cbImages.getSelectedIndex() + 1)));
                }
            }
        });
    }
}