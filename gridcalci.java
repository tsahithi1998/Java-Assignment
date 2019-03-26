import java.io.*;
import java.awt.*;
import java.awt.event.*;
class gridcalci extends Frame implements ActionListener
{
String s1,s2,s3,s4,s5;
double d;
int c,n;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
TextField t1;
gridcalci()
{
setLayout(new GridBagLayout());
GridBagConstraints gbc = new GridBagConstraints();
t1=new TextField();
b1=new Button("     1     ");
b2=new Button("     2     ");
b3=new Button(" 3 ");
b4=new Button("    4    ");
b5=new Button("    5    ");
b6=new Button(" 6 ");
b7=new Button("    7    ");
b8=new Button("    8    ");
b9=new Button(" 9 ");
b10=new Button("    +    ");
b11=new Button("    -    ");
b12=new Button(" * ");
b13=new Button("    /    ");
b14=new Button("OK");
b15=new Button("CLR");
b16=new Button("sin");
b17=new Button("cos");
b18=new Button("tan");
b19=new Button("bin to dec");
b20=new Button("dec to bin");
b21=new Button("dec to hex");
b22=new Button("bin to hex");
b23=new Button("dec to oct");
b24=new Button("bin to oct");
b25=new Button("    0    ");
 gbc.fill = GridBagConstraints.HORIZONTAL;  
gbc.gridx = 0;  
gbc.gridy = 1; 
gbc.ipady = 20;
add(b1,gbc);
gbc.gridx = 1;  
gbc.gridy = 1; 
gbc.ipady = 20;
add(b2,gbc);
gbc.gridx = 2;  
gbc.gridy = 1; 
gbc.ipady = 20;
add(b3,gbc);
gbc.gridx = 0;  
gbc.gridy = 2; 
gbc.ipady = 20;
add(b4,gbc);
gbc.gridx = 1;  
gbc.gridy = 2; 
gbc.ipady = 20;
add(b5,gbc);
gbc.gridx = 2;  
gbc.gridy = 2; 
gbc.ipady = 20;
add(b6,gbc);
gbc.gridx = 0;  
gbc.gridy = 3; 
gbc.ipady = 20;
add(b7,gbc);
gbc.gridx = 1;  
gbc.gridy = 3; 
gbc.ipady = 20;
add(b8,gbc);
gbc.gridx = 2;  
gbc.gridy = 3; 
gbc.ipady = 20;
add(b9,gbc);
gbc.gridx = 0;  
gbc.gridy = 4; 
gbc.ipady = 20;
add(b10,gbc);
gbc.gridx = 1;  
gbc.gridy = 4; 
gbc.ipady = 20;
add(b11,gbc);
gbc.gridx = 2;  
gbc.gridy = 4; 
gbc.ipady = 20;
add(b12,gbc);
gbc.gridx = 0;  
gbc.gridy = 5; 
gbc.ipady = 20;
add(b13,gbc);
gbc.gridx = 4;  
gbc.gridy = 1; 
gbc.ipady = 20;
add(b14,gbc);
gbc.gridx = 3;  
gbc.gridy = 1; 
gbc.ipady = 20;
add(b15,gbc);
gbc.gridx = 3;  
gbc.gridy = 2; 
gbc.ipady = 20;
add(b16,gbc);
gbc.gridx = 4;  
gbc.gridy = 2; 
gbc.ipady = 20;
add(b17,gbc);
gbc.gridx = 3;  
gbc.gridy = 3; 
gbc.ipady = 20;
add(b18,gbc);
gbc.gridx = 4;  
gbc.gridy = 3; 
gbc.ipady = 20;
add(b19,gbc);
gbc.gridx = 3;  
gbc.gridy = 4; 
gbc.ipady = 20;
add(b20,gbc);
gbc.gridx = 4;  
gbc.gridy = 4; 
gbc.ipady = 20;
add(b21,gbc);
gbc.gridx = 2;  
gbc.gridy = 5; 
gbc.ipady = 20;
add(b22,gbc);
gbc.gridx = 3;  
gbc.gridy = 5; 
gbc.ipady = 20;
add(b23,gbc);
gbc.gridx = 4;  
gbc.gridy = 5; 
gbc.ipady = 20;
add(b24,gbc);
gbc.gridx = 1;  
gbc.gridy = 5; 
gbc.ipady = 20;
add(b25,gbc); 
gbc.gridx = 0;  
gbc.gridy = 0;
gbc.gridwidth = 5;  
add(t1,gbc);
t1.setBackground(Color.gray);
b1.setBackground(Color.pink);
b2.setBackground(Color.pink);
b3.setBackground(Color.pink);
b4.setBackground(Color.pink);
b5.setBackground(Color.pink);
b6.setBackground(Color.pink);
b7.setBackground(Color.pink);
b8.setBackground(Color.pink);
b9.setBackground(Color.pink);
b10.setBackground(Color.orange);
b11.setBackground(Color.orange);
b12.setBackground(Color.orange);
b13.setBackground(Color.orange);
b14.setBackground(Color.green);
b15.setBackground(Color.green);
b16.setBackground(Color.cyan);
b17.setBackground(Color.cyan);
b18.setBackground(Color.cyan);
b19.setForeground(Color.blue);
b20.setForeground(Color.blue);
b21.setForeground(Color.blue);
b22.setForeground(Color.blue);
b23.setForeground(Color.blue);
b24.setForeground(Color.blue);
b25.setBackground(Color.pink);
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
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);
b25.addActionListener(this);

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
if(e.getSource()==b25)
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

if(e.getSource()==b16)
{
s1 = t1.getText();
t1.setText("");
c=5;
}
if(e.getSource()==b17)
{
s1 = t1.getText();
t1.setText("");
c=6;
}
if(e.getSource()==b18)
{
s1 = t1.getText();
t1.setText("");
c=7;
}
if(e.getSource()==b19)
{
s1 = t1.getText();
t1.setText("");
c=8;
}
if(e.getSource()==b20)
{
s1 = t1.getText();
t1.setText("");
c=9;
}
if(e.getSource()==b21)
{
s1 = t1.getText();
t1.setText("");
c=10;
}
if(e.getSource()==b22)
{
s1 = t1.getText();
t1.setText("");
c=11;
}
if(e.getSource()==b23)
{
s1 = t1.getText();
t1.setText("");
c=12;
}
if(e.getSource()==b24)
{
s1 = t1.getText();
t1.setText("");
c=13;
}
if(e.getSource()==b14)
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
d=Math.sin(Double.parseDouble(s1));
t1.setText("");
t1.setText(t1.getText()+d);
}
if(c==6)
{
d=Math.cos(Double.parseDouble(s1));
t1.setText("");
t1.setText(t1.getText()+d);
}
if(c==7)
{
d=Math.tan(Double.parseDouble(s1));
t1.setText("");
t1.setText(t1.getText()+d);
}
if(c==8)
{
int a=Integer.parseInt(s1,2);
String str=Integer.toString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
if(c==9)
{
int a=Integer.parseInt(s1);
String str=Integer.toBinaryString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
if(c==10)
{
int a=Integer.parseInt(s1);
String str=Integer.toHexString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
if(c==11)
{
int a=Integer.parseInt(s1,2);
String str=Integer.toHexString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
if(c==12)
{
int a=Integer.parseInt(s1);
String str=Integer.toOctalString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
if(c==13)
{
int a=Integer.parseInt(s1,2);
String str=Integer.toOctalString(a);
t1.setText("");
t1.setText(t1.getText()+str);
}
}
if(e.getSource()==b15)
{
t1.setText("");
}

}
public static void main(String args[])
{
gridcalci c=new gridcalci();
c.setSize(1000,1000);
c.setVisible(true);
c.setTitle("calculator");
}
}