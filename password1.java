import java.io.*;
import java.awt.*;
import java.awt.event.*;
class password1 extends Frame implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2;
Label l1,l2;
password1()
{
setLayout(null);
t1=new TextField(40);
t2=new TextField(40);
t3=new TextField(40);
l1=new Label("user id");
l2=new Label("password");
b2=new Button("cancel");
b1=new Button("login");
t2.setEchoChar('*');
l1.setBounds(200,200,50,20);
l2.setBounds(200,240,50,20);
t1.setBounds(280,200,50,20);
t2.setBounds(280,240,50,20);
t3.setBounds(100,100,300,20);
b1.setBounds(210,290,50,20);
b2.setBounds(270,290,50,20);
add(l1);
add(l2);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
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
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("harika")&&s2.equals("411671"))
t3.setText("loggined in successfully");
else
t3.setText("wrong userid or password");
}
if(b2==e.getSource())
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
public static void main(String args[])
{
password1 c=new password1();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("single user");
}
}

