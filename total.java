import java.io.*;
import java.awt.*;
import java.awt.event.*;
class total extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5,t6;
Button b1;
Label l1,l2,l3,l4,l5,l6;
total()
{
setLayout(null);
l1=new Label("total");
l2=new Label("sub1");
l3=new Label("sub2");
l4=new Label("sub3");
l5=new Label("sub4");
l6=new Label("sub5");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
t6=new TextField(20);
b1=new Button("remaining");
l1.setBounds(100,100,50,20);
l2.setBounds(100,140,50,20);
l3.setBounds(100,180,50,20);
l4.setBounds(100,220,50,20);
l5.setBounds(100,260,50,20);
l6.setBounds(100,300,50,20);
t1.setBounds(170,100,50,20);
t2.setBounds(170,140,50,20);
t3.setBounds(170,180,50,20);
t4.setBounds(170,220,50,20);
t5.setBounds(170,260,50,20);
t6.setBounds(170,300,50,20);
b1.setBounds(130,340,70,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
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
public void actionPerformed(ActionEvent e1)
{
if(b1==e1.getSource())
{
String s=t1.getText();
String s1=t2.getText();
String s2=t3.getText();
String s3=t4.getText();
String s4=t5.getText();
String s5=t6.getText();
if(s1.equals(""))
{
int a=Integer.parseInt(s);
int b=Integer.parseInt(s2);
int c=Integer.parseInt(s3);
int d=Integer.parseInt(s4);
int e=Integer.parseInt(s5);
int sum=a-(b+c+d+e);
String str=Integer.toString(sum);
t2.setText(str);
}
if(s2.equals(""))
{
int a=Integer.parseInt(s);
int b=Integer.parseInt(s1);
int c=Integer.parseInt(s3);
int d=Integer.parseInt(s4);
int e=Integer.parseInt(s5);
int sum=a-(b+c+d+e);
String str=Integer.toString(sum);
t3.setText(str);
}
if(s3.equals(""))
{
int a=Integer.parseInt(s);
int b=Integer.parseInt(s2);
int c=Integer.parseInt(s1);
int d=Integer.parseInt(s4);
int e=Integer.parseInt(s5);
int sum=a-(b+c+d+e);
String str=Integer.toString(sum);
t4.setText(str);
}
if(s4.equals(""))
{
int a=Integer.parseInt(s);
int b=Integer.parseInt(s2);
int c=Integer.parseInt(s3);
int d=Integer.parseInt(s1);
int e=Integer.parseInt(s5);
int sum=a-(b+c+d+e);
String str=Integer.toString(sum);
t5.setText(str);
}
if(s5.equals(""))
{
int a=Integer.parseInt(s);
int b=Integer.parseInt(s2);
int c=Integer.parseInt(s3);
int d=Integer.parseInt(s4);
int e=Integer.parseInt(s1);
int sum=a-(b+c+d+e);
String str=Integer.toString(sum);
t6.setText(str);
}
}
}

public static void main(String args[])
{
total c=new total();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("total");
}
}

