import java.io.*;
import java.awt.*;
import java.awt.event.*;
class card1 extends Frame implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
Panel p,p1,p2,p3,p4,p5,p6;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
CardLayout cd=new CardLayout(100,100);
card1()
{
setLayout(null);
//CardLayout cd=new CardLayout();
p=new Panel();
p.setLayout(cd);
//p.setLayout(null);
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
p5=new Panel();
p6=new Panel();
b1=new Button("feet");
b2=new Button("money");
b5=new Button("add");
b6=new Button("sub");
b7=new Button("copy");
b8=new Button("append");
b9=new Button("cut");
b10=new Button("area");
b11=new Button("ok");
b12=new Button("ok");
b13=new Button("copy");
b14=new Button("cut");
l1=new Label("cm");
l2=new Label("feet");
t1=new TextField(20);
t2=new TextField(20);
t2=new TextField(40);
t2=new TextField(40);
b3=new Button("convert");
b4=new Button("convert");
l5=new Label("rupees");
l6=new Label("num1");
l7=new Label("num2");
l8=new Label("result");
l9=new Label("num1");
l10=new Label("num2");
l11=new Label("result");
t3=new TextField(20);
l3=new Label("no. of rs/dlr");
l4=new Label("dollar");
t4=new TextField(20);
t5=new TextField(20);
t6=new TextField(20);
t7=new TextField(20);
t8=new TextField(20);
t9=new TextField(20);
t10=new TextField(20);
t11=new TextField(20);
t12=new TextField(20);
t13=new TextField(20);
t14=new TextField(20);
t15=new TextField(20);
p1.setLayout(null);
p2.setLayout(null);
p3.setLayout(null);
p4.setLayout(null);
p5.setLayout(null);
p6.setLayout(null);
p1.add(l1);
p1.add(l2);
p1.add(t1);
p1.add(t2);
p1.add(b3);
p2.add(l4);
p2.add(l5);
p2.add(l3);
p2.add(t4);
p2.add(t5);
p2.add(t3);
p2.add(b4);
p3.add(l6);
p3.add(l7);
p3.add(l8);
p3.add(t6);
p3.add(t7);
p3.add(t8);
p3.add(b11);
p4.add(l9);
p4.add(l10);
p4.add(l11);
p4.add(t9);
p4.add(t10);
p4.add(t11);
p4.add(b12);
p4.add(b13);
p4.add(t12);
p4.add(t13);
p5.add(t12);
p5.add(t13);
p5.add(b13);
p6.add(b14);
p6.add(t14);
p6.add(t15);
p.add(p2,"money");
p.add(p1,"feet");
p.add(p3,"add");
p.add(p4,"sub");
p.add(p5,"copy");
p.add(p6,"cut");
add(b1);
add(b2);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(p);
b1.setBounds(100,150,40,20);
b2.setBounds(200,150,40,20);
b5.setBounds(100,200,40,20);
b6.setBounds(200,200,40,20);
b7.setBounds(100,250,40,20);
b8.setBounds(200,250,40,20);
b9.setBounds(100,300,40,20);
b10.setBounds(200,300,40,20);
p.setBounds(300,150,500,500);
p1.setBounds(50,50,300,300);
p2.setBounds(70,70,300,300);
l1.setBounds(50,50,40,20);
l2.setBounds(50,100,40,20);
t1.setBounds(100,50,40,20);
t2.setBounds(100,100,40,20);
b3.setBounds(80,150,40,20);
l3.setBounds(50,50,70,20);
l4.setBounds(50,100,40,20);
t3.setBounds(120,50,40,20);
t4.setBounds(120,100,40,20);
l5.setBounds(50,150,40,20);
t5.setBounds(120,150,40,20);
b4.setBounds(80,200,40,20);
l6.setBounds(50,50,70,20);
l7.setBounds(50,100,40,20);
t6.setBounds(120,50,40,20);
t7.setBounds(120,100,40,20);
l8.setBounds(50,150,40,20);
t8.setBounds(120,150,40,20);
b11.setBounds(80,200,40,20);
l9.setBounds(50,50,70,20);
l10.setBounds(50,100,40,20);
t9.setBounds(120,50,40,20);
t10.setBounds(120,100,40,20);
l11.setBounds(50,150,40,20);
t11.setBounds(120,150,40,20);
b12.setBounds(80,200,40,20);
b13.setBounds(120,200,40,20);
t12.setBounds(100,100,50,20);
t13.setBounds(100,150,50,20);
b14.setBounds(120,200,40,20);
t14.setBounds(100,100,50,20);
t15.setBounds(100,150,50,20);
p.setBackground(Color.pink);
p1.setBackground(Color.cyan);
p2.setBackground(Color.yellow);
p3.setBackground(Color.green);
p4.setBackground(Color.orange);
p5.setBackground(Color.blue);
p6.setBackground(Color.red);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b11.addActionListener(this);
b6.addActionListener(this);
b12.addActionListener(this);
b7.addActionListener(this);
b13.addActionListener(this);
b9.addActionListener(this);
b14.addActionListener(this);
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
if(e.getSource()==b1)
{
cd.show(p,"feet");
}
if(e.getSource()==b2)
{
cd.show(p,"money");
}
if(e.getSource()==b5)
{
cd.show(p,"add");
}
if(e.getSource()==b6)
{
cd.show(p,"sub");
}
if(e.getSource()==b7)
{
cd.show(p,"copy");
}
if(e.getSource()==b9)
{
cd.show(p,"cut");
}
if(e.getSource()==b13)
{
String s=t12.getText();
t13.setText(s);
}
if(e.getSource()==b14)
{
String s=t14.getText();
t15.setText(s);
t14.setText(" ");
}
if(e.getSource()==b11)
{
int a=Integer.parseInt(t6.getText());
int b=Integer.parseInt(t7.getText());
int c=a+b;
t8.setText(Integer.toString(c));
}
if(e.getSource()==b12)
{
int a=Integer.parseInt(t9.getText());
int b=Integer.parseInt(t10.getText());
int c=a-b;
t11.setText(Integer.toString(c));
}
if(e.getSource()==b3)
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
if(e.getSource()==b4)
{
String str1=t3.getText();
String str2=t4.getText();
String str3=t5.getText();
if(str3.equals(""))
{
float b=Float.parseFloat(str1);
float a=Float.parseFloat(str2);
float r=a/b;
String str=Float.toString(r);
t5.setText(str);
}
if(str2.equals(""))
{
float a=Float.parseFloat(str1);
float b=Float.parseFloat(str3);
float r=a*b;
String str=Float.toString(r);
t4.setText(str);
}
}
}
public static void main(String args[])
{
card1 c=new card1();
c.setSize(1000,1000);
c.setVisible(true);
c.setTitle("card layout");
}
}