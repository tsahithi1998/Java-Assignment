import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
class addressbook4 extends Frame implements ActionListener 
{
String name,rollno,age,branch,str1;
Long arr[]=new Long[20];
int i=0;
int pos1,pos2;
Label l1,l2,l3,l4;
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3,t4,t5;
addressbook4()
{
try
{
RandomAccessFile f=new RandomAccessFile("address1.txt","rw");
pos1=1;
arr[i++]=f.getFilePointer();
while((str1=f.readLine())!=null)
{
arr[i++]=f.getFilePointer();
}
pos2=i-2;
System.out.println(pos2);
for (int y=0;y<i;y++)
{
System.out.println(arr[y]);
}
}
catch(IOException e1)
{
System.out.println(e1);
}
setLayout(null);
l1=new Label("name");
l2=new Label("rollno");
l3=new Label("age");
l4=new Label("branch");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(100);
b1=new Button("add");
b2=new Button("Next");
b3=new Button("Prev");
b4=new Button("Last");
b5=new Button("First");
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
l1.setBounds(100,100,40,20);
l2.setBounds(100,150,40,20);
l3.setBounds(100,200,40,20);
l4.setBounds(100,250,40,20);
t1.setBounds(150,100,90,20);
t2.setBounds(150,150,90,20);
t3.setBounds(150,200,90,20);
t4.setBounds(150,250,90,20);
t5.setBounds(100,50,200,20);
b1.setBounds(100,300,40,20);
b2.setBounds(150,300,40,20);
b3.setBounds(200,300,40,20);
b4.setBounds(250,300,40,20);
b5.setBounds(300,300,40,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
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

try
{
RandomAccessFile f=new RandomAccessFile("address1.txt","rw");
if(e.getSource()==b1)
{

name=t1.getText();
rollno=t2.getText();
age=t3.getText();
branch=t4.getText();
String str;
str=name+"|"+rollno+"|"+age+"|"+branch;
f.skipBytes( (int)f.length() );
//f.writeUTF(str);
f.write(str.getBytes());
f.write("\r\n".getBytes());
arr[i++]=f.getFilePointer();
t5.setText("Record added Successfully");
t1.setText(null);
t2.setText(null);
t3.setText(null);
t4.setText(null);
}
if(e.getSource()==b5)
{
f.seek(arr[0]);
String str2=f.readLine();
StringTokenizer tz=new StringTokenizer(str2,"|");
name=tz.nextElement().toString();
rollno=tz.nextElement().toString();
age=tz.nextElement().toString();
branch=tz.nextElement().toString();
t1.setText(name);
t2.setText(rollno);
t3.setText(age);
t4.setText(branch);
t5.setText("first record is");
}
if(e.getSource()==b4)
{
int j;
for(j=0;j<20;j++)
{
if(arr[j]==null)
break;
}
f.seek(arr[j-2]);
String str2=f.readLine();
StringTokenizer tz=new StringTokenizer(str2,"|");
name=tz.nextElement().toString();
rollno=tz.nextElement().toString();
age=tz.nextElement().toString();
branch=tz.nextElement().toString();
t1.setText(name);
t2.setText(rollno);
t3.setText(age);
t4.setText(branch);
t5.setText("last record is");
}


if(e.getSource()==b2)
{
if(pos1==i-1)
{
t5.setText("this is the last record");
t1.setText(null);
t2.setText(null);
t3.setText(null);
t4.setText(null);
}
else
{
f.seek(arr[pos1]);
String str2=f.readLine();
StringTokenizer tz=new StringTokenizer(str2,"|");
name=tz.nextElement().toString();
rollno=tz.nextElement().toString();
age=tz.nextElement().toString();
branch=tz.nextElement().toString();
pos1++;
t1.setText(name);
t2.setText(rollno);
t3.setText(age);
t4.setText(branch);
t5.setText("next record is");
}
}
if(e.getSource()==b3)
{
if(pos2==-1)
{
t5.setText("no previous records");
t1.setText(null);
t2.setText(null);
t3.setText(null);
t4.setText(null);
}
else
{
f.seek(arr[pos2]);
String str2=f.readLine();
StringTokenizer tz=new StringTokenizer(str2,"|");
name=tz.nextElement().toString();
rollno=tz.nextElement().toString();
age=tz.nextElement().toString();
branch=tz.nextElement().toString();
pos2--;
t1.setText(name);
t2.setText(rollno);
t3.setText(age);
t4.setText(branch);
t5.setText("prev record is");
}
}
}
catch(IOException e1)
{
System.out.println(e1);
}
}
public static void main(String args[])
{
addressbook4 c=new addressbook4();
c.setSize(400,400);
c.setVisible(true);
c.setTitle("address book");
}
}

