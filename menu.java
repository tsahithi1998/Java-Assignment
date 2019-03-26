import java.io.*;
import java.awt.*;
import java.awt.event.*;
class menu extends Frame implements ActionListener
{
TextArea ta;
MenuBar mb;
Menu file;
MenuItem i1,i2,i3;
menu()
{
setLayout(null);
ta=new TextArea();
file =new Menu("File");
mb=new MenuBar();
setMenuBar(mb);
//i1=new MenuItem("new",new shortCutKey(KeyEvent.VK_N));
i2=new MenuItem("open");
i3=new MenuItem("save");
//file.add(i1);
file.add(i2);
file.add(i3);
mb.add(file);
add(ta);
ta.setBounds(100,100,300,200);
//i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
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
if(e.getSource()==i2)
{
FileDialog fd=new FileDialog(this,"OpenDialog",FileDialog.LOAD);
fd.setVisible(true);
String str=fd.getFile();
ta.setText("fileselected is:   ");
ta.append(str);
}

if(e.getSource()==i3)
{
try{
FileDialog fd1=new FileDialog(this,"OpenSaveDialog",FileDialog.SAVE);
fd1.setVisible(true);
String str=fd1.getFile();
String str1=ta.getText();
FileWriter fout =new FileWriter(str,true);
fout.write(str1);
fout.close();
}
catch(IOException e1)
{
System.out.println(e1);
}
}
}
public static void main(String args[])
{
menu c=new menu();
c.setSize(500,500);
c.setVisible(true);
c.setTitle("menu");
c.setBackground(Color.gray);
}
}