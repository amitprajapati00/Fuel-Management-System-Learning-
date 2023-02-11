import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Fuelsale implements ActionListener,KeyListener
{
JFrame f;
JLabel l1,l2,l3,l4;
JComboBox t1;
JTextField t2,t3,t4;
JButton b1,b2,b3;
Font f1;
Connection con;
ResultSet rs;
PreparedStatement st;
ImageIcon im;
String fuel,qunty,amt,rate;

Fuelsale()
{
f=new JFrame("Fuel Sales");
f.setSize(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

im=new ImageIcon("fuelsale.jpg");
JLabel bg=new JLabel("",JLabel.CENTER);
bg.setBounds(0,0,500,500);
f.add(bg);

f1=new Font("Arial Black",Font.BOLD,14);

l1=new JLabel("Fuel");
l1.setBounds(50,50,100,30);
l1.setFont(f1);
l1.setForeground(Color.BLUE);
bg.add(l1);

t1=new JComboBox();
t1.setBounds(250,50,200,30);
t1.addItem("Petrole");
t1.addItem("Diesel");
t1.setFont(f1);
//t1.addKeyListener(this);
bg.add(t1);

l2=new JLabel("Quantity");
l2.setBounds(50,130,100,30);
l2.setFont(f1);
l2.setForeground(Color.BLUE);
bg.add(l2);

t2=new JTextField();
t2.setBounds(250,130,200,30);
t2.setFont(f1);
t2.addKeyListener(this);
bg.add(t2);

l3=new JLabel("Amount");
l3.setBounds(50,210,100,30);
l3.setFont(f1);
l3.setForeground(Color.BLUE);
bg.add(l3);

t3=new JTextField();
t3.setBounds(250,210,200,30);
t2.setFont(f1);
t3.addKeyListener(this);
bg.add(t3);

l4=new JLabel("Rate");
l4.setBounds(50,290,200,30);
l4.setFont(f1);
l4.setForeground(Color.BLUE);
bg.add(l4);

t4=new JTextField();
t4.setBounds(250,290,200,30);
t4.setFont(f1);
t4.addKeyListener(this);
bg.add(t4);

b1=new JButton("Back");
b1.setBounds(50,400,100,30);
b1.setForeground(Color.BLACK);
b1.setFont(f1);
b1.addActionListener(this);
bg.add(b1);

b2=new JButton("Clear");
b2.setBounds(200,400,100,30);
b2.setForeground(Color.BLACK);
b2.setFont(f1);
b2.addActionListener(this);
bg.add(b2);

b3=new JButton("Submit");
b3.setBounds(350,400,100,30);
b3.setForeground(Color.BLACK);
b3.setFont(f1);
b3.addActionListener(this);
bg.add(b3);

try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/fuelproject","root","");
}//try
catch(Exception e)
{
System.out.println(e);
}//catch

f.setVisible(true);
}//constructor

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{
t2.setText("");
t3.setText("");
t4.setText("");
t1.requestFocus();
}//b2

else if(ae.getSource()==b1)
{
Main l=new Main();
f.dispose();
}//b1

else if(ae.getSource()==b3)
{
fuel=t1.getSelectedItem().ToString();
qunty=t2.getText();
amt=t3.getText();
rate=t4.getText();
try
{
st=con.prepareStatement("insert into fuel values(?,?,?,?)");

st.setString(1,fuel);
st.setString(2,qunty);
st.setString(3,amt);
st.setString(4,rate);
st.executeUpdate();
JOptionPane.showMessageDialog(f,"Fuel Filling Successfully");

t2.setText("");
t3.setText("");
t4.setText("");
t1.requestFocus();

}//try
catch(Exception e)
{
System.out.print(e);
}//catch

}//b3

}//action method

public void keyPressed(KeyEvent ke)
{
}

public void keyReleased(KeyEvent ke)
{
}

public void keyTyped(KeyEvent ke)
{
if(ke.getSource()==t2)
{
char c=ke.getKeyChar();
if(c>='0' && c<='9') 
{

}

else {

ke.consume();
}}

else if(ke.getSource()==t3)
{
char c=ke.getKeyChar();
if(c>='0' && c<='9')
{

}

else {

ke.consume();
}
}
else if(ke.getSource()==t4)
{
char c=ke.getKeyChar();
if(c>='0' && c<='9')
{

}

else {

ke.consume();
}
}

}//class
}
class FuelsaleDemo
{
public static void main(String[] a)
{       
Fuelsale l=new Fuelsale();
}
} 
