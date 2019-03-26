import java.io.*;
import java.awt.*;
import java.awt.event.*;
class profile extends Frame implements ActionListener,ItemListener
{
Label l1,l2,l3,l4,l5,l6,l7,l9,l10,l11;
Button b;
TextField t1,t2,t3,t4;
Choice c1,c2;
TextArea ta;
Checkbox b1,b2,b3,b4,b5,b6,b7;
List l;
profile()
{
setLayout(null);
CheckboxGroup cbg=new CheckboxGroup();
l=new List(7,true);
l1=new Label("name:");
l2=new Label("dob(dd/mm/yyyy):");
l3=new Label("year:");
l4=new Label("state:");
l5=new Label("address:");
l6=new Label("Special interst:");
l7=new Label("Gender:");
l9=new Label("PIN Code");
l10=new Label("ph no:");
l11=new Label("Select any 3 of the electives:");
t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
t4=new TextField(30);
c1=new Choice();
c2=new Choice();
ta=new TextArea("",10,200,0);
b1=new Checkbox("Phython");
b2=new Checkbox(".net");
b3=new Checkbox("Soft Skills");
b4=new Checkbox("Java Script");
b5=new Checkbox("Mathematics");
b6=new Checkbox("Male",cbg,false);
b7=new Checkbox("Female",cbg,false);
b=new Button("submit");
l1.setBounds(50,50,40,20);
l2.setBounds(50,100,100,20);
l3.setBounds(50,150,40,20);
l4.setBounds(400,250,40,20);
l5.setBounds(50,250,60,20);
l6.setBounds(400,450,150,20);
l7.setBounds(400,50,50,20);
l9.setBounds(400,100,70,20);
l10.setBounds(400,150,70,20);
l11.setBounds(50,450,200,20);
t1.setBounds(100,50,150,20);
t2.setBounds(160,100,150,20);
t3.setBounds(480,100,150,20);
t4.setBounds(480,150,150,20);
c1.setBounds(100,150,100,70);
c2.setBounds(450,250,150,70);
ta.setBounds(120,250,200,150);
b1.setBounds(100,500,100,20);
b2.setBounds(100,540,100,20);
b3.setBounds(100,580,100,20);
b4.setBounds(100,610,100,20);
b5.setBounds(100,650,100,20);
b6.setBounds(460,50,60,20);
b7.setBounds(530,50,60,20);
l.setBounds(450,480,100,100);
b.setBounds(300,700,60,20);
b.setBackground(Color.BLUE);
c1.add("1st btech");
c1.add("2st btech");
c1.add("3st btech");
c1.add("4st btech");
c2.add("Andhra Pradesh");
c2.add("Telengana");
c2.add("Arunachal Pradesh");
c2.add("Maharastra");
c2.add("Karnataka");
c2.add("Tamil Nadu");
c2.add("Kerela");
c2.add("Uttar pradesh");
c2.add("Bihar");
c2.add("Punjab");
c2.add("West Bengal");
c2.add("New Delhi");
c2.add("Madhya Pradesh");
c2.add("odissa");
c2.add("Assam");
l.add("NSS");
l.add("NCC");
l.add("sports");
l.add("Music");
l.add("Dance");
l.add("Drama");
l.add("art");
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l9);
add(l10);
add(l11);
add(t1);
add(t2);
add(t3);
add(t4);
add(c1);
add(c2);
add(ta);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(l);
add(b);
b.addActionListener(this);
b1.addItemListener(this);
b2.addItemListener(this);
b3.addItemListener(this);
b4.addItemListener(this);
b5.addItemListener(this);
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
try
{
FileWriter fout=new FileWriter("profile.txt",true);
fout.write("name="+t1.getText()+"\r\n");
fout.write("dob="+t2.getText()+"\r\n");
fout.write("PIN="+t3.getText()+"\r\n");
fout.write("Ph no="+t4.getText()+"\r\n");
fout.write("Address="+ta.getText()+"\r\n");
fout.write("year="+c1.getSelectedItem()+"\r\n");
fout.write("state="+c2.getSelectedItem()+"\r\n");
fout.write("special intersts:"+"\r'n");
String[] str=l.getSelectedItems();
for(int i=0;i<str.length;i++)
{
fout.write(str[i]+"\r\n");
}
fout.close();
}
catch(IOException e1)
{
System.out.println(e1);
}
}
}
public void itemStateChanged(ItemEvent e)
{
try
{

FileWriter fout=new FileWriter("profile.txt",true);

fout.write("selected electives:"+"\r\n");

if(b1==e.getItemSelectable())
{
if(b1.getState())
{
fout.write(b1.getLabel()+"\r\n");
}
}
if(b2==e.getItemSelectable())
{
if(b2.getState())
{
fout.write(b2.getLabel()+"\r\n");
}
}
if(b3==e.getItemSelectable())
{
if(b3.getState())
{
fout.write(b3.getLabel()+"\r\n");
}
}
if(b4==e.getItemSelectable())
{
if(b4.getState())
{
fout.write(b4.getLabel()+"\r\n");
}
}
if(b5==e.getItemSelectable())
{
if(b5.getState())
{
fout.write(b5.getLabel()+"\r\n");
}
}

fout.close();
}
catch(IOException e1)
{
System.out.println(e1);
}
}
public static void main(String args[])
{
profile c=new profile();
c.setSize(750,750);
c.setVisible(true);
c.setTitle("profile");
//c.setBackground(Color.ORANGE);
}
}








