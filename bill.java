import java.io.*;
import java.awt.*;
import java.awt.event.*;
class bill extends Frame implements FocusListener
{
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
bill()
{
setLayout(null);
l1=new Label("s.no");
l2=new Label("item");
l3=new Label("quantity");
l4=new Label("price");
l5=new Label("1");
l6=new Label("2");
l7=new Label("3");
l8=new Label("4");
l9=new Label("5");
l10=new Label("6");
l11=new Label("monitor");
l12=new Label("keyboard");
l13=new Label("mouse");
l14=new Label("cpu");
l15=new Label("printer");
l16=new Label("speakers");
l17=new Label("total");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
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
t7.setEditable(false);
t8.setEditable(false);
t9.setEditable(false);
t10.setEditable(false);
t11.setEditable(false);
t12.setEditable(false);
t13.setEditable(false);
t7.setFocusable(true);
t8.setFocusable(true);
t9.setFocusable(true);
t10.setFocusable(true);
t11.setFocusable(true);
t12.setFocusable(true);
t13.setFocusable(true);
l1.setBounds(100,100,50,20);
l2.setBounds(200,100,50,20);
l3.setBounds(300,100,50,20);
l4.setBounds(400,100,50,20);
l5.setBounds(100,140,50,20);
l6.setBounds(100,180,50,20);
l7.setBounds(100,220,50,20);
l8.setBounds(100,260,50,20);
l9.setBounds(100,300,50,20);
l10.setBounds(100,340,50,20);
l11.setBounds(200,140,50,20);
l12.setBounds(200,180,50,20);
l13.setBounds(200,220,50,20);
l14.setBounds(200,260,50,20);
l15.setBounds(200,300,50,20);
l16.setBounds(200,340,50,20);
l17.setBounds(300,380,50,20);
t1.setBounds(300,140,50,20);
t2.setBounds(300,180,50,20);
t3.setBounds(300,220,50,20);
t4.setBounds(300,260,50,20);
t5.setBounds(300,300,50,20);
t6.setBounds(300,340,50,20);
t7.setBounds(400,140,50,20);
t8.setBounds(400,180,50,20);
t9.setBounds(400,220,50,20);
t10.setBounds(400,260,50,20);
t11.setBounds(400,300,50,20);
t12.setBounds(400,340,50,20);
t13.setBounds(400,380,50,20);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(l15);
add(l16);
add(l17);
add(t1);
add(t7);
add(t2);
add(t8);
add(t3);
add(t9);
add(t4);
add(t10);
add(t5);
add(t11);
add(t6);
add(t12);
add(t13);
t7.addFocusListener(this);
t8.addFocusListener(this);
t9.addFocusListener(this);
t10.addFocusListener(this);
t11.addFocusListener(this);
t12.addFocusListener(this);
t13.addFocusListener(this);
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public void focusGained(FocusEvent e)
{
if(e.getSource()==t7)
{
int n=Integer.parseInt(t1.getText());
int cost=n*2000;
String str=Integer.toString(cost);
t7.setText(str);
}
if(e.getSource()==t8)
{
int n=Integer.parseInt(t2.getText());
int cost=n*500;
String str=Integer.toString(cost);
t8.setText(str);
}
if(e.getSource()==t9)
{
int n=Integer.parseInt(t3.getText());
int cost=n*200;
String str=Integer.toString(cost);
t9.setText(str);
}
if(e.getSource()==t10)
{
int n=Integer.parseInt(t4.getText());
int cost=n*1500;
String str=Integer.toString(cost);
t10.setText(str);
}
if(e.getSource()==t11)
{
int n=Integer.parseInt(t5.getText());
int cost=n*500;
String str=Integer.toString(cost);
t11.setText(str);
}
if(e.getSource()==t12)
{
int n=Integer.parseInt(t6.getText());
int cost=n*100;
String str=Integer.toString(cost);
t12.setText(str);
}
if(e.getSource()==t13)
{
int n1=Integer.parseInt(t7.getText());
int n2=Integer.parseInt(t8.getText());
int n3=Integer.parseInt(t9.getText());
int n4=Integer.parseInt(t10.getText());
int n5=Integer.parseInt(t11.getText());
int n6=Integer.parseInt(t12.getText());
int cost=n1+n2+n3+n4+n5+n6;
String str=Integer.toString(cost);
t13.setText(str);
}
}
public void focusLost(FocusEvent e)
{
}

public static void main(String args[])
{
bill c=new bill();
c.setSize(600,600);
c.setVisible(true);
c.setTitle("bill");
c.setBackground(Color.YELLOW);
}
}

