package Forms;

import javax.swing.*;
import java.awt.*;

public class Form2 extends JFrame {

    private JLabel label;

    public Form2() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        label = new JLabel();
        //Form1 e sent label //
        Form1.recevieLabel(label);
        c.add(label);
    }
}
