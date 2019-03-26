import java.io.*;
import java.awt.*;
import java.awt.event.*;
class calculator2 extends Frame implements ActionListener
{
String s1,s2,s3,s4,s5;
int c,n;
TextField t1;
Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
calculator2()
{
setLayout(null);
t1=new TextField(20);
b=new Button("0");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b10=new Button("+");
b11=new Button("-");
b12=new Button("*");
b13=new Button("/");
b14=new Button("%");
b15=new Button("ok");
b16=new Button("clr");
t1.setBounds(100,100,50,20);
b.setBounds(80,140,30,20);
b1.setBounds(120,140,30,20);
b2.setBounds(160,140,30,20);
b3.setBounds(200,140,30,20);
b4.setBounds(240,140,30,20);
b5.setBounds(280,140,30,20);
b6.setBounds(320,140,30,20);
b7.setBounds(360,140,30,20);
b8.setBounds(400,140,30,20);
b9.setBounds(440,140,30,20);
b10.setBounds(160,180,30,20);
b11.setBounds(200,180,30,20);
b12.setBounds(240,180,30,20);
b13.setBounds(280,180,30,20);
b14.setBounds(320,180,30,20);
b15.setBounds(180,220,30,20);
b16.setBounds(240,220,30,20);
add(t1);
add(b);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
add(b13);
add(b14);
add(b15);
add(b16);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
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

if(e.getSource()==b)
{
s3 = t1.getText();
s4 = "0";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b1)
{
s3 = t1.getText();
s4 = "1";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b2)
{
s3 = t1.getText();
s4 = "2";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b3)
{
s3 = t1.getText();
s4 = "3";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b4)
{
s3 = t1.getText();
s4 = "4";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b5)
{
s3 = t1.getText();
s4 = "5";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b6)
{
s3 = t1.getText();
s4 = "6";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b7)
{
s3 = t1.getText();
s4 = "7";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b8)
{
s3 = t1.getText();
s4 = "8";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b9)
{
s3 = t1.getText();
s4 = "9";
s5 = s3+s4;
t1.setText(s5);
}
if(e.getSource()==b10)
{
s1 = t1.getText();
t1.setText("");
c=1;
}
if(e.getSource()==b11)
{
s1 = t1.getText();
t1.setText("");
c=2;

}
if(e.getSource()==b12)
{
s1 = t1.getText();
t1.setText("");
c=3;

}
if(e.getSource()==b13)
{
s1 = t1.getText();
t1.setText("");
c=4;

}
if(e.getSource()==b14)
{
s1 = t1.getText();
t1.setText("");
c=5;
}
if(e.getSource()==b15)
{
s2 = t1.getText();
//t1.setText("");
if(c==1)
{
t1.setText("");
n = Integer.parseInt(s1)+Integer.parseInt(s2);
String str=Integer.toString(n);
t1.setText(str);
}
if(c==2)
{
n = Integer.parseInt(s1)-Integer.parseInt(s2);
t1.setText(Integer.toString(n));
}
if(c==3)
{
n = Integer.parseInt(s1)*Integer.parseInt(s2);
t1.setText(Integer.toString(n));
}
if(c==4)
{
try
  {
int p=Integer.parseInt(s2);
 if(p!=0)
  {
 n = Integer.parseInt(s1)/Integer.parseInt(s2);
    t1.setText(Integer.toString(n));               
   }
  else
 t1.setText("infinite");
  }
 catch(Exception i){}
}
if(c==5)
{
n = Integer.parseInt(s1)%Integer.parseInt(s2);
t1.setText(Integer.toString(n));
}
}
if(e.getSource()==b16)
{
t1.setText("");
}

}
public static void main(String args[])
{
calculator2 c=new calculator2();
c.setSize(600,600);
c.setVisible(true);
c.setTitle("calculate");
}
}

