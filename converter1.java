import java.io.*;
import java.awt.*;
import java.awt.event.*;
class converter1 extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;
converter1()
{
setLayout(null);
l1=new Label("rupees");
l2=new Label("dollar");
t3=new TextField(20);
l3=new Label("no. of rupees per dollar");
t1=new TextField(20);
t2=new TextField(20);
b1=new Button("convert");
l1.setBounds(100,100,50,20);
l2.setBounds(100,140,60,20);
l3.setBounds(100,50,150,20);
t1.setBounds(170,100,50,20);
t2.setBounds(170,140,50,20);
t3.setBounds(300,50,50,20);
b1.setBounds(130,180,50,20);
add(l1);
add(l2);
add(l3);
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
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();
if(str1.equals(""))
{
float b=Float.parseFloat(str3);
float a=Float.parseFloat(str2);
float r=a*b;
String str=Float.toString(r);
t1.setText(str);
}
if(str2.equals(""))
{
float a=Float.parseFloat(str1);
float b=Float.parseFloat(str3);
float r=a/b;
String str=Float.toString(r);
t2.setText(str);
}
}
}
public static void main(String args[])
{
converter1 c=new converter1();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("convert");
}
}

