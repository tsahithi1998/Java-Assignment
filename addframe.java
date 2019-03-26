import java.io.*;
import java.awt.*;
import java.awt.event.*;
class addframe extends Frame implements ActionListener
{
Label l1;
TextField t1;
Button b1;
content c;
public addframe(content c1)
{
c=c1;
setLayout(null);
l1=new Label("result");
t1=new TextField(40);
b1=new Button("add");
add(l1);
add(t1);
add(b1);
l1.setBounds(150,150,40,20);
t1.setBounds(210,150,40,20);
b1.setBounds(190,200,40,20);
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
int a=Integer.parseInt(c.t1.getText());
int b=Integer.parseInt(c.t2.getText());
int c=a+b;
t1.setText(Integer.toString(c));
}
}
}