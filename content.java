import java.io.*;
import java.awt.*;
import java.awt.event.*;
class content extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;
content()
{
setLayout(null);
l1=new Label("num1");
l2=new Label("num2");
b1=new Button("new");
t1=new TextField(40);
t2=new TextField(40);
add(l1);
add(l2);
add(b1);
add(t1);
add(t2);
l1.setBounds(150,150,50,20);
l2.setBounds(150,200,50,20);
b1.setBounds(200,250,50,20);
t1.setBounds(220,150,70,20);
t2.setBounds(220,200,70,20);
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
if(e.getSource()==b1)
{
addframe a=new addframe(this);
a.setSize(400,400);
a.setVisible(true);
a.setTitle("addition");
a.setBackground(Color.pink);
}
}
public static void main(String args[])
{
content c=new content();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("content");
c.setBackground(Color.gray);
}
}