import java.io.*;
import java.awt.*;
import java.awt.event.*;
class multiple extends Frame implements ActionListener
{
Button b1,b2,b3;
multiple()
{
setLayout(null);
b1=new Button("circle");
b2=new Button("rectangle");
b3=new Button("square");
add(b1);
add(b2);
add(b3);
b1.setBounds(150,250,50,20);
b2.setBounds(220,250,50,20);
b3.setBounds(290,250,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
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
circle c=new circle();
c.setVisible(true);
c.setSize(450,450);
c.setTitle("circle");
c.setBackground(Color.yellow);
}
if(e.getSource()==b2)
{
rectangle r=new rectangle();
r.setVisible(true);
r.setSize(450,450);
r.setTitle("rectangle");
r.setBackground(Color.cyan);
}
if(e.getSource()==b3)
{
square s=new square();
s.setVisible(true);
s.setSize(450,450);
s.setTitle("circle");
s.setBackground(Color.green);
}
}
public static void main(String args[])
{
multiple m=new multiple();
m.setSize(500,500);
m.setVisible(true);
m.setTitle("multiple frames");
m.setBackground(Color.blue);
}
}