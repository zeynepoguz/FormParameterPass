package Forms;

import javax.swing.*;

public class TestForm {
    public static void main(String[] args) {

        Form2 form2 = new Form2();
        form2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form2.setVisible(true);
        form2.setSize(200,135);
        form2.setLocation(800,500);

        Form1 form1 = new Form1();
        form1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form1.setSize(200,135);
        form1.setVisible(true);
        form1.setLocation(500,500);

    }
}
