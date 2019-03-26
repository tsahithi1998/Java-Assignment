import java.io.*;
import java.awt.*;
import java.awt.event.*;
class rectangle extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;
rectangle()
{
setLayout(null);
l1=new Label("length");
l2=new Label("breadth");
l3=new Label("area");
b1=new Button("ok");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
add(l1);
add(l2);
add(l3);
add(b1);
add(t1);
add(t2);
add(t3);
l1.setBounds(150,150,50,20);
l2.setBounds(150,200,50,20);
b1.setBounds(200,300,50,20);
t1.setBounds(220,150,50,20);
t2.setBounds(220,200,50,20);
l3.setBounds(150,250,50,20);
t3.setBounds(220,250,70,20);

b1.addActionListener(this);
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent e)
{
setVisible(false);
}
});
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
float a=Float.parseFloat(t1.getText());
float a1=Float.parseFloat(t2.getText());
float b;
b=a*a1;
t3.setText(Float.toString(b));
}
}
}