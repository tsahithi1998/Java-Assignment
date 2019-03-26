import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class panel extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5,l6;
Button b1,b2,b3,b4;
TextField t1,t2,t3,t4,t5,t6;
Panel p1,p2;
public panel()
{
setLayout(null);
l1=new Label("num1");
l2=new Label("num2");
l3=new Label("result");
b1=new Button("ADD");
b2=new Button("SUB");
b3=new Button("Result");
t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
t4=new TextField(30);
t5=new TextField(30);
t6=new TextField(30);
l4=new Label("num1");
l5=new Label("num2");
l6=new Label("result");
b4=new Button("Result");
p1=new Panel();
p2=new Panel();
add(b1);
add(b2);
add(p1);
add(p2);
b1.setBounds(250,150,30,20);
b2.setBounds(300,150,30,20);
p1.setBounds(200,200,300,300);
p2.setBounds(200,200,300,300);
p1.setBackground(Color.orange);
p2.setBackground(Color.pink);
p1.setVisible(false);
p2.setVisible(false);
p1.setLayout(null);
p2.setLayout(null);
p1.add(l1);
p1.add(l2);
p1.add(l3);
p1.add(t1);
p1.add(t2);
p1.add(t3);
p1.add(b3);
l1.setBounds(50,50,50,20);
l2.setBounds(50,100,50,20);
l3.setBounds(50,150,50,20);
t1.setBounds(110,50,50,20);
t2.setBounds(110,100,50,20);
t3.setBounds(110,150,50,20);
b3.setBounds(80,190,40,20);
p2.add(l4);
p2.add(l5);
p2.add(l6);
p2.add(t4);
p2.add(t5);
p2.add(t6);
p2.add(b4);
l4.setBounds(50,50,50,20);
l5.setBounds(50,100,50,20);
l6.setBounds(50,150,50,20);
t4.setBounds(110,50,50,20);
t5.setBounds(110,100,50,20);
t6.setBounds(110,150,50,20);
b4.setBounds(80,190,40,20);
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
if(e.getSource()==b1)
{
p2.setVisible(false);
p1.setVisible(true);
}
if(e.getSource()==b2)
{
p1.setVisible(false);
p2.setVisible(true);
}
if(e.getSource()==b3)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
t3.setText(Integer.toString(c));
}

if(e.getSource()==b4)
{
int a=Integer.parseInt(t4.getText());
int b=Integer.parseInt(t5.getText());
int c=a-b;
t6.setText(Integer.toString(c));
}
}
public static void main(String args[])
{
panel c=new panel();
c.setSize(750,750);
c.setVisible(true);
c.setTitle("panel");
//c.setBackground(Color.ORANGE);
}
}