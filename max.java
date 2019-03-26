import java.io.*;
import java.awt.*;
import java.awt.event.*;
class max extends Frame implements ActionListener
{
TextField t1,t2,t3,t4;
Button b1;
Label l1,l2,l3,l4;
max()
{
setLayout(null);
l1=new Label("num1");
l2=new Label("num2");
l3=new Label("num3");
l4=new Label("biggest");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
b1=new Button("find max");
l1.setBounds(100,100,50,20);
l2.setBounds(100,140,50,20);
l3.setBounds(100,180,50,20);
l4.setBounds(100,220,50,20);
t1.setBounds(170,100,50,20);
t2.setBounds(170,140,50,20);
t3.setBounds(170,180,50,20);
t4.setBounds(170,220,50,20);
b1.setBounds(80,260,50,20);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(t3);
add(t4);
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
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=Integer.parseInt(t3.getText());
int m;
m=a;
if(b>m)
m=b;
if(c>m)
m=c;
String str=Integer.toString(m);
t4.setText(str);
}
}

public static void main(String args[])
{
max c=new max();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("maximum");
}
}

