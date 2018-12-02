# FormParameterPass
Using JFrame pass parameter one to another form
<p>
<code>
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
</code>
</p>
<p>
  First we create 2 Forms in main method. 

With these lines; </br>
<code>
  Form2 form2 = new Form2();
</code></br>
<code>
  Form1 form1 = new Form1();
</code></br></br>
Then, we set some of properties<ul>
  <li>CloseOperation</li>
  <li>Visibility</li>
  <li>Size</li>
  <li>Location</li>
 </ul>

In Form1 class we have a button.</br>
<code>private JButton button;</code>
In Form2 class we have a label.
<code>private JLabel label;</code>

This program <strong>changes</strong> the label in <b>Form2</b> when the button is <i>clicked</i>.

To do this we have to send the address of JLabel object address rather than creating a new object.</br>

<del><code>new Form2 = new Form2();</code></del>
<hr>
<code>
  public static void main(String[] args) {
  
        Form2 form2 = new Form2();
        ...
        ...
  }
</code> 

When Form2 created in main with <b>new</b> and Constructor is called <b>Form2()</b>. In Constructor the method is also called;</br>
<code>Form1.recevieLabel(label);</code>
</br>
As you can see we accessed the method with class name which is <b>Form1</b></br>
So, it is a <strong>static</strong> method.</br>
<i>Using a static method provides us that we can use the method <b>without creating an object</b>.</i>
<hr>

<code>
  public class Form1 extends JFrame {

    private static JLabel l;
    .
    .
    
    public static void recevieLabel(JLabel _label){
        l = _label;
    }
    .
    .
    .
 }

</code>
</br>

In Form1 class we <b>do not</b> create a JLabel object, we just assign l <b>pointer</b> with received object <b>_label</b>.</br>
Next, when button is clicked <code>actionPerformed</code> method is called.</br>
<p>
<code>
  public void actionPerformed(ActionEvent e){
            
            if (e.getSource() == button){
                l.setText("ZEYNEEP");
            }
        }
  </code>
</p>
<p>
In this method we change the text of the label , using <i><b>setText</b></i> , that is an object of Form2.
</p>
<p>
  <b>NOTE:</b> <code> public class MyEHandler implements ActionListener </code> is an <i><b>inner</b></i> class.
  This means that <i>MyEHandler</i> class has an access all members and methods of <b>Form1</b>.(<i>Including <b>private</b> members !</i>) 
  </p>
  
<i>Any questions : zeynepoguz16@gmail.com , Have a nice day!</i> 
