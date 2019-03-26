import java.io.*;
import java.awt.*;
import java.awt.event.*;
class cutExample extends Frame implements ActionListener
{
TextField t1,t2;
Button b1;
cutExample()
{
setLayout(new FlowLayout());
t1=new TextField("nitap",20);
t2=new TextField(20);
b1=new Button("cut");
add(t1);
add(t2);
add(b1);
b1.addActionListener(this);
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public void actionPerformed(ActionEvent e)
{
if(b1==e.getSource())
{
String s=t1.getText();
t2.setText(s);
t1.setText(" ");
}
}

public static void main(String args[])
{
cutExample c=new cutExample();
c.setSize(300,300);
c.setVisible(true);
c.setTitle("cut");
}
}

