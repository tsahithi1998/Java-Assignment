import java.io.*;
import java.awt.*;
import java.awt.event.*;
class append extends Frame implements ActionListener
{
TextField t1,t2,t3;
Button b1;
append()
{
setLayout(new FlowLayout());
t1=new TextField("nit",20);
t2=new TextField("andhra",20);
t3=new TextField(20);
b1=new Button("append");
add(t1);
add(t2);
add(t3);
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
String s2=t2.getText();
String s3=s+s2;
t3.setText(s3);
}
}

public static void main(String args[])
{
append c=new append();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("append");
}
}

