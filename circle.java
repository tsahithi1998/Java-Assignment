import java.io.*;
import java.awt.*;
import java.awt.event.*;
class circle extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;
circle()
{
setLayout(null);
l1=new Label("radius");
l2=new Label("area");
b1=new Button("ok");
t1=new TextField(20);
t2=new TextField(20);
add(l1);
add(l2);
add(b1);
add(t1);
add(t2);
l1.setBounds(150,150,50,20);
l2.setBounds(150,200,50,20);
b1.setBounds(200,250,50,20);
t1.setBounds(220,150,50,20);
t2.setBounds(220,200,70,20);
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
double a=Double.parseDouble(t1.getText());
double b;
b=3.14*a*a;
t2.setText(Double.toString(b));
}
}
}