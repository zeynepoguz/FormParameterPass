package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    private JButton button;
    private static JLabel l;

    public Form1(){
        button = new JButton();
        button.setText("Click");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(button);
        MyEHandler eHandler = new MyEHandler();
        button.addActionListener(eHandler);
    }

    public static void recevieLabel(JLabel _label){
        l = _label;
    }


    public class MyEHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){
            if (e.getSource() == button){
                l.setText("ZEYNEEP");
            }
        }

    }



}
