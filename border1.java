import java.io.*;
import java.awt.*;
import java.awt.event.*;
class border1 extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
Panel p1;
border1()
{
setLayout(new BorderLayout());
l1=new Label("num1");
l2=new Label("num2");
l3=new Label("result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("add");
b2=new Button("subtract");
b3=new Button("mul");
b4=new Button("divide");
p1=new Panel();
p1.setLayout(null);
p1.add(l1);
p1.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(l3);
p1.add(t3);
add(p1,BorderLayout.CENTER);
add(b1,BorderLayout.NORTH);
add(b2,BorderLayout.SOUTH);
add(b3,BorderLayout.EAST);
add(b4,BorderLayout.WEST);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
l1.setBounds(150,150,40,20);
l2.setBounds(150,200,40,20);
l3.setBounds(150,250,40,20);
t1.setBounds(200,150,40,20);
t2.setBounds(200,200,40,20);
t3.setBounds(200,250,40,20);
p1.setBounds(200,200,200,200);
p1.setBackground(Color.orange);
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
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c;
c=a+b;
t3.setText(Integer.toString(c));
}
if(e.getSource()==b2)
{
int a1=Integer.parseInt(t1.getText());
int b1=Integer.parseInt(t2.getText());
int c1;
c1=a1-b1;
t3.setText(Integer.toString(c1));
}
if(e.getSource()==b3)
{
int a2=Integer.parseInt(t1.getText());
int b2=Integer.parseInt(t2.getText());
int c2;
c2=a2*b2;
t3.setText(Integer.toString(c2));
}
if(e.getSource()==b4)
{
int a3=Integer.parseInt(t1.getText());
int b3=Integer.parseInt(t2.getText());
int c3;
c3=b3/a3;
t3.setText(Integer.toString(c3));
}
}
public static void main(String args[])
{
border1 c=new border1();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("Border");
}
}
