import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
class age extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2,t3;
Button b1;
age()
{
setLayout(null);
l1=new Label("dob1(mm/dd/yyyy)");
l2=new Label("dob2(mm/dd/yyyy)");
t3=new TextField(150);
t1=new TextField(40);
t2=new TextField(40);
b1=new Button("ok");
l1.setBounds(100,100,100,20);
l2.setBounds(100,140,100,20);
t3.setBounds(100,50,200,20);
t1.setBounds(230,100,70,20);
t2.setBounds(230,140,70,20);
b1.setBounds(130,180,50,20);
add(l1);
add(l2);
add(t1);
add(t2);
add(t3);
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
String str1=t1.getText();
String str2=t2.getText();
SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
Date date1=null;
Date date2=null;
try
{
date1=format.parse(str1);
date2=format.parse(str2);
}
catch (ParseException e1)
{
e1.printStackTrace();
}
long diff=date2.getTime()-date1.getTime();
if(diff>0)
t3.setText("person1 is older than person2");
if(diff<0)
t3.setText("person2 is older than person1");
if(diff==0)
t3.setText("both are of same age");
}
}
public static void main(String args[])
{
age c=new age();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("age");
}
}

