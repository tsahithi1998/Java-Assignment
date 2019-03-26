import java.io.*;
import java.awt.*;
import java.awt.event.*;
class result extends Frame implements ActionListener
{
TextField t1,t2,t3;
Label l1,l2,l3;
Button b1,b2,b3,b4,b5,b6;
result()
{
setLayout(null);
l1=new Label("num1");
l2=new Label("num2");
l3=new Label("result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("add");
b2=new Button("sub");
b3=new Button("mul");
b4=new Button("div");
b5=new Button("mod");
b6=new Button("clr");
l1.setBounds(100,100,50,20);
l2.setBounds(100,140,50,20);
l3.setBounds(100,180,50,20);
t1.setBounds(170,100,50,20);
t2.setBounds(170,140,50,20);
t3.setBounds(170,180,50,20);
b1.setBounds(50,210,50,20);
b2.setBounds(110,210,50,20);
b3.setBounds(170,210,50,20);
b4.setBounds(230,210,50,20);
b5.setBounds(290,210,50,20);
b6.setBounds(160,240,50,20);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
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
int a,b,c;
String str;
if(b1==e.getSource())
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
str=Integer.toString(c);
t3.setText(str);
}
if(b2==e.getSource())
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a-b;
str=Integer.toString(c);
t3.setText(str);
}
if(b3==e.getSource())
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a*b;
str=Integer.toString(c);
t3.setText(str);
}
if(b4==e.getSource())
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a/b;
str=Integer.toString(c);
t3.setText(str);
}
if(b5==e.getSource())
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a%b;
str=Integer.toString(c);
t3.setText(str);
}
if(b6==e.getSource())
{
t1.setText(" ");
t2.setText(" ");
t3.setText(" ");
}
}

public static void main(String args[])
{
result c=new result();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("append");
}
}

