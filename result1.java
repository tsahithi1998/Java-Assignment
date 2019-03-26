import java.io.*;
import java.awt.*;
import java.awt.event.*;
class result1 extends Frame implements ActionListener
{
TextField t1;
Button b1,b2,b3,b4;
result1()
{
setLayout(null);
t1=new TextField("0",20);
b1=new Button("add 5");
b2=new Button("sub 5");
b3=new Button("add 10");
b4=new Button("sub 10");
t1.setBounds(200,100,50,20);
b1.setBounds(150,140,50,20);
b2.setBounds(220,140,50,20);
b3.setBounds(150,180,50,20);
b4.setBounds(220,180,50,20);
add(t1);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
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
int a=Integer.parseInt(t1.getText());
int r=a+5;
String s=Integer.toString(r);
t1.setText(s);
}
if(b2==e.getSource())
{
int a=Integer.parseInt(t1.getText());
int r=a-5;
String s=Integer.toString(r);
t1.setText(s);
}
if(b3==e.getSource())
{
int a=Integer.parseInt(t1.getText());
int r=a+10;
String s=Integer.toString(r);
t1.setText(s);
}
if(b4==e.getSource())
{
int a=Integer.parseInt(t1.getText());
int r=a-10;
String s=Integer.toString(r);
t1.setText(s);
}
}

public static void main(String args[])
{
result1 c=new result1();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("result");
}
}

