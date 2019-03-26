import java.io.*;
import java.awt.*;
import java.awt.event.*;
class area extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5,t6,t7;
Button b1,b2,b3,b4;
Label l1,l2,l3,l4,l5,l6,l7;
area()
{
setLayout(null);
l1=new Label("side");
l2=new Label("length");
l3=new Label("breadth");
l4=new Label("radius");
l5=new Label("base");
l6=new Label("height");
l7=new Label("area");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
t6=new TextField(20);
t7=new TextField(20);
b1=new Button("sq.area");
b2=new Button("rec.area");
b3=new Button("cir.area");
b4=new Button("tri.area");
l1.setBounds(100,100,50,20);
l2.setBounds(240,100,50,20);
l3.setBounds(240,140,50,20);
l4.setBounds(100,270,50,20);
l5.setBounds(240,240,50,20);
l6.setBounds(240,280,50,20);
l7.setBounds(170,400,50,20);
t1.setBounds(170,100,50,20);
t2.setBounds(310,100,50,20);
t3.setBounds(310,140,50,20);
t4.setBounds(170,270,50,20);
t5.setBounds(310,240,50,20);
t6.setBounds(310,280,50,20);
t7.setBounds(240,400,50,20);
b1.setBounds(150,140,50,20);
b2.setBounds(270,180,50,20);
b3.setBounds(150,320,50,20);
b4.setBounds(300,320,50,20);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
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
int r=a*a;
String str=Integer.toString(r);
t7.setText(str);
}
if(b2==e.getSource())
{
int a=Integer.parseInt(t2.getText());
int b=Integer.parseInt(t3.getText());
int r=a*b;
String str=Integer.toString(r);
t7.setText(str);
}
if(b3==e.getSource())
{
float a=Float.parseFloat(t4.getText());
float r=3.14f*a*a;
String str=Float.toString(r);
t7.setText(str);
}
if(b4==e.getSource())
{
float a=Float.parseFloat(t5.getText());
float b=Float.parseFloat(t6.getText());
float r=0.5f*a*b;
String str=Float.toString(r);
t7.setText(str);
}
}

public static void main(String args[])
{
area c=new area();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("cut");
}
}

