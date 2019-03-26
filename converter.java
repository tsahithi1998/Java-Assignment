import java.io.*;
import java.awt.*;
import java.awt.event.*;
class converter extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;
converter()
{
setLayout(null);
l1=new Label("cm");
l2=new Label("feet");
t1=new TextField(20);
t2=new TextField(20);
b1=new Button("convert");
l1.setBounds(100,100,50,20);
l2.setBounds(100,140,50,20);
t1.setBounds(170,100,50,20);
t2.setBounds(170,140,50,20);
b1.setBounds(130,180,50,20);
add(l1);
add(l2);
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
String str1=t1.getText();
String str2=t2.getText();
if(str1.equals(""))
{
float a=Float.parseFloat(str2);
float r=30.48f*a;
String str=Float.toString(r);
t1.setText(str);
}
if(str2.equals(""))
{
float a=Float.parseFloat(str1);
float r=a/30.48f;
String str=Float.toString(r);
t2.setText(str);
}
}
}
public static void main(String args[])
{
converter c=new converter();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("convert");
}
}

